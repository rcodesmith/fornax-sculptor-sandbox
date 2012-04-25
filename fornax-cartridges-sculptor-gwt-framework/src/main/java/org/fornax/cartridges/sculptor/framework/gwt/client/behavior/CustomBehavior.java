package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import com.google.gwt.user.client.rpc.AsyncCallback;


public class CustomBehavior extends BehaviorBase implements Behavior {
	
	protected AsyncInvocable<Boolean> invocation;
	
	public CustomBehavior(AsyncInvocable<Boolean> invocation) {
		this.invocation = invocation;
	}


	@Override
	public void invoke(final BehaviorCompletion completion, final BehaviorDispatcher.Event event) {
		
		invocation.invoke(event, new AsyncCallback<Boolean>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO: DO something
				completion.complete(false, event);
			}

			@Override
			public void onSuccess(Boolean result) {
				completion.complete(true, event);
			}
		});
	}
	
	
}
