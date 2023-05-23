package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.CalculadoraDescontos;
import designPatterns1.CalculadoraImpostos;
import designPatterns1.ICMS;
import designPatterns1.ISS;
import designPatterns1.Imposto;
import designPatterns1.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 4);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDescontos calculadora = new CalculadoraDescontos();
		
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
	}
}
