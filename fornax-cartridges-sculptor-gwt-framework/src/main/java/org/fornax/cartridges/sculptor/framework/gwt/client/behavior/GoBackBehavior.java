package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.activity.ActivityIf;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.BehaviorDispatcher.Event;

public class GoBackBehavior extends BehaviorBase implements Behavior {

	protected ActivityIf activity;

	public GoBackBehavior(String name, ActivityIf activity) {
		super(name);
		this.activity = activity;
	}

	@Override
	public void invoke(BehaviorCompletion completion, Event event) {
		activity.goBack();
	}

}
