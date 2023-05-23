package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public class ISS implements Imposto{
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
}
