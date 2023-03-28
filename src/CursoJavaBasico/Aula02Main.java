package CursoJavaBasico;

public class Aula02Main {
	public static void main(String[] args) {
		Aula02 carro = new Aula02(null, null);//null é só para tirar o erro nesse caso(nao quero passar parametro
		carro.marca = "Volkswagem";
		carro.modelo = "Up";
		carro.numPassageiros = 5;
		carro.capCombustivel = 45;
		carro.consumoCombustivel = 0.9;
		carro.exibirAutonomia();
		
		double autonomia = carro.obterAutonomia();
		//Valor foi recebido pela chamada do metodo obterAutonomia e armazenou o resultado na variavel autonomia
		System.out.println(autonomia);
		
		double qtdCombustivel10 = carro.calcularCombustivel(10); //Estamos passando o argumento parametro km = 10
		System.out.println("QtdCombustivel: " + qtdCombustivel10);
	
	
		Aula02Exercicio lampada = new Aula02Exercicio();
		lampada.ligarLampada();
		System.out.println("Lampada está: " + lampada.ligar);
		
		Aula02 construtor = new Aula02("Chevrolet", null);//pode passar quantos parametros quiser, só tem que passar eles no construtor primeiro
		construtor.modelo  = "Onix";
		System.out.println(construtor.marca);
		
		Aula02 usandoThis = new Aula02("BMW", "X1");
		System.out.println(usandoThis.numPassageiros);
	}
}
