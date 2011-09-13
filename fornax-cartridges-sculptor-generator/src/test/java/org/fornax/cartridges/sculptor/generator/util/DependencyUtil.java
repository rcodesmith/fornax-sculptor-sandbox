package org.fornax.cartridges.sculptor.generator.util;

import java.util.HashSet;
import java.util.Set;

import sculptormetamodel.Module;

public class DependencyUtil extends DependencyConstraints {

	public static Set<Module> getDependedUponModules(Module mod) {
		HashSet<Module> dependencies = new HashSet<Module>();
		DependencyConstraints.collectDependencies(mod, dependencies);
		return dependencies;
	}
}
