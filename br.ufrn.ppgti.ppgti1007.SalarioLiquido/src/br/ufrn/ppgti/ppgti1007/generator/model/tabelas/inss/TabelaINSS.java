package br.ufrn.ppgti.ppgti1007.generator.model.tabelas.inss;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.ppgti.ppgti1007.generator.model.FaixaValor;
import br.ufrn.ppgti.ppgti1007.generator.model.Tabela;

public class TabelaINSS implements Tabela {

	public List<FaixaValor> getValores() {
		List<FaixaValor> valores = new ArrayList<>(4);
		
		FaixaValor faixa1 = new FaixaValorINSS().valorMinimo(0.0)	 .valorMaximo(1100.00).taxa( 7.5).deducao(0.0);
		FaixaValor faixa2 = new FaixaValorINSS().valorMinimo(1100.01).valorMaximo(2203.48).taxa( 9.0).deducao(1100.00);
		FaixaValor faixa3 = new FaixaValorINSS().valorMinimo(2203.49).valorMaximo(3305.22).taxa(12.0).deducao(2203.48);
		FaixaValor faixa4 = new FaixaValorINSS().valorMinimo(3305.23).valorMaximo(6433.57).taxa(14.0).deducao(3305.22);
		
		valores.add(faixa1);
		valores.add(faixa2);
		valores.add(faixa3);
		valores.add(faixa4);
		
		return valores;
	}
}
