/*
 * Copyright 2010 The Fornax Project Team, including the original
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

package org.fornax.cartridges.sculptor.framework.accessimpl.jpa;

import java.util.List;

import javax.persistence.PersistenceException;

import org.fornax.cartridges.sculptor.framework.accessapi.ColumnStat;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.accessapi.FindByConditionStatAccess;


/**
 * <p>
 * Implementation of Access command FindByConditionStatAccess.
 * </p>
 * <p>
 * Command design pattern.
 * </p>
 */
public class JpaFindByConditionStatAccessImpl<T> extends JpaAccessBase<T> implements FindByConditionStatAccess<T> {

	public JpaFindByConditionStatAccessImpl(Class<T> persistentClass) {
		// Do nothing
	}

	public void setCondition(List<ConditionalCriteria> criteria) {
		// Do nothing
	}

	public void addCondition(ConditionalCriteria criteria) {
		// Do nothing
	}

	public void setColumnStat(List<ColumnStat<T>> columnStat) {
		// Do nothing
	}

	public void setUseSingleResult(boolean useSingleResult) {
		// Do nothing
	}

	@Override
	public void performExecute() throws PersistenceException {
		// JPA 2.0 will contain criteria API similar to Hibernate criteria API
		// Till then we can't support this
		throw new UnsupportedOperationException("FindByConditionStat is not supported with JPA binding.");
	}

	public List<ColumnStat<T>> getSingleResult() {
		// JPA 2.0 will contain criteria API similar to Hibernate criteria API
		// Till then we can't support this
		throw new UnsupportedOperationException("FindByConditionStat is not supported with JPA binding.");
	}
}