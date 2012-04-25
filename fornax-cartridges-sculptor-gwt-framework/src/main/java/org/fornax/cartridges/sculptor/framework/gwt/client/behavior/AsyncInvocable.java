package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AsyncInvocable<T> {
	public void invoke(BehaviorDispatcher.Event event, AsyncCallback<T> callback);

}
