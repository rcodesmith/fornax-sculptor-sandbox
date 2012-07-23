package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

public class UpdateHistoryBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(UpdateHistoryBehavior.class.getName());

    // Name of this behavior
    protected String name;

	public UpdateHistoryBehavior(String name) {
		super();
		this.name = name;
	}

	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		LOG.info("invoke()");
		// TODO: Fill in
	}
    

}
