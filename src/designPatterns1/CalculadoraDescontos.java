package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public class CalculadoraDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDescontos = new DescontoParaOrcamentoMaiorQCincoItens(
				new DescontoParaOrcamentoValorMaiorQQuinhentos(
				new SemDesconto()));
				
		return cadeiaDescontos.calcular(orcamento);
	}
}
