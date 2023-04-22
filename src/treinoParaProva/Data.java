package treinoParaProva;

public class Data {
	private int data;
	
	
	public Data() {
		super();
	}


	public Data(int data) {
		super();
		this.data = data;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}
	
	public int getDia() {
		int dia = this.data / 100;
		return dia / 100;
	}
	
	public int getMes() {
		int mes = this.data / 100;
		return mes % 100;
	}
	
	public int  getAno() {
		int ano = this.data % 100;
		return ano;
	}
	
	public void getMesExtenso() {
		int vetor[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		String meses[] = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		for(int i = 0; i < vetor.length;i++) {
			if(getMes() == vetor[i]) {
				System.out.println(getDia() + " de " + meses[i] + " de " + getAno());
			}
		}
	}
	public boolean getBissexto() {
		boolean bi = false;
		
		if((getAno() % 400 == 0) || (getAno() % 4 == 0)&&(getAno() % 100 != 0)) {
			return bi = true;
		}
		return bi;
	}
}
