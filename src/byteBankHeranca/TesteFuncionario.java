package byteBankHeranca;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Leonardo Oliveira");
		funcionario.setCpf("123.123.123-12");
		funcionario.setSalario(2600.00);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
}
