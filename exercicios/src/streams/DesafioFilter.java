package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis", 1.20, 0.05, 15);
		Produto p2 = new Produto("Notebook", 3620.00, 0.12, 0.0);
		Produto p3 = new Produto("Caderno", 25.50, 0.15, 20.0);
		Produto p4 = new Produto("Impressora", 2000, 0.5, 0);
		Produto p5 = new Produto("iPad", 4500, 0.32, 0);
		Produto p6 = new Produto("Calculadora", 90.50, 0.15, 20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		//Filter, filter, map
		
		Predicate<Produto> grandeDesconto = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$ " + p.preco;
		
		produtos.stream()
			.filter(grandeDesconto)
			.filter(freteGratis)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
		
	}
}
