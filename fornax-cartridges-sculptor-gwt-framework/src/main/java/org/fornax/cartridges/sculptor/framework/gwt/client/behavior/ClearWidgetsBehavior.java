package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * Behavior which clears the contents of one or more widgets.
 * Since the logic for clearing individual widgets is specific to the view (e.g. what clear method must be called),
 * this class delegates to an invocable to really do the clearing.
 * @author ron
 *
 */
public class ClearWidgetsBehavior extends BehaviorBase implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(ClearWidgetsBehavior.class.getName());
	

	// Invocable to be called to clear widgets
	protected Invocable invocation;
	
	public ClearWidgetsBehavior(String name, Invocable invocation) {
		super(name);
		this.invocation = invocation;
	}

	@Override
	public void invoke(final BehaviorCompletion completion, final Event event) {
		LOG.info("invoke() name = " + name);
		
		try {
			this.invocation.invoke(event);
		} catch (Throwable t) {
			completion.failure(t, event);
		}
		
		completion.complete(true, event);

	}

}
