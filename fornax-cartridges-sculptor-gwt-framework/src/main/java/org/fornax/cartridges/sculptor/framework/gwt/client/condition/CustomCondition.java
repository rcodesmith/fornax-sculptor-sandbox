package org.fornax.cartridges.sculptor.framework.gwt.client.condition;

public class CustomCondition implements Condition {

	BooleanInvocable invocable;
	
	public interface BooleanInvocable {
		public boolean isTrue();
	}

	public CustomCondition(BooleanInvocable invocable) {
		this.invocable = invocable;
	}
	
	@Override
	public boolean isTrue() {
		return invocable.isTrue();
	}

}
