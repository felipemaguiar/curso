package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// Não ceita valores repetidos
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Interger
		conjunto.add('X');
		
		System.out.println("Tamanho é: " + conjunto.size()); // Tamanho do conjunto
		
		conjunto.add("teste");
		System.out.println("Tamanho é: " + conjunto.size());
		conjunto.add('X');
		System.out.println("Tamanho é: " + conjunto.size());
		
		// Removento elementos do conjunto
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains('X')); // Para verificar se o elemento está dentro do conjunto.
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//Fazer a união entre os conjuntos
		
		// conjunto.addAll(nums); 
		System.out.println(conjunto);
		
		// Fazendo a intersecção
		//conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		// Limpando o conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
