package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Fe", "Le", "Jana", "Mel");
		
//		for (int i = 0; i<aprovados.size(); i++) {
//			System.out.println(aprovados.get(i));
//		}
		
		// Utilizando o ForEach - Forma mais otimizada
		
//		for(String nome: aprovados) {
//			System.out.println(nome);
//		}
		
		// Usando o Iterator...
		
//		Iterator<String> it = aprovados.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		System.out.println("Utilizando uma Stream");
		
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); // Laço interno !!!
	}
}
