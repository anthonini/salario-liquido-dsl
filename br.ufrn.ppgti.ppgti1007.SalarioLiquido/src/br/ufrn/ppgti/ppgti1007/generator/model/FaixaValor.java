package br.ufrn.ppgti.ppgti1007.generator.model;

public abstract class FaixaValor {

	protected Double valorMinimo;	
	protected Double valorMaximo;	
	protected Double taxa;	
	protected Double deducao;
	
	public abstract Double getImposto(Double valor);
	
	public FaixaValor valorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
		return this;
	}
	
	public FaixaValor valorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
		return this;
	}
	
	public FaixaValor taxa(Double taxa) {
		this.taxa = taxa;
		return this;
	}

	public FaixaValor deducao(Double deducao) {
		this.deducao = deducao;
		return this;
	}

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

	public Double getTaxa() {
		return taxa;
	}

	public Double getDeducao() {
		return deducao;
	}
}
