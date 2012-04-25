package org.fornax.cartridges.sculptor.framework.gwt.client;

import java.util.Collection;

public interface HasSelectableItems<T> {

	public void replaceItems(Collection<T> newItems);
}
