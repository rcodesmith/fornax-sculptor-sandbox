package org.fornax.cartridges.sculptor.framework.gwt.client;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumValues<T extends Enum<T>> {
	protected Map<String,T> enumNameLookup = new HashMap<String, T>();

	public EnumValues(Map<String, T> enumNameLookup) {
		super();
		this.enumNameLookup = enumNameLookup;
	}
	
    public EnumValues (Class<T> eclass)
    {
        this(EnumSet.allOf(eclass));
    }

	public EnumValues(EnumSet<T> enumElements) {
        for (T value : enumElements) {
        	enumNameLookup.put(value.name(), value);
        }

	}
	
	
	
    public static <J extends Enum<J>> List<String> getNamesFor(EnumSet<J> enumElements) {
    	List<String> enumNames = new ArrayList<String>();
    	
        for (J value : enumElements) {
        	enumNames.add(value.toString());
        }
        
        return enumNames;
    }

	
	
}
