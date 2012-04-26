package org.fornax.cartridges.sculptor.framework.gwt.client.behavior;

import org.fornax.cartridges.sculptor.framework.gwt.client.HasDirtyFlags;

public class MarkCleanBehavior extends SetDirtyFlagBehavior implements Behavior {

	public MarkCleanBehavior(String name, HasDirtyFlags hasDirty) {
		super(name, hasDirty, false);
	}

}
