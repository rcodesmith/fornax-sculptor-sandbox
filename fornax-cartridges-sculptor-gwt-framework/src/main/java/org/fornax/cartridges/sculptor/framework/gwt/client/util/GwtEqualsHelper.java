package org.fornax.cartridges.sculptor.framework.gwt.client.util;

import java.math.BigDecimal;

/**
 * Utility class for comparing two Objects for equality, including null check.
 * Ron: Copied from fornax sculptor
 * @author Patrik Nordwall
 */
public class GwtEqualsHelper {

    private GwtEqualsHelper() {
    }

    public static boolean equals(Object obj1, Object obj2) {
        if (obj1 == obj2) {
            return true;
        }
        if (obj1 == null) {
            return false;
        }
        if (obj1 instanceof BigDecimal && obj2 instanceof BigDecimal) {
            return ((BigDecimal) obj1).compareTo((BigDecimal) obj2) == 0;
        }

        return obj1.equals(obj2);
    }

    public static int computeHashCode(final Object o) {
        if (null == o) {
            return 19;
        }
        if (o.getClass().isArray()) {
            return 0;
        }
        return o.hashCode();
    }
}
