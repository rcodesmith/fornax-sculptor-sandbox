package org.fornax.cartridges.sculptor.framework.gwt.client;

import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.ListBox;

public class TypedListBox <O> extends ListBox implements HasValue<O>{

	@Override
	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<O> handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public O getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(O value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(O value, boolean fireEvents) {
		// TODO Auto-generated method stub
		
	}


}
