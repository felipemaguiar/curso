package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// Criando uma lista
		List<String> list = new ArrayList<>();
		
		//Adicionando elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Marco");
		list.add("Fabricio");
		
		
		
		// Saber o tamanho da lista
		System.out.println(list.size());
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		// Inserir um elemento na posição 2
		list.add(2, "Felipe");
				
		// Remover a Anna da lista
		list.remove("Anna");
				
		// Remover quem está na posição 1
		list.remove(1);
				
		// Remover da lista o que atende um predicado, exemplo, o que começa com a letra M.
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		//Encontrar a posição do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("------------------");
		
		// Deixar na lista somente as pessoas que só começam com F
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		// Encontrar o primeiro elemento que começa com a letra F
		
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
		System.out.println(name);
		
		// Encontrar o primeiro elemento que começa com J
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}
}
