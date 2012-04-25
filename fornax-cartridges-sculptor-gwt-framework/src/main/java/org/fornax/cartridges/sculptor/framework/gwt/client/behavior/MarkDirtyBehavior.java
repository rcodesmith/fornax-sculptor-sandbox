package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

public class MarkDirtyBehavior extends SetDirtyFlagBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(MarkDirtyBehavior.class.getName());

	public MarkDirtyBehavior(HasDirtyFlags hasDirty) {
		super(hasDirty, true);
	}

	public MarkDirtyBehavior(HasDirtyFlags hasDirty,
			Boolean markSpecificObjectDirty) {
		super(hasDirty, true, markSpecificObjectDirty);
	}

//	@Override
//	public void invoke(BehaviorCompletion completion, BehaviorDispatcher.Event event) {
//		LOG.fine("invoke()");
//		hasDirty.setDirtyFlag(true);
//		
//		
//		
//		completion.complete(true, event);
//	}

}
