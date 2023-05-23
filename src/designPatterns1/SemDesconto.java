package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public class SemDesconto extends Desconto{
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) { 
		return BigDecimal.ZERO;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return false;
	}
}
