/*
 * generated by Xtext 2.25.0
 */
package br.ufrn.ppgti.ppgti1007;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SalarioLiquidoStandaloneSetup extends SalarioLiquidoStandaloneSetupGenerated {

	public static void doSetup() {
		new SalarioLiquidoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
