package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * This class is responsible for creating BehaviorDispatcher Events based on different inputs
 * @author ron
 *
 */
public class EventFactory {

	public static BehaviorDispatcher.Event create(Object obj, String val) {
		Event ev = new Event(obj, val);
		return ev;
	}
}
