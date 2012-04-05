package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.ArrayList;
import java.util.List;

import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.Behavior.BehaviorCompletion;

import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;

public class BehaviorDispatcher {
	
	List<Behavior> behaviors = new ArrayList<Behavior>();
	
	protected class DispatchBehaviorCompletion implements BehaviorCompletion {
		int currentBehaviorIndex;
		
		DispatchBehaviorCompletion(int currentBehavior) {
			this.currentBehaviorIndex = currentBehavior;
		}

		@Override
		public void complete(boolean continueBehaviors) {
			if(currentBehaviorIndex + 1 < behaviors.size() && continueBehaviors) {
				dispatchTo(currentBehaviorIndex+1);
			}
			
		}

	}
	
	protected void dispatchTo(int index) {
		Behavior b = behaviors.get(index);
		b.invoke(new DispatchBehaviorCompletion(index));
	}
	
	public BehaviorDispatcher(Iterable<Behavior> behaviors) {
		for (Behavior behavior : behaviors) {
			this.behaviors.add(behavior);
		}
	}

	public BehaviorDispatcher(Behavior... behaviors) {
		for (Behavior behavior : behaviors) {
			this.behaviors.add(behavior);
		}
	}

	public void invoke() {
		if(behaviors.size() > 0) {
			dispatchTo(0);
		}
	}
	
	
	
	public <T> void bindHasSelectionHandler(HasSelectionHandlers<T> hasSelectionHandlers) {
		
		final BehaviorDispatcher bd = this;
		
		hasSelectionHandlers.addSelectionHandler(new SelectionHandler<T>() {

			@Override
			public void onSelection(
					SelectionEvent<T> event) {
				T res = event.getSelectedItem();
				
				bd.invoke();
			}
		});		
	}
	
	public <T> void bindHasValueChangeHandlers(HasValueChangeHandlers<T> hasValueChangeHandlers) {
		
		final BehaviorDispatcher bd = this;
		
		hasValueChangeHandlers.addValueChangeHandler(new ValueChangeHandler<T>() {

			@Override
			public void onValueChange(ValueChangeEvent<T> event) {
				T res = event.getValue();
				bd.invoke();
			}
		});		
	}
	
	
}
