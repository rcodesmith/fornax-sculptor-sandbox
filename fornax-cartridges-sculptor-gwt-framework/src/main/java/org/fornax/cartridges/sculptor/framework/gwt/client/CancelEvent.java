package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.CancelEvent.CancelEventHandler;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class CancelEvent extends GwtEvent<CancelEventHandler>{

	public CancelEvent() {
		super();
	}

	public interface CancelEventHandler extends EventHandler {
		void onCancelled(CancelEvent event);
	}
	

	public static Type<CancelEventHandler> TYPE = new Type<CancelEventHandler>();

	@Override
	protected void dispatch(CancelEventHandler hndlr) {
		hndlr.onCancelled(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<CancelEventHandler> getAssociatedType() {
		return TYPE;
	}

}
