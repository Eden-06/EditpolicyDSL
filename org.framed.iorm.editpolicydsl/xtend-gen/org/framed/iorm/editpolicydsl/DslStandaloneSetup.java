/**
 * generated by Xtext 2.13.0
 */
package org.framed.iorm.editpolicydsl;

import org.framed.iorm.editpolicydsl.DslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {
  public static void doSetup() {
    new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
