package org.fornax.cartridges.sculptor.framework.gwt.client;

public interface PresentsMessage {
	
	/**
	 * Display a message, and give the user an option to proceed with subsequent operations or cancel.
	 * @param msg Message to display
	 * @return True if the user chose to proceed, false if they chose to cancel
	 */
	public boolean showConfirmation(String msg);
	
}
