package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaString {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Leonardo");
		nomes.add("Guilherme");
		nomes.add("Lucas");
		nomes.add("Vitor");
		nomes.add("Zelda");
		
		System.out.println("Bagunçado: " + nomes);
		
		Collections.sort(nomes);
		
		System.out.println("Ordenado: " + nomes);
		
		System.out.println("Busca Binaria pelo nome Vitor: " + Collections.binarySearch(nomes, "Vitor"));
		
		System.out.println("Menor nome: " + Collections.min(nomes));
		
		System.out.println("Maior nome: " + Collections.max(nomes));
	}

}
