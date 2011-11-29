package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.EntityChangedEvent.EntityChangedEventHandler;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * This event indicates an entity has been changed/saved.
 * @author ron
 *
 */
public class EntityChangedEvent extends GwtEvent<EntityChangedEventHandler>{

	private Object entity;
	
	public Object getEntity() {
		return entity;
	}

	public void setEntity(Object entity) {
		this.entity = entity;
	}

	public EntityChangedEvent(Object entity) {
		super();
		this.entity = entity;
	}

	public interface EntityChangedEventHandler extends EventHandler {
		void onEntityChanged(EntityChangedEvent event);
	}
	

	public static Type<EntityChangedEventHandler> TYPE = new Type<EntityChangedEventHandler>();

	@Override
	protected void dispatch(EntityChangedEventHandler hndlr) {
		hndlr.onEntityChanged(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<EntityChangedEventHandler> getAssociatedType() {
		return TYPE;
	}
}
