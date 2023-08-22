package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + " !!!");
		
		Produto p1 = new Produto("Caneta", 12.10, 0.10);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 3560.10, 0.10);
		Produto p3 = new Produto("Caderno", 22.10, 0.15);
		Produto p4 = new Produto("Borracha", 5.20, 0.25);
		Produto p5 = new Produto("Lapis", 3.15, 0.33);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println("R$ " + p.preco));
		produtos.forEach(System.out::println);
	}
}
