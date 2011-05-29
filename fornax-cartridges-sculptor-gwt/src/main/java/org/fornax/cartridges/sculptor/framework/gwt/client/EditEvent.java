package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.EditEvent.EditEventHandler;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class EditEvent extends GwtEvent<EditEventHandler>{

	private Object targetObj;
	
	
	protected Object getTargetObj() {
		return targetObj;
	}

	public EditEvent(Object targetObj) {
		super();
		this.targetObj = targetObj;
	}

	public EditEvent() {
		super();
	}

	public interface EditEventHandler extends EventHandler {
		void onEdited(EditEvent event);
	}
	

	public static Type<EditEventHandler> TYPE = new Type<EditEventHandler>();

	@Override
	protected void dispatch(EditEventHandler hndlr) {
		hndlr.onEdited(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<EditEventHandler> getAssociatedType() {
		return TYPE;
	}

}
