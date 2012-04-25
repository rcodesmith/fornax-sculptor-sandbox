package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.Collection;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasSelectableItems;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class PopulateListBoxBehavior<T> implements Behavior {

	
	HasSelectableItems<T> selectableItems;
	AsyncInvocable<Collection<T>> invocable;
	
	public PopulateListBoxBehavior(HasSelectableItems<T> selectableItems,
			AsyncInvocable<Collection<T>> invocable) {
		this.selectableItems = selectableItems;
		this.invocable = invocable;
	}
	
	public void bind() {
		
	}
	
	@Override
	public void invoke(final BehaviorCompletion completion, final BehaviorDispatcher.Event event) {
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
