package org.fornax.cartridges.sculptor.examples.library.util;
import javax.persistence.EntityManager;


public class JpaProviderHelper {

    private JpaProviderHelper() {
    }

    public static boolean isHibernateJpaProvider(EntityManager entityManager) {
        return entityManager.getDelegate().getClass().getName().toLowerCase().contains("hibernate");
    }

    public static boolean isEclipselinkJpaProvider(EntityManager entityManager) {
        return entityManager.getDelegate().getClass().getName().toLowerCase().contains("eclipse");
    }

}
