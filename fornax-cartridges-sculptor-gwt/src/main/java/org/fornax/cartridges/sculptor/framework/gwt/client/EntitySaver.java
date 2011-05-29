package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.EntityChangedEvent.EntityChangedEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.ui.Composite;

public class EntitySaver extends Composite implements HasHandlers {

	private HandlerManager handlerManager;
	
	
	public EntitySaver() {
		super();
		handlerManager = new HandlerManager(this);
	}


	public void fireEvent(GwtEvent<?> event) {
		handlerManager.fireEvent(event);
	}
	
    public HandlerRegistration addEntityChangedEventHandler(
            EntityChangedEventHandler handler) {
        return handlerManager.addHandler(EntityChangedEvent.TYPE, handler);
    }

}
