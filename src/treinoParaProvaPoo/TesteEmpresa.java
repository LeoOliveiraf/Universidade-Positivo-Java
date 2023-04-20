package treinoParaProvaPoo;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Empresa emp = new Empresa();
		Assalariado ass = new Assalariado();
		ass.setNome("Leo");
		ass.setSetor("ADM");
		ass.setSalario(1000);
		ass.setCpf("12355652");
		Horista h = new Horista();
		h.setNome("pedro");
		h.setQtdHora(10);
		h.setCpf("155651");
		h.setSetor("ADM");
		h.setValorHora(50);
		emp.addEmpregado(h);
		emp.addEmpregado(ass);
		System.out.println(emp.funciAssala());
		System.out.println(emp.funciHorista());
		System.out.println(emp.qtdFunci());
		System.out.println(emp.gastoMensal());
		

	}

}
