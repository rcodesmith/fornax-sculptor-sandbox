package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

/**
 * Behavior to update the data within a given table (implements HasData<T>).
 * 
 * @author ron
 * 
 * @param <T>
 *            The type of object contained in the table. Table must implement
 *            HasData<T>
 */
public class UpdateTableBehavior<T> implements Behavior {
	private static final Logger LOG = Logger
			.getLogger(UpdateTableBehavior.class.getName());

	protected String name;
	protected HasData<T> table;

	public interface DataSource<D> {
		public void getData(AsyncCallback<List<D>> resultsCallback);
	}

	public interface LongCallable {
		public void getValue(AsyncCallback<Long> resultsCallback);
	}
	
	protected DataSource<T> dataSource;
	protected LongCallable getNumRowsCallable;

	public UpdateTableBehavior(String name, HasData<T> table,
			DataSource<T> dataSource) {
		super();
		this.name = name;
		this.table = table;
		this.dataSource = dataSource;
	}

	public UpdateTableBehavior(String name, HasData<T> table, LongCallable getNumRowsCallable) {
		super();
		this.name = name;
		this.table = table;
		this.getNumRowsCallable = getNumRowsCallable;
	}

	/**
	 * Invoke the behavior. Call the DataSource asynchronously to get the data
	 * to go into the table. If successful, replace the table contents with
	 * whatever is returned.
	 */
	@Override
	public void invoke(final BehaviorCompletion completion, final Event event) {
		if (LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + ": invoke()");
		}

		if (dataSource != null) {
			dataSource.getData(new AsyncCallback<List<T>>() {

				@Override
				public void onFailure(Throwable caught) {
					// TODO: DO something
					completion.complete(false, event);
				}

				@Override
				public void onSuccess(List<T> result) {
					if (LOG.isLoggable(Level.FINE)) {
						LOG.fine(name + ": onSuccess() num items = "
								+ (result == null ? 0 : result.size()));
					}
					table.setRowCount(result.size(), true);
					table.setRowData(0, result);
					completion.complete(true, event);

				}
			});
		} else {
			// is async
			getNumRowsCallable.getValue(new AsyncCallback<Long>() {

				@Override
				public void onFailure(Throwable caught) {
					// TODO: DO something
					completion.complete(false, event);
				}

				@Override
				public void onSuccess(Long result) {
					table.setRowCount(result.intValue(), true);
					int visibleRangeLen = table.getVisibleRange().getLength();
					table.setVisibleRangeAndClearData(new Range(0, visibleRangeLen), Boolean.TRUE);
					completion.complete(true, event);
				}
			});

		}
	}

}
