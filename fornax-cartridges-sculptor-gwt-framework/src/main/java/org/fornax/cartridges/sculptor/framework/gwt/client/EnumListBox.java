package org.fornax.cartridges.sculptor.framework.gwt.client;

import java.util.EnumSet;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.ListBox;

/**
 * A type of ListBox which is populated based on an Enumeration.
 */
public class EnumListBox<E extends Enum<E>> extends ListBox implements HasValue<E>
{
    protected Class<E> enumClass;
    
    public EnumListBox (Class<E> eclass)
    {
        this(eclass, EnumSet.allOf(eclass));
    }

    public EnumListBox (Class<E> enumClass, EnumSet<E> enumElements)
    {
        this.enumClass = enumClass;
        for (E value : enumElements) {
            addItem(getListBoxItem(value), value.toString());
        }
    }

    /**
     * Set the item that's selected in the ListBox based on the given Enum value
     */
    public void setSelectedValue (E value)
    {
    	Integer index = getIndexOf(value);
    	if(index != null) {
    		setSelectedIndex(index);
    	}
    }

    protected Integer getIndexOf(E value) {
        String valueStr = value.toString();
        for (int i = 0; i < getItemCount(); i++) {
            if (getValue(i).equals(valueStr)) {
            	return i;
            }
        }
        return null;
    	
    }
    
    /**
     * @return Enum value associated with currently selected item, or null
     */
    public E getSelectedValue ()
    {
        int selectedIndex = getSelectedIndex();
        return (selectedIndex < 0) ? null : Enum.valueOf(enumClass, getValue(selectedIndex));
    }

    /**
     * @param enumValue
     * @return Item that should be added to ListBox based on given enumeration value
     */
    protected String getListBoxItem (E enumValue)
    {
        return enumValue.toString();
    }

	@Override
	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<E> handler) {
		addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				ValueChangeEvent.fire(EnumListBox.this, getValue());
			}
		});
	return addHandler(handler, ValueChangeEvent.getType());	}

	@Override
	public E getValue() {
		return getSelectedValue();
	}

	@Override
	public void setValue(E value) {
		setSelectedValue(value);
	}

	@Override
	public void setValue(E value, boolean fireEvents) {
		setValue(value);
		if(fireEvents){
			ValueChangeEvent.fire(this, value);
		}
	}
}