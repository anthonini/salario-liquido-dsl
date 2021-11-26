package br.ufrn.ppgti.ppgti1007.generator.model.tabelas.irrf;

import br.ufrn.ppgti.ppgti1007.generator.model.FaixaValor;

public class FaixaValorIRRF extends FaixaValor {

	public Double getImposto(Double valor) {
		if(valor >= valorMinimo && (valorMaximo == null || valor <= valorMaximo)) {
			return valor*taxa/100 - deducao;
		} else {
			return 0.0;
		}
	}
}
