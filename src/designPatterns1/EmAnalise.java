package designPatterns1;

import java.math.BigDecimal;

public class EmAnalise {
	public BigDecimal calcularValorDescontoExtra(Orcamento orca) {
		return orca.getValor().multiply(new BigDecimal("0.05"));
	}
	
	public void aprovar(Orcamento orcamento) {
		//orcamento.setSituacao(new Aprovado);
	}
	
	public void reprovar(Orcamento orcamento) {
		//orcamento.setSituacao(new Reprovado);
	}
}
