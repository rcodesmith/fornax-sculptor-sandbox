package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlag;

import com.google.gwt.user.client.Window;

public class ConfirmIfDirtyBehavior implements Behavior {

	protected String message = "Screen has unsaved changes, are you sure you wish to continue?";
	
	protected HasDirtyFlag hasDirty;
	
	
	public ConfirmIfDirtyBehavior(HasDirtyFlag hasDirty, String message) {
		super();
		
		if(message != null) {
			this.message = message;
		}
		this.hasDirty = hasDirty;
	}

	@Override
	public void invoke(BehaviorCompletion completion) {
		if(hasDirty.isDirty()) {
			completion.complete(Window.confirm(message));
		} else {
			completion.complete(true);
		}
	}

}
