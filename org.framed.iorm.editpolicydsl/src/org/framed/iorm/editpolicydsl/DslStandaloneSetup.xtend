/*
 * generated by Xtext 2.13.0
 */
package org.framed.iorm.editpolicydsl

import org.eclipse.xtext.ISetup

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	def static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
