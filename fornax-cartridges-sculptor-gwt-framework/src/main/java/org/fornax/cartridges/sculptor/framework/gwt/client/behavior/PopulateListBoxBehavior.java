package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasSelectableItems;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class PopulateListBoxBehavior<T> implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(PopulateListBoxBehavior.class.getName());

	protected String name;
	
	protected HasSelectableItems<T> selectableItems;
	protected AsyncInvocable<Collection<T>> invocable;
	
	public PopulateListBoxBehavior(String name, HasSelectableItems<T> selectableItems,
			AsyncInvocable<Collection<T>> invocable) {
		this.name = name;
		this.selectableItems = selectableItems;
		this.invocable = invocable;
	}
	
	@Override
	public void invoke(final BehaviorCompletion completion, final BehaviorDispatcher.Event event) {
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke()");
		}

		this.invocable.invoke(event, new AsyncCallback<Collection<T>>() {

			@Override
			public void onFailure(Throwable caught) {
				completion.failure(caught, event);
			}

			@Override
			public void onSuccess(Collection<T> result) {
				selectableItems.replaceItems(result);
				completion.complete(true, event);
			}
		});
	}

}
