package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

public interface Behavior {

	public interface BehaviorCompletion {
		public void complete(boolean continueBehaviors);
	}
	
	public void invoke(final BehaviorCompletion completion);
}
