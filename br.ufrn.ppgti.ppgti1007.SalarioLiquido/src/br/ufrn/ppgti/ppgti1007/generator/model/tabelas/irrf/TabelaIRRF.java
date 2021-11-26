package br.ufrn.ppgti.ppgti1007.generator.model.tabelas.irrf;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.ppgti.ppgti1007.generator.model.FaixaValor;
import br.ufrn.ppgti.ppgti1007.generator.model.Tabela;

public class TabelaIRRF implements Tabela {
	
	public static double DEDUCAO_DEPENDENTE = 189.59;

	public List<FaixaValor> getValores() {
		List<FaixaValor> valores = new ArrayList<>(5);
		
		FaixaValor faixa1 = new FaixaValorIRRF().valorMinimo(0.0)	 .valorMaximo(1903.98).taxa( 0.0).deducao(0.0);
		FaixaValor faixa2 = new FaixaValorIRRF().valorMinimo(1903.99).valorMaximo(2826.65).taxa( 7.5).deducao(142.80);
		FaixaValor faixa3 = new FaixaValorIRRF().valorMinimo(2826.66).valorMaximo(3751.05).taxa(15.0).deducao(354.80);
		FaixaValor faixa4 = new FaixaValorIRRF().valorMinimo(3751.06).valorMaximo(4664.68).taxa(22.5).deducao(636.13);
		
		FaixaValor faixa5 = new FaixaValorIRRF().valorMinimo(4664.69).taxa(27.5).deducao(869.36);
		
		valores.add(faixa1);
		valores.add(faixa2);
		valores.add(faixa3);
		valores.add(faixa4);
		valores.add(faixa5);
		
		return valores;
	}
}
