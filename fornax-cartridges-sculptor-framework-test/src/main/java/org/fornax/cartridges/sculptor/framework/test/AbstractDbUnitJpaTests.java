/*
 * Copyright 2007 The Fornax Project Team, including the original
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

package org.fornax.cartridges.sculptor.framework.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.orm.jpa.SharedEntityManagerCreator;
import org.springframework.test.context.transaction.BeforeTransaction;

/**
 * Base class for transactional spring-based DBUnit tests in a JPA environment.
 * 
 * <p>
 * Override the method {@link #getDataSetFile} to specify XML file with DBUnit
 * test data.
 * 
 * @author Patrik Nordwall
 * @author Oliver Ringel
 * 
 */
public abstract class AbstractDbUnitJpaTests extends AbstractDbUnitAnnotationAwareTransactionalTests {

    private EntityManager entityManager;

    public AbstractDbUnitJpaTests() {
    }

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManager = SharedEntityManagerCreator.createSharedEntityManager(entityManagerFactory);
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * flushes the entity manager to get the correct result via jdbc
     */
    protected void flush() {
        getEntityManager().flush();
    }

    /**
     * Counts the number of rows from a table via jdbc. Table name is picked for @Table
     * annotation of the domainObjectClass
     * 
     * @param domainObjectClass
     *            persistent class defining the name of the table for counting
     *            rows
     * @param condition
     *            additional condition
     * @return number of rows
     */
    @Override
    protected int countRowsInTable(Class<?> domainObjectClass, String condition) throws Exception {
        flush();
        return super.countRowsInTable(domainObjectClass, condition);
    }

    /**
     * counts the number of rows from a table via jdbc
     * 
     * @param tableName
     *            name of the table for counting rows
     * @param condition
     *            additional condition
     * @return number of rows
     */
    @Override
    protected int countRowsInTable(String tableName, String condition) {
        flush();
        return super.countRowsInTable(tableName, condition);
    }

    private static boolean schemaCreated = false;

    /**
     * Workaround for DataNucleus together with DBUnit.
     * 
     * @throws Exception
     */
    @BeforeTransaction
    public void createSchema() throws Exception {
        if (getApplicationContext().getResource("file:target/datanucleus_ddl.sql").exists() && !schemaCreated) {
            executeSqlScript("file:target/datanucleus_ddl.sql", true);
            schemaCreated = true;
        }
    }

}
