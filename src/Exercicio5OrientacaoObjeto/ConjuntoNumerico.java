package Exercicio5OrientacaoObjeto;

import java.util.ArrayList;

public class ConjuntoNumerico {
private ArrayList<Integer> conjuntoNum = new ArrayList<Integer>();
	
	public ConjuntoNumerico() {
		
	}
	
	public ConjuntoNumerico(ArrayList<Integer> conjuntoNum) {
		this.conjuntoNum = conjuntoNum;
	}
	public ArrayList<Integer> getConjuntoNum() {
		return conjuntoNum;
	}
	public void setConjuntoNum(ArrayList<Integer> conjuntoNum){
		this.conjuntoNum = conjuntoNum;
	}
	public Integer adicionar(Integer numero) {
		if(conjuntoNum.size() == numero) {
			System.out.println("Numero Invalido! Repetido");
		}else {
			 conjuntoNum.add(numero);
			System.out.println("Numero AD com Sucesso!");
		}
		return numero;
	}
	public void remover(Integer numero) {
		System.out.println("Removido: " + conjuntoNum.remove(numero) + " " + numero);
	}
	public void busca(Integer numero) {
		System.out.println("Posição: " + "["+conjuntoNum.indexOf(numero)+"]" + " " + numero);	
	}
	public void tamanho() {
		System.out.println("Tamanho: " + conjuntoNum.size());
	}
	public void imprime() {
		int i= 0;
		for(i=0; i<conjuntoNum.size();i++) {
			System.out.println("Valores da Lista: " + conjuntoNum.get(i));
		}
	}
}
