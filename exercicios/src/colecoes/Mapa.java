package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuario = new HashMap<>();
		
		usuario.put(1,"Felipe");
		usuario.put(2, "Janaina");
		usuario.put(3, "Leticia");
		usuario.put(4, "João");
		
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.keySet()); // Retorna as chaves
		System.out.println(usuario.values()); //  retorna somente os valores
		System.out.println(usuario.entrySet()); // retorna chave e valor
		System.out.println(usuario.containsKey(3)); 
		System.out.println(usuario.containsValue("Felipe"));
		
		System.out.println(usuario.get(3)); // Retorna o elemento 3
		
		for(int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuario.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
