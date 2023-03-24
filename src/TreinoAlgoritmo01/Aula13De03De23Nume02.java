package Exercicio04;

import java.util.ArrayList;
import java.util.Collections;
public class Aula13De03De23Nume02 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		System.out.println(numeros.toString());
		System.out.println("Antes: " + numeros.size());
		numeros.add(10);
		System.out.println(numeros.toString());
		System.out.println("Depois: " + numeros.size());
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println("["+i+"]"  + numeros.get(i));
		}
		//COMO REMOVER UM ELEMENTO
		numeros.remove(2);
		System.out.println("ArrayList pós Remoção: " + numeros.toString());
		Integer objetoNumero = 5;
		numeros.remove(objetoNumero);
		System.out.println("ArrayList pós Remoção 2 Objeto: " + numeros.toString());
		//METODO CONTAINS
		objetoNumero = 4;
		numeros.contains(objetoNumero);
		System.out.println("Verifica de contem o elemento objetoNumero " + objetoNumero);
		//Nesse caso ele contem;
		numeros.set(0, objetoNumero);
		System.out.println("Array pós alteração: " + numeros.toString());
		//ORDENAÇÃO DE ELEMENTOS
		numeros.add(0);
		numeros.add(20);
		numeros.add(7);
		System.out.println("Array antes da ordenação: " + numeros.toString());
		Collections.sort(numeros);
		System.out.println("Array depois da ordenação: " + numeros.toString());
		
		//esqueleto do ArrayList<>
	}
}