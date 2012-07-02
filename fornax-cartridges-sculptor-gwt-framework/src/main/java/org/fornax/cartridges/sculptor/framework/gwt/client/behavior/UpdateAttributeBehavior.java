package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * Behavior to update an attribute on a domain object based on what a value selected by the user.
 * @author ron
 *
 * @param <T>
 */
public class UpdateAttributeBehavior extends BehaviorBase implements Behavior {

    private static final Logger LOG =
        Logger.getLogger(UpdateAttributeBehavior.class.getName());

	protected Invocable invocable;
	
	
	public UpdateAttributeBehavior(String name, Invocable invocable) {
		super(name);
		this.invocable = invocable;
	}

	/**
	 * Interface used to invoke a function that will update the specific attribute 
	 * @author ron
	 *
	 * @param <C>
	 */
	public interface Invocable {
		public void invoke(Event event);	
	}
	
	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		LOG.fine("invoke() name = " + name + ", event = " + event);
		this.invocable.invoke(event);
	}
	
}
