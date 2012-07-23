package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.PresentsMessage;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * Behavior to display a message to the user and optionally confirm with the user they
 * wish to continue (cancelable).  If the user chooses to cancel, subsequent actions will not be executed.
 * Otherwise, the remaining behaviors are executed.
 * 
 * @author ron
 *
 */
public class DisplayMessageBehavior implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(DisplayMessageBehavior.class.getName());

    // Name of this behavior
    protected String name;
    
    // Interface responsible for presenting messages
	protected PresentsMessage presentsConfirmation;
	// Message to be displayed
	protected String message;
	// Identifier of message to be displayed.  Can be used for internationalized messages or specialty messages
	protected String messageId;
	// If true, this behavior should give the user the option to proceed or to cancel subsequent operations
	protected Boolean cancelable;
	
	
	public DisplayMessageBehavior(String name, String message, String messageId, PresentsMessage presentsConfirmation) {
		this.name = name;
		this.message = message;
		this.presentsConfirmation = presentsConfirmation;
	}

	public DisplayMessageBehavior(String name, String message, PresentsMessage presentsConfirmation) {
		this(name, message, null, presentsConfirmation);
	}

	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke()");
		}
		completion.complete(presentsConfirmation.showConfirmation(message), event);			
	}

}
