package CursoJavaBasico;

public class Aula02 {
	String marca;//atributo
	String modelo;//atributo
	int numPassageiros;//atributo
	double capCombustivel;//atributo
	double consumoCombustivel;//atributo
	
	
	public Aula02(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parametro");
	}
	public Aula02(String marca, String modelo) {
		this(marca, modelo, 2);
		System.out.println("Chamando o construtor com 2 parametros");
	}
	public Aula02(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	public Aula02() {
		
	}
	//Metodo sem retorno "void
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	//Metodo com retorno "double"
	double obterAutonomia() {
		System.out.println("Metodo ObterAutonomia foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}
	//Metodo com parametro (pode ser o tipo de retorno que quiser)
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
	//Exemplo de Costrutor com Parametro
	//Aula02(String marca_){
		//marca = marca_;
	//}
	
}
