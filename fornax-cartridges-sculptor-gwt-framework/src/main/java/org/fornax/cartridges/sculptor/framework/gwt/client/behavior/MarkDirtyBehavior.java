package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

public class MarkDirtyBehavior extends SetDirtyFlagBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(MarkDirtyBehavior.class.getName());

	public MarkDirtyBehavior(String name, HasDirtyFlags hasDirty) {
		super(name, hasDirty, true);
	}

	public MarkDirtyBehavior(String name, HasDirtyFlags hasDirty,
			Boolean markSpecificObjectDirty) {
		super(name, hasDirty, true, markSpecificObjectDirty);
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
