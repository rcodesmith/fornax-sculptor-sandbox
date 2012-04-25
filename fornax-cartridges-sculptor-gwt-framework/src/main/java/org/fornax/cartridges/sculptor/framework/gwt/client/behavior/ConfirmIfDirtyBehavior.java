package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

import com.google.gwt.user.client.Window;

public class ConfirmIfDirtyBehavior implements Behavior {

	protected String message = "Screen has unsaved changes, are you sure you wish to continue?";
	
	protected HasDirtyFlags hasDirty;
	
	
	public ConfirmIfDirtyBehavior(HasDirtyFlags hasDirty, String message) {
		super();
		
		if(message != null) {
			this.message = message;
		}
		this.hasDirty = hasDirty;
	}

	@Override
	public void invoke(BehaviorCompletion completion, BehaviorDispatcher.Event event) {
		if(hasDirty.isDirty()) {
			completion.complete(Window.confirm(message), event);
		} else {
			completion.complete(true, event);
		}
	}

}
