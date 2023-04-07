package byteBankHeranca;

public class TesteReferencia {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Design desgi = new Design();
		desgi.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(desgi);
		System.out.println(controle.getSoma());	
	}
}
