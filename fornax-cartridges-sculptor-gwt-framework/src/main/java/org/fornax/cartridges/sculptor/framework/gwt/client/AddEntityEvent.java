package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.AddEntityEvent.AddEntityEventHandler;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class AddEntityEvent extends GwtEvent<AddEntityEventHandler>{

	private Object targetObj;
	
	
	protected Object getTargetObj() {
		return targetObj;
	}

	public AddEntityEvent() {
		super();
	}

	public interface AddEntityEventHandler extends EventHandler {
		void onEdited(AddEntityEvent event);
	}
	

	public static Type<AddEntityEventHandler> TYPE = new Type<AddEntityEventHandler>();

	@Override
	protected void dispatch(AddEntityEventHandler hndlr) {
		hndlr.onEdited(this);
	}

	@Override
	public GwtEvent.Type<AddEntityEventHandler> getAssociatedType() {
		return TYPE;
	}

}
