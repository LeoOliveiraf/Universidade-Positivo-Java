package ByteBank;

public class CriaConta {
	public static void main(String[] args) {
		System.out.println("--Primeira Conta--");
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		System.out.println("--Segunda Conta--");
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
	}
	
}
