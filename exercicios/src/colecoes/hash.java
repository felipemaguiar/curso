package colecoes;

import java.util.HashSet;

public class hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuario = new HashSet<>();
		
		usuario.add(new Usuario("Felipe"));
		usuario.add(new Usuario("Janaina"));
		usuario.add(new Usuario("Leticia"));
		
		boolean resultado = usuario.contains(new Usuario("Felipe"));
		System.out.println(resultado);
		
	}
}
