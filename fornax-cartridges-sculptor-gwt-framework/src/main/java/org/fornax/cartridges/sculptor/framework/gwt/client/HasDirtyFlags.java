package org.fornax.cartridges.sculptor.framework.gwt.client;

public interface HasDirtyFlags {
	
	public void setDirty(Object obj, Boolean isDirty);
	
	public Boolean isDirty(Object obj);

	public boolean isDirty();
	
	public void setDirtyFlag(boolean isDirty);
	
	public void clearAllDirtyFlags();
}
