package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestaInteiros {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(20);
		numeros.add(50);
		numeros.add(0);
		numeros.add(-10);
		numeros.add(60);
		numeros.add(20);
		System.out.println("Bagunçado: " + numeros);
		
		Collections.sort(numeros);//Ordena os Numeros do menor para Maior
		
		System.out.println("Ordenado: " + numeros);
		
		//BuscaBinaria (Vetor tem que estar ordenado)
		
		System.out.println(Collections.binarySearch(numeros, 0));//Retorna a posição do elemento
		//Se tentar buscar um Numero que não está na lista ele retorna - e a posição que deveria estar 
		//Por ex: Parametro: 15 ele retorna -3 ou seja posição 3
		
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		numeros2.add(15);
		numeros2.add(25);
		numeros2.add(30);
		System.out.println(Collections.disjoint(numeros2, numeros));
		
		System.out.println("Frequencia do Elemento 20 (Quantas vezes ele aparede) " + Collections.frequency(numeros, 20));
		
		System.out.println("Menor Elemento da Lista: " + Collections.min(numeros));
		
		System.out.println("Maior Elemento da Lista: " + Collections.max(numeros));
		
		Collections.reverse(numeros);//Invertendo a lista maior pro menor
		System.out.println("Invertendo Lista: " + numeros);
	}
}
