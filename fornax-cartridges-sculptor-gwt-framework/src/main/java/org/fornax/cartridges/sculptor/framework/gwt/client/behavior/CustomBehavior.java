package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import com.google.gwt.user.client.rpc.AsyncCallback;


public class CustomBehavior implements Behavior {

	public interface Invocation {
		public void invoke(AsyncCallback<Boolean> callback);
	}
	
	protected Invocation invocation;
	
	public CustomBehavior(Invocation invocation) {
		this.invocation = invocation;
	}


	@Override
	public void invoke(final BehaviorCompletion completion) {
		
		invocation.invoke(new AsyncCallback<Boolean>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO: DO something
				completion.complete(false);
			}

			@Override
			public void onSuccess(Boolean result) {
				completion.complete(true);
			}
		});
	}
	
	
}
