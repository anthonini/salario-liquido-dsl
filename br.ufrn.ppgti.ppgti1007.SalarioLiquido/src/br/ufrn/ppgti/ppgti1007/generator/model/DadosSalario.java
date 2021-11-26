package br.ufrn.ppgti.ppgti1007.generator.model;

import java.text.DecimalFormat;

import br.ufrn.ppgti.ppgti1007.generator.model.tabelas.inss.TabelaINSS;
import br.ufrn.ppgti.ppgti1007.generator.model.tabelas.irrf.TabelaIRRF;
import br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario;

public class DadosSalario {

	private Salario salario;
	private double salarioLiquido;
	private double decimoTerceiro;
	private double inss;
	private double irrf;
	private double ferias;
		
	public DadosSalario(Salario salario) {
		this.salario = salario;		
		calcular();
		calcularDecimoTerceiro();
		calcularFerias();
	}

	private void calcular() {
		Tabela tabelaINSS = new TabelaINSS();
		inss = tabelaINSS.getValor(salario.getValor());
		
		Tabela tabelaIRRF = new TabelaIRRF();
		irrf = tabelaIRRF.getValor(salario.getValor() - inss - salario.getPrevidencia() - salario.getDependentes()*TabelaIRRF.DEDUCAO_DEPENDENTE);
		
		salarioLiquido = salario.getValor() - inss - irrf - salario.getDescontos() - salario.getPrevidencia();
	}
	
	private void calcularDecimoTerceiro() {
		Tabela tabelaINSS = new TabelaINSS();
		inss = tabelaINSS.getValor(salario.getValor());
		
		Tabela tabelaIRRF = new TabelaIRRF();
		irrf = tabelaIRRF.getValor(salario.getValor() - inss - salario.getDependentes()*TabelaIRRF.DEDUCAO_DEPENDENTE);
		
		decimoTerceiro = salario.getValor() - inss - irrf;
	}
	
	private void calcularFerias() {
		double feriasBruto = salario.getValor() * (1.0+1.0/3.0);
		
		Tabela tabelaINSS = new TabelaINSS();
		double inssFerias = tabelaINSS.getValor(feriasBruto);
		
		Tabela tabelaIRRF = new TabelaIRRF();
		double irrfFerias = tabelaIRRF.getValor(feriasBruto-inssFerias);
		
		ferias = feriasBruto - inssFerias - irrfFerias - decimoTerceiro;
	}
	
	public Double getBruto() {
		return salario.getValor();
	}
	
	public Double getLiquido() {
		return salarioLiquido;
	}
	
	public int getDependentes() {
		return salario.getDependentes();
	}
	
	public Double getLiquidoDecimoTerceiroFerias() {
		return salarioLiquido + decimoTerceiro/12.0 + (ferias)/12.0;
	}
	
	public String getSalarioBruto() {
		return DecimalFormat.getCurrencyInstance().format(salario.getValor());
	}
	
	public String getSalarioLiquido() {
		return DecimalFormat.getCurrencyInstance().format(salarioLiquido);
	}
	
	public String getFGTS() {
		return DecimalFormat.getCurrencyInstance().format(salario.getValor()*0.08);
	}
	
	public String salarioLiquidoMais13Ferias() {
		return DecimalFormat.getCurrencyInstance().format(getLiquidoDecimoTerceiroFerias());
	}

	public String getInss() {
		return DecimalFormat.getCurrencyInstance().format(inss);
	}

	public String getDecimoTerceiro() {
		return DecimalFormat.getCurrencyInstance().format(decimoTerceiro);
	}

	public String getFerias() {
		return DecimalFormat.getCurrencyInstance().format(ferias);
	}
	
	public String getTercoFerias() {
		return DecimalFormat.getCurrencyInstance().format(salario.getValor()/3.0);
	}
	
	public String getIrrf() {
		if(irrf > 0.0) irrf *= -1.0;
		return DecimalFormat.getCurrencyInstance().format(irrf);
	}
	
	public String getDescontos() {
		var descontos = salario.getDescontos();
		if(descontos > 0.0) descontos *= -1.0;
		return DecimalFormat.getCurrencyInstance().format(descontos);
	}
	
	public String getPrevidencia() {
		var previdencia = salario.getPrevidencia();
		if(previdencia > 0.0) previdencia *= -1.0;
		return DecimalFormat.getCurrencyInstance().format(previdencia);
	}
}
