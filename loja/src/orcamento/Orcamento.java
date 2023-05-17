package orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private String situacao;
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		super();
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = BigDecimal.ZERO; 
		if(situacao.equals("EM ANALISE")) {
			valorDoDescontoExtra = new BigDecimal("0,05");
		}
				this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public BigDecimal getValor() {
		return valor;
	}
	
}
