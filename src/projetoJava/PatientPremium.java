package projetoJava;

public class PatientPremium extends Patient{
	
	public PatientPremium() {
		super();
	}


	public PatientPremium(String nome, String cpf, int idade, int diaConsulta, double mensalidadeConsulta) {
		super(nome, cpf, idade, diaConsulta, mensalidadeConsulta);
	}

	public double descontoPaciente(double valor) {
		double desconto =  valor * 0.5;
		return valor - desconto;
	}
	
	
}
