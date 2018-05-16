/*
 * generated by Xtext 2.13.0
 */
package org.framed.iorm.editpolicydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.framed.iorm.editpolicydsl.ui.internal.EditpolicydslActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EditpolicydslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EditpolicydslActivator activator = EditpolicydslActivator.getInstance();
		return activator != null ? activator.getInjector(EditpolicydslActivator.ORG_FRAMED_IORM_EDITPOLICYDSL_DSL) : null;
	}

}