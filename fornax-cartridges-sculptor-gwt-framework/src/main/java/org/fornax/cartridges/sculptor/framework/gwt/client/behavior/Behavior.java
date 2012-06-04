package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

/**
 * Common interface for UI behaviors.  UI behaviors may execute asynchronously, calling back on BehaviorCompletion when they complete.
 * Behaviors may be chained together via the BehaviorDispatcher class.
 * Example behaviors: call a custom activity method, populate a table with data, mark the view dirty 
 * @author ron
 *
 */
public interface Behavior {

	/**
	 * Callback interface that must be called when a behavior is done.
	 * @author ron
	 *
	 */
	public interface BehaviorCompletion {
		/**
		 * Signal the behavior completed successfully
		 * @param continueBehaviors If true, any subsequent chained behaviors should execute, false otherwise
		 * @param event
		 */
		public void complete(boolean continueBehaviors, BehaviorDispatcher.Event event);
		
		/**
		 * An error occurred in executing the behavior.  Subsequent behaviors will not be executed, and the error handled
		 * @param throwable
		 * @param event
		 */
		public void failure(final Throwable throwable, BehaviorDispatcher.Event event);

	}
	
	/**
	 * Invoke the behavior
	 * @param completion Callback interface to be invoked when the behavior is done
	 * @param event Event carrying additional information
	 */
	public void invoke(final BehaviorCompletion completion, final BehaviorDispatcher.Event event);
	
}
