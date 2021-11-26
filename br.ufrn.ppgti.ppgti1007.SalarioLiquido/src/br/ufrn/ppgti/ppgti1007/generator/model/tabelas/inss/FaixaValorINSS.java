package br.ufrn.ppgti.ppgti1007.generator.model.tabelas.inss;

import br.ufrn.ppgti.ppgti1007.generator.model.FaixaValor;

public class FaixaValorINSS extends FaixaValor {

	public Double getImposto(Double valor) {
		if(valor >= valorMinimo && valor <= valorMaximo) {
			return (valor-deducao)*taxa/100;
		}else if(valor > valorMaximo) {
			return (valorMaximo-deducao)*taxa/100;
		} else {
			return 0.0;
		}
	}
}
