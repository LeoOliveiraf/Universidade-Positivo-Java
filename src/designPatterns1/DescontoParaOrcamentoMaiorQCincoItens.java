package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public class DescontoParaOrcamentoMaiorQCincoItens extends Desconto{
	public DescontoParaOrcamentoMaiorQCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		
		return orcamento.getQuantidadeItens() > 5;
	}
}
