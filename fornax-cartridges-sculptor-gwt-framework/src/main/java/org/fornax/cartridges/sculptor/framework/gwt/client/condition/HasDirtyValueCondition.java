package org.fornax.cartridges.sculptor.framework.gwt.client.condition;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

public class HasDirtyValueCondition implements Condition {

	private HasDirtyFlags hasDirty;
	private boolean dirtyValue;
	
	public HasDirtyValueCondition(HasDirtyFlags hasDirty, boolean dirtyValue) {
		this.hasDirty = hasDirty;
		this.dirtyValue = dirtyValue;
	}
	
	public boolean isTrue() {
		return (hasDirty.isDirty() == dirtyValue);
	}
}
