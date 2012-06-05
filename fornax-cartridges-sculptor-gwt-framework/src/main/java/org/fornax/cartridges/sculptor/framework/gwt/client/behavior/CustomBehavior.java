package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * A custom behavior - the functionality is manually implemented behind a class that implements AsyncInvocable (e.g. anonymous inner class).
 * @author ron
 *
 */
public class CustomBehavior extends BehaviorBase implements Behavior {
	
    private static final Logger LOG =
        Logger.getLogger(CustomBehavior.class.getName());
	
	// AsyncInvocable to be called for the custom behavior
	protected AsyncInvocable<Boolean> invocation;
	
	public CustomBehavior(AsyncInvocable<Boolean> invocation) {
		this.invocation = invocation;
	}


	@Override
	public void invoke(final BehaviorCompletion completion, final BehaviorDispatcher.Event event) {
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke()");
			LOG.fine("event=" + event);
		}
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
