package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		Consumer<Integer> print2 = System.out::println;
		List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9);
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Reverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		
		
		Function<Integer, String> bin = n -> Integer.toBinaryString(n); // Convertendo	decimal em binário		
		nums.stream().map(bin).forEach(print);
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();	// Invertendo uma string
		nums.stream().map(bin).map(inverter).forEach(print);

		
		Function<String, Integer> dec = n -> Integer.parseInt(n, 2); // Convertendo Bin
		nums.stream().map(bin).map(inverter).map(dec).forEach(print2);
	}
}
