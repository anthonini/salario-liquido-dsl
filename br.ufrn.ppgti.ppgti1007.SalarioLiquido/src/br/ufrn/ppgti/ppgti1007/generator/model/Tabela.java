package br.ufrn.ppgti.ppgti1007.generator.model;

import java.util.List;

public interface Tabela {

	List<FaixaValor> getValores();
	
	default Double getValor(Double salario) {
		Double valor = 0.0;
		
		for(FaixaValor faixaValor : getValores()) {
			valor += faixaValor.getImposto(salario);
		}
		
		return valor;
	}
}
