package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.CalculadoraImpostos;
import designPatterns1.ICMS;
import designPatterns1.ISS;
import designPatterns1.Imposto;
import designPatterns1.Orcamento;

public class TestesImpostos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		
		CalculadoraImpostos calculadora = new CalculadoraImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}
}
