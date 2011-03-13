/*
 * Copyright 2009 The Fornax Project Team, including the original
 * author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fornax.cartridges.sculptor.framework.accessapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria.Operator;
import org.fornax.cartridges.sculptor.framework.domain.Property;

/**
 * Expression Builder for ConditionalCriteria. A small internal DSL (fluent
 * interface) for creating criteria conditions.
 *
 * @author Patrik Nordwall
 *
 * @param <T>
 *            root type of criteria
 */
public class ConditionalCriteriaBuilder<T> {

    private enum ExpressionOperator {
        Not, Or, And, LBrace
    }

    private ConditionalCriteriaBuilder() {
    }

    public static <T> ConditionRoot<T> criteriaFor(Class<T> clazz) {
        return new ConditionalCriteriaBuilder<T>().new RootBuilderImpl();
    }

    public class RootBuilderImpl implements ConditionRoot<T>, OrderBy<T> {
        private final SimpleStack<ConditionalCriteria> criteriaStack = new SimpleStack<ConditionalCriteria>();
        private final SimpleStack<ExpressionOperator> operatorStack = new SimpleStack<ExpressionOperator>();

        // only used to give good error message
        private int braceCount;

        /**
         * End the expression with this build
         */
      @SuppressWarnings("unchecked")
      public List<ConditionalCriteria> build() {
            assertBraceCount();
            assertOperatorStack();

            List<ConditionalCriteria> critList = new ArrayList<ConditionalCriteria>();
            for (ConditionalCriteria singleCrit : criteriaStack.asList()) {
                if (singleCrit.getOperator() == Operator.And) {
                   if (singleCrit.getFirstOperant() instanceof List) {
                      critList.addAll( (List<ConditionalCriteria>) singleCrit.getFirstOperant() );
                   } else {
                      critList.add( (ConditionalCriteria) singleCrit.getFirstOperant() );
                      critList.add( (ConditionalCriteria) singleCrit.getSecondOperant() );
                   }
               } else {
                  critList.add(singleCrit);
               }
            }
            return critList;
        }

        /**
         * Easier to use from test
         */
        public ConditionalCriteria buildSingle() {
            assertBraceCount();
            assertOperatorStack();
            if (criteriaStack.size() > 1) {
                throw new IllegalStateException("Invalid criteria, too many items in the build stack: "
                        + criteriaStack.size());
            }
            if (criteriaStack.isEmpty()) {
                return null;
            }
            return criteriaStack.peek();
        }

        private void assertBraceCount() {
            if (braceCount != 0) {
                throw new IllegalStateException("Unmatched braces. "
                        + (braceCount > 0 ? ("Missing " + braceCount + " rbrace") : (braceCount + " too many rbrace")));
            }
        }

        private void assertOperatorStack() {
            if (!operatorStack.isEmpty()) {
                throw new IllegalStateException("Expected all operators completed, got: " + operatorStack.size()
                        + " left: " + operatorStack.peek());
            }
        }

        public CondditionProperty<T> withProperty(Property<T> property) {
            if (operatorStack.isEmpty() && !criteriaStack.isEmpty()) {
                // implicit and condition
                and();
            }
            return new PropBuilderImpl(property);
        }

        public ConditionRoot<T> and() {
            operatorStack.push(ExpressionOperator.And);
            return this;
        }

        public ConditionRoot<T> or() {
            operatorStack.push(ExpressionOperator.Or);
            return this;
        }

        public ConditionRoot<T> not() {
            operatorStack.push(ExpressionOperator.Not);
            return this;
        }

        public OrderBy<T> orderBy(Property<T> property) {
            pushCriteria(ConditionalCriteria.orderAsc(property));
            return this;
        }

        public ConditionRoot<T> distinctRoot() {
            pushCriteria(ConditionalCriteria.distinctRoot());
            return this;
        }

        public ConditionRoot<T> projectionRoot() {
           pushCriteria(ConditionalCriteria.projectionRoot());
           return this;
       }

        public ConditionRoot<T> ascending() {
            // syntactic sugar
            return this;
        }

        public ConditionRoot<T> descending() {
            ConditionalCriteria last = popCriteria();
            if (last.getOperator() != Operator.OrderAsc) {
                throw new IllegalStateException("descending can only be used after orderBy");
            }
            pushCriteria(ConditionalCriteria.orderDesc(last.property));
            return this;
        }

        public ConditionRoot<T> lbrace() {
            braceCount++;
            operatorStack.push(ExpressionOperator.LBrace);
            return this;
        }

        public ConditionRoot<T> rbrace() {
            braceCount--;
            operatorStack.pop();
            if (criteriaStack.isEmpty()) {
                return this;
            }
            ConditionalCriteria lastCriteria = popCriteria();
            pushCriteria(lastCriteria);
            return this;
        }

        private ConditionalCriteria popCriteria() {
            return criteriaStack.pop();
        }

      @SuppressWarnings("unchecked")
      private void pushCriteria(ConditionalCriteria criteria) {
            ExpressionOperator currentOperator = operatorStack.peek();
            if (currentOperator == ExpressionOperator.Or || currentOperator == ExpressionOperator.And) {
                ConditionalCriteria compositeCriteria;
                if (currentOperator == ExpressionOperator.Or) {
                    compositeCriteria = ConditionalCriteria.or(popCriteria(), criteria);
                } else {
                    ConditionalCriteria popCriteria = popCriteria();
                    if (popCriteria.getOperator() == Operator.And && popCriteria.getFirstOperant() instanceof List) {
                        ((List<ConditionalCriteria>) popCriteria.getFirstOperant()).add(criteria);
                        compositeCriteria = popCriteria;
                    } else if (popCriteria.getOperator() == Operator.And) {
                       List<ConditionalCriteria> critList=new ArrayList<ConditionalCriteria>();
                       critList.add((ConditionalCriteria) popCriteria.getFirstOperant());
                       critList.add((ConditionalCriteria) popCriteria.getSecondOperant());
                       critList.add(criteria);
                       compositeCriteria = ConditionalCriteria.and(critList);
                    } else {
                       compositeCriteria = ConditionalCriteria.and(popCriteria, criteria);
                    }
                }
                criteriaStack.push(compositeCriteria);
                operatorStack.pop();
            } else if (currentOperator == ExpressionOperator.Not) {
                ConditionalCriteria notCriteria = ConditionalCriteria.not(criteria);
                criteriaStack.push(notCriteria);
                operatorStack.pop();
                if (!operatorStack.isEmpty() && !criteriaStack.isEmpty()) {
                    pushCriteria(criteriaStack.pop());
                }
            } else if (currentOperator == ExpressionOperator.LBrace) {
                criteriaStack.push(criteria);
            } else {
                criteriaStack.push(criteria);
            }
        }

        private class PropBuilderImpl implements CondditionProperty<T>, Between<T> {
            Property<?> baseProp;
            Object value1;

            PropBuilderImpl(Property<?> name) {
                this.baseProp = name;
            }

            public ConditionRoot<T> eq(Object value) {
                pushCriteria(ConditionalCriteria.equal(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> ignoreCaseEq(Object value) {
               pushCriteria(ConditionalCriteria.ignoreCaseEqual(baseProp, value));
               return RootBuilderImpl.this;
            }

            public ConditionRoot<T> eq(Property<T> property) {
                pushCriteria(ConditionalCriteria.equalProperty(baseProp, property));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> between(Object value1, Object value2) {
                pushCriteria(ConditionalCriteria.between(baseProp, value1, value2));
                return RootBuilderImpl.this;
            }

            public Between<T> between(Object value1) {
                this.value1 = value1;
                return this;
            }

            public ConditionRoot<T> to(Object value2) {
                pushCriteria(ConditionalCriteria.between(baseProp, value1, value2));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> lessThan(Object value) {
                pushCriteria(ConditionalCriteria.lessThan(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> lessThanOrEqual(Object value) {
                pushCriteria(ConditionalCriteria.lessThanOrEqual(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> greaterThan(Object value) {
                pushCriteria(ConditionalCriteria.greatThan(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> greaterThanOrEqual(Object value) {
                pushCriteria(ConditionalCriteria.greatThanOrEqual(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> lessThan(Property<T> property) {
                pushCriteria(ConditionalCriteria.lessThanProperty(baseProp, property));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> lessThanOrEqual(Property<T> property) {
                pushCriteria(ConditionalCriteria.lessThanOrEqualProperty(baseProp, property));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> greaterThan(Property<T> property) {
                pushCriteria(ConditionalCriteria.greatThanProperty(baseProp, property));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> greaterThanOrEqual(Property<T> property) {
                pushCriteria(ConditionalCriteria.greatThanOrEqualProperty(baseProp, property));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> like(Object value) {
                pushCriteria(ConditionalCriteria.like(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> ignoreCaseLike(Object value) {
                pushCriteria(ConditionalCriteria.ignoreCaseLike(baseProp, value));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> in(Object... values) {
                pushCriteria(ConditionalCriteria.in(baseProp, values));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> in(Collection<?> values) {
                pushCriteria(ConditionalCriteria.in(baseProp, values));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> isNull() {
                pushCriteria(ConditionalCriteria.isNull(baseProp));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> isNotNull() {
                pushCriteria(ConditionalCriteria.isNotNull(baseProp));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> isEmpty() {
                pushCriteria(ConditionalCriteria.isEmpty(baseProp));
                return RootBuilderImpl.this;
            }

            public ConditionRoot<T> isNotEmpty() {
               pushCriteria(ConditionalCriteria.isNotEmpty(baseProp));
               return RootBuilderImpl.this;
           }

            public ConditionRoot<T> fetchEager() {
               pushCriteria(ConditionalCriteria.fetchEager(baseProp));
               return RootBuilderImpl.this;
           }

            public ConditionRoot<T> fetchLazy() {
               pushCriteria(ConditionalCriteria.fetchLazy(baseProp));
               return RootBuilderImpl.this;
           }
        }

    }

    public interface ConditionRoot<T> {
        List<ConditionalCriteria> build();
        ConditionalCriteria buildSingle();
        CondditionProperty<T> withProperty(Property<T> property);
        ConditionRoot<T> and();
        ConditionRoot<T> or();
        ConditionRoot<T> not();
        OrderBy<T> orderBy(Property<T> property);
        ConditionRoot<T> distinctRoot();
        ConditionRoot<T> projectionRoot();
        ConditionRoot<T> lbrace();
        ConditionRoot<T> rbrace();
    }

    public interface CondditionProperty<T> {
        ConditionRoot<T> eq(Object value);
        ConditionRoot<T> ignoreCaseEq(Object value);
        ConditionRoot<T> eq(Property<T> property);
        ConditionRoot<T> between(Object value1, Object value2);
        Between<T> between(Object value1);
        ConditionRoot<T> lessThan(Object value);
        ConditionRoot<T> lessThanOrEqual(Object value);
        ConditionRoot<T> greaterThan(Object value);
        ConditionRoot<T> greaterThanOrEqual(Object value);
        ConditionRoot<T> lessThan(Property<T> property);
        ConditionRoot<T> lessThanOrEqual(Property<T> property);
        ConditionRoot<T> greaterThan(Property<T> property);
        ConditionRoot<T> greaterThanOrEqual(Property<T> property);
        ConditionRoot<T> like(Object value);
        ConditionRoot<T> ignoreCaseLike(Object value);
        ConditionRoot<T> in(Object... values);
        ConditionRoot<T> in(Collection<?> values);
        ConditionRoot<T> isNull();
        ConditionRoot<T> isNotNull();
        ConditionRoot<T> isEmpty();
        ConditionRoot<T> isNotEmpty();
        ConditionRoot<T> fetchLazy();
        ConditionRoot<T> fetchEager();
    }

    public interface Between<T> {
        ConditionRoot<T> to(Object value2);
    }

    public interface OrderBy<T> extends ConditionRoot<T> {
        ConditionRoot<T> ascending();
        ConditionRoot<T> descending();
    }

    private static class SimpleStack<T> {
        private final List<T> list = new ArrayList<T>();

        T pop() {
            if (list.isEmpty()) {
                throw new IllegalStateException("Can't pop from empty stack.");
            }
            return list.remove(list.size() - 1);
        }

        public List<T> asList() {
            return new ArrayList<T>(list);
        }

        T peek() {
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }

        void push(T item) {
            list.add(item);
        }

        int size() {
            return list.size();
        }

        public boolean isEmpty() {
            return size() == 0;
        }
    }

}
