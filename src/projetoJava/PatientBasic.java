package projetoJava;

public class PatientBasic extends Patient{

	public PatientBasic() {
		super();
	}

	public PatientBasic(String nome, String cpf, int idade, int diaConsulta, double credito, double mensalidadeConsulta) {
		super(nome, cpf, idade, diaConsulta, mensalidadeConsulta);
	}


	public double descontoPaciente(double valor) {
		double desconto =  valor * 0.1;
		double total = valor - desconto;
		return total;
	}
}
