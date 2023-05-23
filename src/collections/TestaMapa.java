package collections;

import java.util.HashMap;

public class TestaMapa {

	public static void main(String[] args) {
		HashMap<String, ContaCollections> contas = new HashMap<String, ContaCollections>();
		ContaCollections c1 = new ContaCollections(3000);
		ContaCollections c2 = new ContaCollections(1500);
		
		contas.put("Maria Neves", c1);
		contas.put("Paulo Silva", c2);
		
		System.out.println(contas.get("Maria Neves").getValorSaldo());
	}

}
