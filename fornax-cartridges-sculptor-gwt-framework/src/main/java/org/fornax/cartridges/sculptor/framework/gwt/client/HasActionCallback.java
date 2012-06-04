package org.fornax.cartridges.sculptor.framework.gwt.client;

/**
 * Interface for classes that support registration of a callback
 * @author ron
 *
 * @param <T> Type that should be passed from source to callback (e.g. cell table row class)
 */
public interface HasActionCallback<T> {
	
	/**
	 * Callback to handle an action (e.g. click)
	 * @author ron
	 *
	 * @param <T> Type that should be passed from source (e.g. cell table row class)
	 */
	public interface ActionCallback<T> {
		public void action(T obj);
	}

	/**
	 * Register a callback handler
	 * @param callback
	 */
	public void registerCallback(ActionCallback<T> callback);
}
