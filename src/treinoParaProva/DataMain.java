package treinoParaProva;

public class DataMain {

	public static void main(String[] args) {
		Data dt = new Data(201224);
		System.out.println(dt.getDia());
		System.out.println(dt.getMes());
		System.out.println(dt.getAno());
		dt.getMesExtenso();
		System.out.println(dt.getBissexto());
	}

}
