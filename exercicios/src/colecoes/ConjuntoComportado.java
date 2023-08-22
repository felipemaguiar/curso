package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();	// Não garante a ordem de inserção
		SortedSet<String> lista = new TreeSet<String>();	// Garante a ordem de inserção
		
		lista.add("Ana");
		lista.add("Felipe");
		lista.add("Janaina");
		lista.add("Leticia");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();	
		
		nums.add(1);
		nums.add(2);
		nums.add(7);
		nums.add(22);	
		
		for(int numeros: nums) {
			System.out.println(numeros);
		}
	}
}
