package org.fornax.cartridges.sculptor.framework.gwt.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.place.shared.Place;

public abstract class ActivityBase<T extends Place> extends AbstractActivity {
	
	protected T place;
	
	public ActivityBase<T> withPlace( T place ){
		this.place = place;
		return this;
	}

	public T getPlace(){
		return place;
	}
}
