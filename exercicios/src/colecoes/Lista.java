package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");		
		lista.add(u1);
		
		lista.add(new Usuario("Felipe"));
		lista.add(new Usuario("Janaina"));
		lista.add(new Usuario("Leticia"));
		lista.add(new Usuario("Carlos"));
		
		System.out.println(lista.get(3)); // imprimir o elemento do índice 3
		
		lista.remove(3);
		lista.remove(new Usuario("Ana"));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Felipe")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
		
	}
}
