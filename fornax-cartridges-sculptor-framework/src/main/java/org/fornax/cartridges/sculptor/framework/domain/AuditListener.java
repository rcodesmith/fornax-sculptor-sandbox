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

package org.fornax.cartridges.sculptor.framework.domain;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore;


/**
 * This Listener will be invoked when objects are saved and it will
 * automatically update properties 'lastUpdated', 'lastUpdatedBy', 'created'
 * and 'createdBy' for objects implementing
 * {@link org.fornax.cartridges.sculptor.framework.domain.Auditable}.
 * <p>
 * It will grab the user from
 * {@link org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext} provided by
 * {@link org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore}.
 *
 */
public class AuditListener  {

	/**
	 * set audit informations, doesn't modify createdDate and createdBy once set.
	 * Only works with DomainObjects that implement the Auditable interface. In other cases
	 * a IllegalArgumentException is thrown.
	 *
	 * @param entity
	 * @return
	 */
    @SuppressWarnings("unused")
    @PreUpdate
    @PrePersist
    private void changeAuditInformation(Auditable auditableEntity) {
        auditableEntity.setLastUpdated(new Date());
        String lastUpdatedBy = ServiceContextStore.getCurrentUser();
        auditableEntity.setLastUpdatedBy(lastUpdatedBy);
        if (auditableEntity.getCreatedDate() == null)
            auditableEntity.setCreatedDate(auditableEntity.getLastUpdated());
        if (auditableEntity.getCreatedBy() == null)
            auditableEntity.setCreatedBy(auditableEntity.getLastUpdatedBy());
    }
}
