/*
 * generated by Xtext 2.25.0
 */
package br.ufrn.ppgti.ppgti1007.ui.tests;

import br.ufrn.ppgti.ppgti1007.SalarioLiquido.ui.internal.SalarioLiquidoActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class SalarioLiquidoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SalarioLiquidoActivator.getInstance().getInjector("br.ufrn.ppgti.ppgti1007.SalarioLiquido");
	}

}