package org.fornax.cartridges.sculptor.framework.gwt.client;

import com.google.gwt.user.client.Window;

public abstract class BaseView extends com.google.gwt.user.client.ui.Composite implements PresentsMessage {

	@Override
	public boolean showConfirmation(String msg) {
		return Window.confirm(msg);
	}

	
	
}
