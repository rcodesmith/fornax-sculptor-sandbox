package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlag;

public class MarkDirtyBehavior extends SetDirtyFlagBehavior implements Behavior {
	
	public MarkDirtyBehavior(HasDirtyFlag hasDirty) {
		super(hasDirty);
	}

	@Override
	public void invoke(BehaviorCompletion completion) {
		hasDirty.setDirtyFlag(true);
		completion.complete(true);
	}

}
