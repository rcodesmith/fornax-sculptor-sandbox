package org.fornax.cartridges.sculptor.framework.gwt.client.activity;

import java.util.HashMap;
import java.util.Map;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.History;

public abstract class ActivityBase<T extends Place> extends AbstractActivity implements HasDirtyFlags, ActivityIf {
	
	protected Boolean isDirty = false;
	
	protected Map<Object, Boolean> dirtyFlags = new HashMap<Object, Boolean>();

	protected T place;
	
	public ActivityBase<T> withPlace( T place ){
		this.place = place;
		return this;
	}

	public T getPlace(){
		return place;
	}
	
	@Override
	public void setDirty(Object obj, Boolean isDirty) {
		dirtyFlags.put(obj, isDirty);
	}
	
	@Override
	public Boolean isDirty(Object obj) {
		return dirtyFlags.get(obj);
	}

	@Override
	public boolean isDirty() {
		return isDirty;
	}

	@Override
	public void setDirtyFlag(boolean isDirty) {
		this.isDirty = isDirty;
	}
	
	

	@Override
	public void clearAllDirtyFlags() {
		this.isDirty = false;
		
		dirtyFlags.clear();
	}

	@Override
	public void goBack() {
		History.back();
	}

	
	
}
