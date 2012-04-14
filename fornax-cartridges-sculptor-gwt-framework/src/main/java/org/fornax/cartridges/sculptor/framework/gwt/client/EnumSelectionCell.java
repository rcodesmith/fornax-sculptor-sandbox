package org.fornax.cartridges.sculptor.framework.gwt.client;

import java.util.EnumSet;

public class EnumSelectionCell<T extends Enum<T>> extends TypedSelectionCell<T> {

    protected Class<T> enumClass;
    
    public EnumSelectionCell (Class<T> eclass)
    {
        this(eclass, EnumSet.allOf(eclass));
    }

    public EnumSelectionCell (Class<T> enumClass, EnumSet<T> enumElements)
    {
        super(EnumValues.getNamesFor(enumElements));
        this.enumClass = enumClass;
    }


}
