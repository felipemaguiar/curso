package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Loja {

	public static void main(String[] args) {
		
		Clientes c1 = new Clientes("Felipe", 520.25, false);
		Clientes c2 = new Clientes("Jana", 1250.32, false);
		Clientes c3 = new Clientes("Mel", 2385.23, true);
		Clientes c4 = new Clientes("Le", 1256.25, true);
		Clientes c5 = new Clientes("Ana", 3520.25, false);
		Clientes c6 = new Clientes("Bia", 720.25, false);
		Clientes c7 = new Clientes("Leo", 90.25, true);
		Clientes c8 = new Clientes("Gui", 230.25, true);
	
		List<Clientes> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8);
		
		Predicate<Clientes> cliente = c -> c.valorCompra >= 1000;
		Predicate<Clientes> devendo = c -> c.devendoOuNao;
		Function<Clientes, String> resposta =
				c -> "O(A) Cliente " + c.nome + " Gastou RS " + c.valorCompra + " e ainda está devendo! ";
		
		clientes.stream()
			.filter(cliente)
			.filter(devendo)
			.map(resposta)
			.forEach(System.out::println);
	}
	
}
