package org.fornax.cartridges.sculptor.framework.gwt.client.condition;

public class AndCondition implements Condition {

	private Condition[] conditions;
	
	public AndCondition(Condition[] conditions) {
		this.conditions = conditions;
	}

	@Override
	public boolean isTrue() {
		for (Condition cond : conditions) {
			if(cond.isTrue() == false) {
				return false;
			}
		}
		return true;
	}
	
	
}
