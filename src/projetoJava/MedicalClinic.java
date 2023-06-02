package projetoJava;

import java.util.ArrayList;

public class MedicalClinic {
	private ArrayList<Patient> clinic;
	
	public MedicalClinic() {
		clinic = new ArrayList<Patient>();
	}

	public MedicalClinic(ArrayList<Patient> clinic) {
		super();
		this.clinic = clinic;
	}

	public ArrayList<Patient> getClinic() {
		return clinic;
	}

	public void setClinic(ArrayList<Patient> clinic) {
		this.clinic = clinic;
	}
	
	public void adicionarPaciente(Patient patient) {
		if(clinic.isEmpty()) {
			clinic.add(patient);
		}
		for(int i = 0; i < clinic.size(); i++) {
			if(clinic.get(i) instanceof PatientBasic && patient instanceof PatientBasic) {
				PatientBasic patientBasic1 = (PatientBasic) clinic.get(i);
				PatientBasic patientBasic2 = (PatientBasic) patient;
				if(patientBasic1.getCpf().equals(patientBasic2.getCpf())) {
					System.out.println("Paciente ja Adicionado!");
				}else {
					clinic.add(patient);
					System.out.println("Adicionado com Sucesso");
				}
				
				if(clinic.get(i) instanceof PatientPremium && patient instanceof PatientPremium) {
					PatientPremium patientPremium1 = (PatientPremium) clinic.get(i);
					PatientPremium patientPremium2 = (PatientPremium) patient;
					if(patientPremium1.getCpf().equals(patientPremium2.getCpf())) {
						System.out.println("Paciente ja Adicionado!");
					}else {
						clinic.add(patient);
						System.out.println("Adicionado com Sucesso");
					}
				}
			}
		}
	}
	
	public void removerPaciente(String cpf) {
		
	}
	//REMOVER PACIENTE
	//REMARCAR CONSULTA
	//TOTAL PACIENTE PREMIUM
	//TOTAL PACIENTE BASIC
	//TOTAL DE LUCRO CLINICA
	//MARCAR CONSULTA
	
	
	//POSSIVEL IDEIA
	//GASTO TOTAL CLINICA (FUNCIONARIOS E MATERIAIS)
}
