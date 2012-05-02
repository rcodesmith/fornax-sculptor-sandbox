package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

public class MarkCleanBehavior extends SetDirtyFlagBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(MarkCleanBehavior.class.getName());

	public MarkCleanBehavior(String name, HasDirtyFlags hasDirty) {
		super(name, hasDirty, false);
	}

	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		
		if(this.markSpecificObjectDirty == false) {
			LOG.fine(name + " invoke() : clearing all objects of dirty flag");
			this.hasDirty.clearAllDirtyFlags();
		}
		super.invoke(completion, event);
	}
	
	

}
