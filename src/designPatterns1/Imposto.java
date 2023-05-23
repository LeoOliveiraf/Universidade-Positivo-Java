package designPatterns1;

import java.math.BigDecimal;

import designPatterns1.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);
}
