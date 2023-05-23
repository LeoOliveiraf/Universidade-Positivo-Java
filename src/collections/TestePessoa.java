package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestePessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Maria Neves", "111.111.111-11", "20/10/1992");
		Pessoa p2 = new Pessoa("João Miguel", "222.222.222-22", "10/05/1892");
		Pessoa p3 = new Pessoa("Pedro Lucas", "222.222.222-22", "30/01/1999");
		pessoas.add(p1);
		pessoas.add(p3);
		pessoas.add(p2);
		
		System.out.println("Bagunçado: \n" + pessoas);
		Collections.sort(pessoas);
		System.out.println("\nOrdenado: \n" + pessoas);
		
		System.out.println("\nMenor: " + Collections.min(pessoas));
		
		System.out.println("\nMaior: " + Collections.max(pessoas));
	}

}
