package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
//		double preco = p.preco;
//		double desconto = p.desconto;
		
		//BinaryOperator<Double> precoComDesconto = (x, d) -> x * (1 - d);
		//System.out.println(precoComDesconto.apply(preco, desconto));
//		
//		BiFunction<Double, Double, Double> impostoMunicial = (x, i) -> x >= 2500 ? (x *  (i / 100)) : x;
//		System.out.println(Math.round(impostoMunicial.apply(preco, 8.5)));
//		
//		Function<Double, Double> frete = f -> f >= 3000 ? 100.00 : 50.00;
//		System.out.println(precoComDesconto.andThen(frete).apply(preco, desconto));
		
		// Método da aula
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicial = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$ " + preco).replace(".", ",");
		
		
		String preco = precoFinal
				.andThen(impostoMunicial)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preco final é " + preco);
	}
}
