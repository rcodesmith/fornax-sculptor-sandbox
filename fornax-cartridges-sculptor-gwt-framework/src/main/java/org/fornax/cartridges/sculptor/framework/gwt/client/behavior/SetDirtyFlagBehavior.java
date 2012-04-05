package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlag;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.Behavior.BehaviorCompletion;

public class SetDirtyFlagBehavior {
	HasDirtyFlag hasDirty;
	
	public SetDirtyFlagBehavior(HasDirtyFlag hasDirty) {
		super();
		this.hasDirty = hasDirty;
	}

	protected void invoke(BehaviorCompletion completion, boolean dirtyFlagValue) {
		hasDirty.setDirtyFlag(dirtyFlagValue);
		completion.complete(true);
	}

}
