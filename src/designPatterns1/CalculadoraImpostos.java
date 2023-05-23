package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public class CalculadoraImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
