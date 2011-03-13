package org.fornax.cartridges.sculptor.examples.library.media.domain;

import static org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteriaBuilder.criteriaFor;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.fornax.cartridges.sculptor.examples.library.util.JpaProviderHelper;
import org.fornax.cartridges.sculptor.framework.accessapi.ConditionalCriteria;
import org.fornax.cartridges.sculptor.framework.domain.PagedResult;
import org.fornax.cartridges.sculptor.framework.domain.PagingParameter;
import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Assume;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class PhysicalMediaRepositoryTest extends AbstractDbUnitJpaTests {

    private PhysicalMediaRepository physicalMediaRepository;

    @Autowired
    public void setPhysicalMediaRepository(PhysicalMediaRepository physicalMediaRepository) {
        this.physicalMediaRepository = physicalMediaRepository;
    }

    @Override
    protected String getDataSetFile() {
        if (JpaProviderHelper.isEclipselinkJpaProvider(getEntityManager())) {
            return "dbunit/LibraryServiceTest_eclipselink.xml";
        }
        return "dbunit/LibraryServiceTest.xml";
    }

    @Test
    public void testFindByNestedCondition() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(PhysicalMedia.class).withProperty(
                PhysicalMediaProperties.library().name()).eq("LibraryServiceTest").build();
        PagingParameter pParam = PagingParameter.rowAccess(0, 100);
        PagedResult<PhysicalMedia> pResult = physicalMediaRepository.findByCondition(conditionalCriteria, pParam);
        assertEquals(2, pResult.getValues().size());
    }

    @Test
    public void testFindByNestedCondition2() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        List<ConditionalCriteria> conditionalCriteria = criteriaFor(PhysicalMedia.class).withProperty(
                PhysicalMediaProperties.library().name()).eq("LibraryServiceTest").and().withProperty(
                PhysicalMediaProperties.status()).eq("A").build();
        PagingParameter pParam = PagingParameter.rowAccess(0, 100);
        PagedResult<PhysicalMedia> pResult = physicalMediaRepository.findByCondition(conditionalCriteria, pParam);
        assertEquals(2, pResult.getValues().size());
    }

    @Test
    public void testFindByNestedCondition3() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        ConditionalCriteria condition1 = criteriaFor(PhysicalMedia.class).withProperty(
                PhysicalMediaProperties.library().name()).eq("LibraryServiceTest").buildSingle();
        ConditionalCriteria condition2 = criteriaFor(PhysicalMedia.class)
                .withProperty(PhysicalMediaProperties.status()).eq("A").buildSingle();
        ArrayList<ConditionalCriteria> conditionalCriteria = new ArrayList<ConditionalCriteria>();
        conditionalCriteria.add(condition1);
        conditionalCriteria.add(condition2);
        PagingParameter pParam = PagingParameter.rowAccess(0, 100);
        PagedResult<PhysicalMedia> pResult = physicalMediaRepository.findByCondition(conditionalCriteria, pParam);
        assertEquals(2, pResult.getValues().size());
    }

    @Test
    public void testFindByNestedCondition3WithCount() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        ConditionalCriteria condition1 = criteriaFor(PhysicalMedia.class).withProperty(
                PhysicalMediaProperties.library().name()).eq("LibraryServiceTest").buildSingle();
        ConditionalCriteria condition2 = criteriaFor(PhysicalMedia.class)
                .withProperty(PhysicalMediaProperties.status()).eq("A").buildSingle();
        ArrayList<ConditionalCriteria> conditionalCriteria = new ArrayList<ConditionalCriteria>();
        conditionalCriteria.add(condition1);
        conditionalCriteria.add(condition2);
        PagingParameter pParam = PagingParameter.rowAccess(0, 1, true);
        PagedResult<PhysicalMedia> pResult = physicalMediaRepository.findByCondition(conditionalCriteria, pParam);
        assertEquals(2, pResult.getTotalRows());
    }

    @Test
    public void testFindByNestedCondition4() throws Exception {
        Assume.assumeTrue(JpaProviderHelper.isHibernateJpaProvider(getEntityManager()));
        ConditionalCriteria condition1 = criteriaFor(PhysicalMedia.class).withProperty(
                PhysicalMediaProperties.library().media().status()).eq("A").buildSingle();
        ArrayList<ConditionalCriteria> conditionalCriteria = new ArrayList<ConditionalCriteria>();
        conditionalCriteria.add(condition1);

        PagingParameter pParam = PagingParameter.rowAccess(0, 1, true);
        PagedResult<PhysicalMedia> pResult = physicalMediaRepository.findByCondition(conditionalCriteria, pParam);
        assertEquals(6, pResult.getTotalRows());
    }
}
