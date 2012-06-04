package org.fornax.cartridges.sculptor.framework.gwt.client.widgets.cell;

import com.google.gwt.cell.client.ActionCell;

public interface HasActionDelegate<T> {
	public void setDelegate(ActionCell.Delegate<T> delegate);

}
