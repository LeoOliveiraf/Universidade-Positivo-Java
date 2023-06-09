package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
	public  BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
