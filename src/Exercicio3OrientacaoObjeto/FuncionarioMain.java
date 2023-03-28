package Exercicio3OrientacaoObjeto;

import java.util.Scanner;

public class FuncionarioMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		System.out.println("Digite seu Sobrenome: ");
		String sobrenome = input.nextLine();
		System.out.println("Digite o valor da hora: ");
		double valorHora = input.nextDouble();
		System.out.println("Digite as Horas Trabalhas: ");
		double horas = input.nextDouble();
		double valor = input.nextDouble();
		System.out.println("Digite a porcentagem que deseja aumentar: ");
		double porcentagem = input.nextDouble();
		Funcionario funcionario = new Funcionario(nome, sobrenome, horas, valorHora);
		funcionario.setNome(nome);
		funcionario.setSobrenome(sobrenome);
		funcionario.setHoras(horas);
		funcionario.setValorHora(valorHora);
		System.out.println("\nNome Completo: " + funcionario.nomeCompleto(" "));
		System.out.println("\nSalario: " + funcionario.calcularSalario());
		System.out.println("\nNovo Valor por Hora: " + funcionario.incrementarHora(valor));
		System.out.println("\nDecrementar hora: " + funcionario.decrementarHora(valor));
		System.out.println("\nAumenta Valor hora: " + funcionario.aumentaValorHora(porcentagem));
	}
}
