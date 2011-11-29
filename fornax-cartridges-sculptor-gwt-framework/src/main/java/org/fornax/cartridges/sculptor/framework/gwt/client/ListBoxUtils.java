package org.fornax.cartridges.sculptor.framework.gwt.client;

import java.util.List;

import com.google.gwt.user.client.ui.ListBox;

public class ListBoxUtils {

	public static void populateListBox(List<String> names, ListBox listBox, String currentlySelectedName) {
		listBox.clear();
		for (String name : names) {
			listBox.addItem(name);
		}

		int selIx = names.indexOf(currentlySelectedName);
		if(selIx != -1) {
			listBox.setSelectedIndex(selIx);
		}
	}
}
