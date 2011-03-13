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

package org.fornax.cartridges.sculptor.framework.accessimpl.jpahibernate;

import java.util.List;

import javax.persistence.PersistenceException;

import org.fornax.cartridges.sculptor.framework.accessapi.ColumnStat;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionStatAccess;
import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

/**
 * <p>
 * Implementation of Access command FindByCriteriaAccess.
 * </p>
 * <p>
 * Command design pattern.
 * </p>
 */
public class JpaHibFindByConditionStatAccessImpl<T> extends JpaHibFindByConditionAccessImpl<T>
		implements FindByConditionStatAccess<T> {
	private List<ColumnStat<T>> statResult;

	public JpaHibFindByConditionStatAccessImpl(Class<T> persistentClass) {
		super(persistentClass);
	}

	public void setColumnStat(List<ColumnStat<T>> columnStat) {
		statResult=columnStat;
	}

	@Override
	public void execute() throws PersistenceException {
		Criteria criteria = createCriteria();
		prepareCache(criteria);

		// Prepare where clause
		addSubCriterias(criteria);
		addConditionalCriteria(criteria);

		addResultTransformer(criteria);

		addStatProjection(criteria);

		Object[] uniqResult = (Object[]) criteria.uniqueResult();
		extractStatResult(uniqResult);
	}

	public List<ColumnStat<T>> getSingleResult() {
		return this.statResult;
	}

	private void addStatProjection(Criteria criteria) throws PersistenceException {
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.rowCount());
		for (ColumnStat<T> column : statResult) {
			if ( column.isCountNotNullFlag()) {
				projList.add(Projections.count(column.getColumn().getName()));
			}
			if ( column.isMinFlag() ) {
				projList.add(Projections.min(column.getColumn().getName()));
			}
			if ( column.isMaxFlag() ) {
				projList.add(Projections.max(column.getColumn().getName()));
			}
			if ( column.isAverageFlag() ) {
				projList.add(Projections.avg(column.getColumn().getName()));
			}
			if ( column.isSumFlag() ) {
				projList.add(Projections.sum(column.getColumn().getName()));
			}
		}

		criteria.setProjection(projList);
	}

	private void extractStatResult(Object[] colResults) {
		Long totalCount=((Integer) colResults[0]).longValue();
		int i=1;
		for (ColumnStat<T> column : statResult) {
			Long columnCount=null;
			Double min=null;
			Double max=null;
			Double avg=null;
			Double sum=null;
			String minString=null;
			String maxString=null;

			if ( column.isCountNotNullFlag() ) {
				columnCount=((Integer) colResults[i++]).longValue();
			}
			if ( column.isMinFlag() ) {
				Object minResult = colResults[i++];
				if (minResult == null) {
					min=null;
					minString=null;
				} else if (minResult instanceof Number) {
					min=((Number) minResult).doubleValue();
					minString=min.toString();
				} else {
					min=null;
					minString=minResult.toString();
				}
			}
			if ( column.isMaxFlag() ) {
				Object maxResult = colResults[i++];
				if (maxResult == null) {
					max=null;
					maxString=null;
				} else if (maxResult instanceof Number) {
					max=((Number) maxResult).doubleValue();
					maxString=max.toString();
				} else {
					max=null;
					maxString=maxResult.toString();
				}
			}
			if ( column.isAverageFlag() ) {
				avg=(Double) colResults[i++];
			}
			if ( column.isSumFlag() ) {
				Object sumResult=colResults[i++];
				sum= sumResult == null ? null : new Double(sumResult.toString());
			}
			if (min != null || max != null) {
				column.setResultNum(totalCount, columnCount, min, max, avg, sum);
			} else {
				column.setResultString(totalCount, columnCount, minString, maxString, avg, sum);
			}
		}
	}

	public void setUseSingleResult(boolean useSingleResult) {
		// It's always using single result
		// Only for compatibility with other generic access methods
	}

}