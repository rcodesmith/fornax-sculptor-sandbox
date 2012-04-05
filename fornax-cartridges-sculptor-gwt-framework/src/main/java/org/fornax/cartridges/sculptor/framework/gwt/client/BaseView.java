package org.fornax.cartridges.sculptor.framework.gwt.client;

public abstract class BaseView extends com.google.gwt.user.client.ui.Composite implements HasDirtyFlag {

	protected boolean dirty = false;
	
	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public void setDirtyFlag(boolean isDirty) {
		dirty = isDirty;
	}

	
}
