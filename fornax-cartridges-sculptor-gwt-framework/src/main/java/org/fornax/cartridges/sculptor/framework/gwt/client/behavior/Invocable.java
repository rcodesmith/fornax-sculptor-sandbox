package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * Interface to invoke a function synchronously.
 * @author ron
 *
 */
public interface Invocable {

	public abstract void invoke(Event event);

}