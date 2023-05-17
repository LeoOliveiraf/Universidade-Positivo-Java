package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDescontos = new DescontoParaOrcamentoMaiorQCincoItens(
				new DescontoParaOrcamentoValorMaiorQQuinhentos(
				new SemDesconto()));
				
		return cadeiaDescontos.calcular(orcamento);
	}
}
