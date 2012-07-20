package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

import com.google.gwt.event.dom.client.ChangeEvent;

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
	
	public static BehaviorDispatcher.Event create(Object obj, Object val) {
		Event ev = new Event(obj, val);
		return ev;
	}
	
	public static BehaviorDispatcher.Event create(com.google.gwt.event.logical.shared.SelectionEvent<com.google.gwt.user.client.ui.SuggestOracle.Suggestion> event) {
		Event ev = new Event();
		return ev;
	}

	public static BehaviorDispatcher.Event create(ChangeEvent event) {
		Event ev = new Event();
		return ev;
	}
	

	public static BehaviorDispatcher.Event create(com.google.gwt.event.dom.client.ClickEvent event) {
		Event ev = new Event();
		return ev;
	}
}
