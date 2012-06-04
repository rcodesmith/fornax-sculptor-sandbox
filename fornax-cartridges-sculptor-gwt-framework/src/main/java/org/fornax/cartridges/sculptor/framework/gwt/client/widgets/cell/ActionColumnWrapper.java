package org.fornax.cartridges.sculptor.framework.gwt.client.widgets.cell;

import org.fornax.cartridges.sculptor.framework.gwt.client.ValueGetter;

import com.google.gwt.cell.client.ActionCell;
import com.google.gwt.user.cellview.client.Column;

public class ActionColumnWrapper<T> implements ColumnWrapper, HasActionDelegate<T> {
	protected ActionCell.Delegate<T> delegate = null;

	protected Column<T, T> column;
	
	protected ActionCell<T> cell;

	protected ValueGetter<T, T> valueGetter;
	
	

	public Column<T, T> getColumn() {
		return column;
	}

	public void setColumn(Column<T, T> column) {
		this.column = column;
	}

	public ActionCell<T> getCell() {
		return cell;
	}

	public void setCell(ActionCell<T> cell) {
		this.cell = cell;
	}

	public ValueGetter<T, T> getValueGetter() {
		return valueGetter;
	}

	public void setValueGetter(ValueGetter<T, T> valueGetter) {
		this.valueGetter = valueGetter;
	}

	public ActionCell.Delegate<T> getDelegate() {
		return delegate;
	}

	public void setDelegate(ActionCell.Delegate<T> delegate) {
		this.delegate = delegate;
	}


	public ActionColumnWrapper(String text) {
		super();
	}

	public ActionColumnWrapper() {
		super();
	}

	public void init() {
		createActionCell();		
		createColumn();		
	}
	
	protected void createColumn() {
		column = new Column<T, T>(cell) {

			@Override
			public T getValue(T object) {
				return valueGetter.getValue(object);
			}

		};
	}
	
	protected ActionCell<T> createActionCell(String text) {
		cell = new ActionCell<T>(text, new ActionCell.Delegate<T>() {

			@Override
			public void execute(T object) {
				delegate.execute(object);
			}
		});
		return cell;
	}

	protected ActionCell<T> createActionCell() {
		cell = new ActionCell<T>("", new ActionCell.Delegate<T>() {

			@Override
			public void execute(T object) {
				delegate.execute(object);
			}
		});
		return cell;
	}
}
