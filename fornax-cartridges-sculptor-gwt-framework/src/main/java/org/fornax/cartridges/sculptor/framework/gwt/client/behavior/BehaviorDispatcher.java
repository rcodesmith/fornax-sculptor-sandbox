package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.fornax.cartridges.sculptor.framework.gwt.client.TypedSuggestBox.TypedSuggestion;
import org.fornax.cartridges.sculptor.framework.gwt.client.behavior.Behavior.BehaviorCompletion;

import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.cellview.client.Column;

/**
 * This class is responsible for binding to event sources (e.g. buttons, list boxes, etc) and invoking one or more behaviors in response.
 * @author ron
 *
 */
public class BehaviorDispatcher {
    private static final Logger LOG =
        Logger.getLogger(BehaviorDispatcher.class.getName());

	protected final List<Behavior> behaviors = new ArrayList<Behavior>();
	protected final String name;
	
	/**
	 * Event that is passed to each behavior.  This is a container for any specific-event information that may be needed by each behavior
	 * (e.g. the row object corresponding to a field update event).
	 * @author ron
	 *
	 */
	public static class Event {
		private Integer index;
		
		private Object obj;
		
		private Object value;

		public Integer getIndex() {
			return index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public Object getObj() {
			return obj;
		}

		public void setObj(Object obj) {
			this.obj = obj;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}
		
		public String toString() {
			return ("Event(index=" + index + ", obj = " + obj + ", value = " + value + ")");
		}
	}
	
	/**
	 * Callback class that is invoked when a behavior completes.  Needed since behaviors may be asynchronous.
	 * @author ron
	 *
	 */
	protected class DispatchBehaviorCompletion implements BehaviorCompletion {
		int currentBehaviorIndex;
		
		DispatchBehaviorCompletion(int currentBehavior) {
			this.currentBehaviorIndex = currentBehavior;
		}

		/**
		 * Behavior completed successfully.  invoke next behavior if appropriate.
		 * @param continueBehaviors If true, the remaining behaviors may be invoked
		 * @param event Event that caused behaviors to get invoked
		 */
		@Override
		public void complete(boolean continueBehaviors, Event event) {
			if(currentBehaviorIndex + 1 < behaviors.size() && continueBehaviors) {
				dispatchTo(currentBehaviorIndex+1, event);
			}
			
		}

		/**
		 * Behavior failed.  Do not continue with remaining behaviors.
		 * @param throwable Exception that caused failure
		 * @param event Event that caused behaviors to get invoked
		 */
		@Override
		public void failure(Throwable throwable, Event event) {
			LOG.log(Level.SEVERE, "Failure dispatching to behaviors", throwable);
		}

	}
	
	/**
	 * Dispatch to the behavior at index.
	 * @param index
	 * @param event
	 */
	protected void dispatchTo(int index, Event event) {		
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " dispatchTo(" + index + ")");
		}
		final Behavior b = behaviors.get(index);
		b.invoke(new DispatchBehaviorCompletion(index), event);
	}
	
	public BehaviorDispatcher(String name, Iterable<Behavior> behaviors) {
		this.name = name;
		
		for (Behavior behavior : behaviors) {
			this.behaviors.add(behavior);
		}
	}

	public BehaviorDispatcher(String name, Behavior... behaviors) {
		this.name = name;

		for (Behavior behavior : behaviors) {
			this.behaviors.add(behavior);
		}
	}

	/**
	 * Invoke the behaviors associated with this dispatcher with the given event.
	 * @param event
	 */
	public void invoke(Event event) {
		if(LOG.isLoggable(Level.FINE)) {
			LOG.fine(name + " invoke()");
		}
		if(behaviors.size() > 0) {
			dispatchTo(0, event);
		}
	}

	/**
	 * Invoke the behaviors associated with this dispatcher without an event - an empty one will be created
	 * @param event
	 */
	public void invoke() {
		this.invoke(new Event());
	}	
	
	
	public <T> void bindHasSelectionHandler(HasSelectionHandlers<T> hasSelectionHandlers) {
		
		LOG.fine(name + ": bindHasSelectionHandler()");
		
		final BehaviorDispatcher bd = this;
		
		hasSelectionHandlers.addSelectionHandler(new SelectionHandler<T>() {

			@Override
			public void onSelection(
					SelectionEvent<T> event) {
				T res = event.getSelectedItem();
				
				LOG.fine(name + ": onSelection()");
				LOG.fine("selectedItem: " + res);
				if(res == null) {
					return;
				}
				if(res instanceof TypedSuggestion) {
					TypedSuggestion<T> typedSuggest = (TypedSuggestion<T>) res;
					T data = typedSuggest.getData();
					LOG.fine("data from TypedSuggestion: " + data);
				}
				Event bdEvent = new Event();
				bdEvent.setObj(res);
				
				bd.invoke(bdEvent);
			}
		});		
	}
	
	public <T> void bindHasValueChangeHandlers(HasValueChangeHandlers<T> hasValueChangeHandlers) {
		
		final BehaviorDispatcher bd = this;
		
		hasValueChangeHandlers.addValueChangeHandler(new ValueChangeHandler<T>() {

			@Override
			public void onValueChange(ValueChangeEvent<T> event) {
				if(LOG.isLoggable(Level.FINE)) {
					LOG.fine(name + ": onValueChange()");
				}
				T res = event.getValue();
				Event bdEvent = new Event();
				bd.invoke(bdEvent);
			}
		});		
	}
	
	public void bindHasChangeHandlers(HasChangeHandlers hasChangeHandlers) {
		final BehaviorDispatcher bd = this;
		
		hasChangeHandlers.addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				if(LOG.isLoggable(Level.FINE)) {
					LOG.fine(name + ": onChange()");
				}
				Event bdEvent = new Event();
				bd.invoke(bdEvent);
			}
			
		});
		
	}
	
	
	public <T,C> FieldUpdater<T, C> getFieldUpdater() {
		final BehaviorDispatcher bd = this;

		return new FieldUpdater<T, C>() {
			@Override
			public void update(int index, T object, C value) {
				if(LOG.isLoggable(Level.INFO)) {
					LOG.info(name + ": FieldUpdater update() update on " + object);
				}
                
                Event event = new Event();
                event.setIndex(index);
                event.setObj(object);
                event.setValue(value);

                bd.invoke(event);
            }

        };
		
	}
	
	public <T,C> void bindColumnFieldUpdater(Column<T,C> col) {
		col.setFieldUpdater(this.<T,C>getFieldUpdater());

	}
	
	/**
	 * Bind this dispatcher to an on-click handler.
	 * @param hasClickHandlers Something that has an on-click handler, such as a button
	 */
	public void bindHasClickHandler(HasClickHandlers hasClickHandlers) {
		final BehaviorDispatcher bd = this;

		hasClickHandlers.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				if(LOG.isLoggable(Level.INFO)) {
					LOG.info(name + ": onClick()");
				}
				Event bdEvent = new Event();
				bd.invoke(bdEvent);
			}
			
		});
	}
	
	

}
