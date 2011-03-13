package org.fornax.cartridges.sculptor.framework.accessapi;

/**
 * Access Objects that return an ordered result 
 * may implement this interface.
 *
 */
public interface Ordered {
    
    /**
     * Order the result by this property name.
     */
    void setOrderBy(String orderBy);

    /**
     * Order ascending or descending.
     */
    void setOrderByAsc(boolean orderByAsc);

}
