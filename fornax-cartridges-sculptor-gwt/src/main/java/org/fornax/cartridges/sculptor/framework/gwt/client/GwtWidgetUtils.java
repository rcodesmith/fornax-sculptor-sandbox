package org.fornax.cartridges.sculptor.framework.gwt.client;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.user.cellview.client.Column;

public class GwtWidgetUtils {

	public static <D> Column<D, String> buildButtonColumn(final String buttonName, FieldUpdater<D, String> fieldUpdater) {
    	ButtonCell buttonCell = new ButtonCell(); 
    	Column<D, String> column = new Column<D, String>(buttonCell) { 
    	  @Override 
    	  public String getValue(D object) { 
    		  return buttonName;
    	  } 
    	};

    	column.setFieldUpdater(fieldUpdater);
    	
    	return column;
	}
}
