/*
 * generated by Xtext 2.12.0
 */
package org.framed.iorm.editpolicydsl.ui;

import com.google.inject.Injector;
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
		return EditpolicydslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EditpolicydslActivator.getInstance().getInjector(EditpolicydslActivator.ORG_FRAMED_IORM_EDITPOLICYDSL_DSL);
	}
	
}
