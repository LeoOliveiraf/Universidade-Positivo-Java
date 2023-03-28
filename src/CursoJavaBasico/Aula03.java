package CursoJavaBasico;

public class Aula03 {
//Modificadores de acesso Private Public
	String marca;//atributo
	String modelo;//atributo
	int numPassageiros;//atributo
	double capCombustivel;//atributo
	double consumoCombustivel;//atributo
	
	//Metodo sem retorno "void
		void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
		}
		//Metodo com retorno "double"
		double obterAutonomia() {
			System.out.println("Metodo ObterAutonomia foi chamado. ");
			return capCombustivel * consumoCombustivel;
		}
		private double divideKmPorConsumoCombustivel(double km) {
			return km/this.consumoCombustivel;
		}
		//Metodo com parametro (pode ser o tipo de retorno que quiser)
		double calcularCombustivel(double km) {
			return this.divideKmPorConsumoCombustivel(km);
		}
		
		//Metodos GET e SET
		public String getMarca() {
			return this.marca;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return this.modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		//Tipo de Sobrecarga de Metodo
		public int soma(int num1, int num2) {
			return num1 + num2;
		}
		public int soma(int[] vetorInteiros) {
			int total = 0;
			for(int i=0; i<vetorInteiros.length; i++ ) {
				total += vetorInteiros[i];
			}
			return total;
		}
}
