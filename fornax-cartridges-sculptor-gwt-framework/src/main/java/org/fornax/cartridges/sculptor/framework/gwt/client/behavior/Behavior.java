package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

public interface Behavior {

	public interface BehaviorCompletion {
		public void complete(boolean continueBehaviors, BehaviorDispatcher.Event event);
		
		public void failure(final Throwable throwable, BehaviorDispatcher.Event event);

	}
	
	public void invoke(final BehaviorCompletion completion, final BehaviorDispatcher.Event event);
	
}
