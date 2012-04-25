package org.fornax.cartridges.sculptor.framework.gwt.client;

import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;

public class TypedSuggestBox<T> extends SuggestBox implements HasSelectedItem<T> {


	public static interface TypedSuggestion<T> extends Suggestion {
		T getData();
	}
	
	@Override
	public T getSelectedItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSelectedItem(T item) {
		// TODO Auto-generated method stub
		
	}


}
