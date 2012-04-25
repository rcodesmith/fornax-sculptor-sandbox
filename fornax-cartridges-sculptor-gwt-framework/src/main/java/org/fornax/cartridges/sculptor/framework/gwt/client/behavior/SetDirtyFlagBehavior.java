package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

public class SetDirtyFlagBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(SetDirtyFlagBehavior.class.getName());
    
	protected HasDirtyFlags hasDirty;
	protected Boolean dirtyFlagValue;
    protected Boolean markSpecificObjectDirty = false;
    

	public SetDirtyFlagBehavior(HasDirtyFlags hasDirty, boolean dirtyFlagValue, Boolean markSpecificObjectDirty) {
		super();
		this.hasDirty = hasDirty;
		this.dirtyFlagValue = dirtyFlagValue;
		this.markSpecificObjectDirty = markSpecificObjectDirty;
	}

	public SetDirtyFlagBehavior(HasDirtyFlags hasDirty, boolean dirtyFlagValue) {
		this(hasDirty, dirtyFlagValue, Boolean.FALSE);
	}
	
	@Override
	public void invoke(BehaviorCompletion completion, final Event event) {
		LOG.fine("invoke");
		hasDirty.setDirtyFlag(dirtyFlagValue);
		
		if(markSpecificObjectDirty) {
			Object obj = event.getObj();
			if(obj != null) {
				if(LOG.isLoggable(Level.FINE)) {
					LOG.fine("setting specific object dirty flag " + obj + " to " + dirtyFlagValue);
				}
				hasDirty.setDirty(obj, dirtyFlagValue);
			}
			
		}
		
		completion.complete(true, event);
	}

}
