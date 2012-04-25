package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

public class MarkCleanBehavior extends SetDirtyFlagBehavior implements Behavior {

	public MarkCleanBehavior(HasDirtyFlags hasDirty) {
		super(hasDirty, false);
	}

	@Override
	public void invoke(BehaviorCompletion completion, BehaviorDispatcher.Event event) {
		invoke(completion, event);
	}

}
