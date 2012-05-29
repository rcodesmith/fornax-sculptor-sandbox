package org.fornax.cartridges.sculptor.framework.gwt.client;

import org.fornax.cartridges.sculptor.framework.gwt.client.activity.ActivityBase;

import com.google.gwt.place.shared.Place;
import com.google.inject.Provider;

public class ViewRegistration<PLACE extends Place, ACTIVITY extends ActivityBase<PLACE>> {

	private Class<?> viewInterfaceClass;
	private Class<?> viewImplClass;

	private Class<? extends Place> placeClass;
	private Class<?> placeTokenizerClass;

	private Provider<ACTIVITY> activityProvider;

	public ActivityBase<PLACE> getActivity(Place place) {
		return activityProvider.get().withPlace((PLACE) place);
	}

	public ViewRegistration(Class<?> viewInterfaceClass,
			Class<?> viewImplClass, Class<? extends Place> placeClass,
			Class<?> placeTokenizerClass, Provider<ACTIVITY> activityProvider) {
		super();
		this.viewInterfaceClass = viewInterfaceClass;
		this.viewImplClass = viewImplClass;
		this.placeClass = placeClass;
		this.placeTokenizerClass = placeTokenizerClass;
		this.activityProvider = activityProvider;
	}

	public Class<?> getViewInterfaceClass() {
		return viewInterfaceClass;
	}

	public Class<?> getViewImplClass() {
		return viewImplClass;
	}

	public Class<? extends Place> getPlaceClass() {
		return placeClass;
	}

	public Class<?> getPlaceTokenizerClass() {
		return placeTokenizerClass;
	}

	public Provider<ACTIVITY> getActivityProvider() {
		return activityProvider;
	}
	
}
