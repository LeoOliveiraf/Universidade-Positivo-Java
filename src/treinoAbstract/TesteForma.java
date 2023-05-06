package treinoAbstract;

import java.util.ArrayList;

public class TesteForma {
	public static void main(String[] args) {
		
		Retangulo ret1 = new Retangulo(5, 10);
		Circulo cir1 = new Circulo(5);
		
		ArrayList<Forma> forma = new ArrayList<Forma>();
		forma.add(ret1);
		forma.add(cir1);
		for(int i = 0; i < forma.size(); i++) {
			System.out.println(forma.get(i).toString());
			if(forma.get(i) instanceof Retangulo) {
				System.out.println("Area Retangulo: " + forma.get(i).calcularArea());
				System.out.println("Perimetro Retangulo: " + forma.get(i).calcularPerimetro());
			}else if(forma.get(i) instanceof Circulo){
				System.out.println("Area Ciculo: " + forma.get(i).calcularArea());
				System.out.println("Perimetro Ciculo: " + forma.get(i).calcularPerimetro());
			}
		}
	
	}

}
