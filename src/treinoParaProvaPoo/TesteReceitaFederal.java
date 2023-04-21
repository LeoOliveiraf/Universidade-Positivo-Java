package treinoParaProvaPoo;

public class TesteReceitaFederal {

	public static void main(String[] args) {
		ReceitaFederal rf = new ReceitaFederal();
		
		Juridica j = new Juridica("Leonardo", "Rua tal", 1200, "112345655");
		Juridica j2 = new Juridica("Lucas", "Rua fulado", 1000, "87328793893");
		
		Fisica f = new Fisica("Maria", "Rua tal", 3000, "548611");
		Fisica f2 = new Fisica("Nayara", "Rua peixoto", 5000, "889387753");

		
		rf.addPessoa(j);
		rf.addPessoa(f);
		rf.addPessoa(j2);
		rf.addPessoa(f2);
		System.out.println(rf.qtdFisica());
		System.out.println(rf.qtdJuridica());
		rf.calcImp("Nayara");
		System.out.println(rf.totalImposto());
		System.out.println(rf.imprime());
	}

}
