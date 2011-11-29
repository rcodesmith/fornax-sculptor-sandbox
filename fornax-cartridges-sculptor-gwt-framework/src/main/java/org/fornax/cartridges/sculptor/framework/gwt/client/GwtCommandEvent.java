package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.GwtCommandEvent.GwtCommandEventHandler;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class GwtCommandEvent extends GwtEvent<GwtCommandEventHandler>{

	private Object cmd;
	
	public interface GwtCommandEventHandler extends EventHandler {
		void onGwtCommand(GwtCommandEvent event);
	}
	

	public static Type<GwtCommandEventHandler> TYPE = new Type<GwtCommandEventHandler>();

	public Object getCmd() {
		return cmd;
	}

	public void setCmd(Object cmd) {
		this.cmd = cmd;
	}

	public GwtCommandEvent(Object cmd) {
		super();
		this.cmd = cmd;
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<GwtCommandEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GwtCommandEventHandler handler) {
		handler.onGwtCommand(this);
	}

}
