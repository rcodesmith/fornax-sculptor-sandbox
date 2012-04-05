package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlag;

public class MarkCleanBehavior extends SetDirtyFlagBehavior implements Behavior {

	public MarkCleanBehavior(HasDirtyFlag hasDirty) {
		super(hasDirty);
	}

	@Override
	public void invoke(BehaviorCompletion completion) {
		invoke(completion, false);
	}

}
