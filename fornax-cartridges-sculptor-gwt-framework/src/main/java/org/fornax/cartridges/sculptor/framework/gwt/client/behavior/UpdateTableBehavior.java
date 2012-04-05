package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.HasData;


public class UpdateTableBehavior<T> implements Behavior {

	protected HasData<T> table;

	public interface DataSource<D> {
		public void getData(AsyncCallback<List<D>> resultsCallback);
	}
	
	protected DataSource<T> dataSource;

	
	public UpdateTableBehavior(HasData<T> table, DataSource<T> dataSource) {
		super();
		this.table = table;
		this.dataSource = dataSource;
	}


	@Override
	public void invoke(final BehaviorCompletion completion) {
		
		dataSource.getData(new AsyncCallback<List<T>>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO: DO something
				completion.complete(false);
			}

			@Override
			public void onSuccess(List<T> result) {
				table.setRowCount(result.size(), true);
				table.setRowData(0, result);
				completion.complete(true);
			}
		});
	}
	
	
	
	
	
}
