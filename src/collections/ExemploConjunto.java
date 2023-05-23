package collections;

import java.util.HashSet;
import java.util.Iterator;


public class ExemploConjunto {

	public static void main(String[] args) {
		HashSet<String> cargos = new HashSet<String>();//Não permite elementos repetidos
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Analista");//Vai aparecer somente uma vez
		cargos.add("Secretaria");
		cargos.add("Analista");
		cargos.add("Analista");
		//System.out.println(cargos);
		
		for(String cargo: cargos) {//Uma opção de varrer o HashSet
			System.out.println("Cargo: " + cargo);
		}
		
		//Outra opção de varrer o HashSet
		Iterator elemento = cargos.iterator();
		while(elemento.hasNext()) {
			System.out.println("Elemento atual: " + elemento.next());
		}
	}
}
