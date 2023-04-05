package HerancaOOPExercicios;

public class MainHeranca2 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Leonardo Oliveira");
		pessoa.setEndereco("Rua rio Tibagi, 197, JD Girassol");
		pessoa.setTelefone("(43) 9 9999-9999");
		System.out.println("Pessoa: " + pessoa.dadosPessoa());
		
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Lucas Silva");
		fornecedor.setEndereco("Rua primeiro de Abril, 184, JD Silvino");
		fornecedor.setTelefone("(43) 9 9999-9999");
		fornecedor.setValorCredito(1000);
		fornecedor.setValorDivida(250);
		System.out.println("\nFornecedor: " + fornecedor.dadosFornecedor());
		fornecedor.obterSaldo();
		
		Empregado empregado = new Empregado();
		empregado.setNome("Amauri Stevan");
		empregado.setEndereco("Rua Bernabeu, 123, Zona Sul");
		empregado.setTelefone("(43) 9 9999-9999");
		empregado.setCodigoSetor(01);
		empregado.setSalarioBase(1.903);
		empregado.setImposto(7.5);
		System.out.println("\nEmpregado: " + empregado.dadosEmpregado());
		empregado.salarioLiquido();
	}
}
