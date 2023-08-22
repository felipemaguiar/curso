package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Felipe");  // Lança uma exceção
		fila.offer("Janaina");
		fila.add("Leticia");
		fila.offer("Nadia");
		fila.add("Mel");
		
		// Peek e element -> Obter o próximo elemento da fila (sem remover)
		// Diferença é o comportamento
		// quando a fila está vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty() -> verifica se a fila está vazia
		//fila.contains(...)
		
		
		// Poll e Remove -> Obter o próximo elemento da fila e remove!
		System.out.println(fila.poll()); // Retorna false
		System.out.println(fila.remove()); // Retorna uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	
		
	}
}
