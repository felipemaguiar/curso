package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Felipe", "Magalhães", 33);
		p1.setIdade(-20); // alterar 
				
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1); // ler
		System.out.println(p1.getNomeCompleto());
	}
}
