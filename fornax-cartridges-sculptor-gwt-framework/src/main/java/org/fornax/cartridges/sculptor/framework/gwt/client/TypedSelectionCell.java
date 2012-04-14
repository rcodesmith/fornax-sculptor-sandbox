package org.fornax.cartridges.sculptor.framework.gwt.client;

import java.util.List;

import com.google.gwt.cell.client.SelectionCell;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;

public class TypedSelectionCell<T> extends SelectionCell  {

	public TypedSelectionCell(List<String> options) {
		super(options);
	}

	

}
