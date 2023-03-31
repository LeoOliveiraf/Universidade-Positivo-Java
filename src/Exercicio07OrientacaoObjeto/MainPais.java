package Exercicio07OrientacaoObjeto;

public class MainPais {
	public static void main(String[] args) {
		Pais pais1 = new Pais("BRA", "Brasil", 214300, 8.514, null);
		Pais pais2 = new Pais("BRA", null, null, 0, null);
		Pais pais3 = new Pais("ARG", null, null, 0, null);
		
		if(pais1.equals(pais2)) {
			System.out.println("Os dois Objetos são iguais por que tem o mesmo CODIGO");
		}else {
			System.out.println("Os dois Objetos não são iguais por que NÃO tem o mesmo CODIGO");
		}
	}
}
