package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.activity.ActivityIf;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

/**
 * Behavior that goes back in browser history
 * @author ron
 *
 */
public class GoBackBehavior extends BehaviorBase implements Behavior {
    private static final Logger LOG =
        Logger.getLogger(GoBackBehavior.class.getName());

	protected ActivityIf activity;

	public GoBackBehavior(String name, ActivityIf activity) {
		super(name);
		this.activity = activity;
	}

	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke()");
		}

		activity.goBack();
	}

}
