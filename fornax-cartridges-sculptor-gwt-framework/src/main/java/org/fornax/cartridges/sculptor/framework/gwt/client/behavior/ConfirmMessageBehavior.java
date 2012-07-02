package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.PresentsConfirmationMessage;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * Behavior to confirm with the user they
 * wish to continue.  If the user chooses to cancel, subsequent actions will not be executed.
 * Otherwise, the remaining behaviors are executed.
 * 
 * @author ron
 *
 */
public class ConfirmMessageBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(WarnIfDirtyBehavior.class.getName());

    protected String name;
	protected PresentsConfirmationMessage presentsConfirmation;
	protected String message;
	
	public ConfirmMessageBehavior(String name, String message, PresentsConfirmationMessage presentsConfirmation) {
		this.name = name;
		this.message = message;
		this.presentsConfirmation = presentsConfirmation;
	}
	
	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke()");
		}
		completion.complete(presentsConfirmation.showConfirmation(message), event);			
	}

}
