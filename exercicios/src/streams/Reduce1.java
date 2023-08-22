package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total = nums.stream().reduce(soma).get(); // Precisa atribuir a uma variável (total), já que reduce é uma função terminativa
		System.out.println(total);
		
		Integer total2 = nums.stream().reduce(100, soma); // Posso colocar o início da soma
		System.out.println(total2);
		
		
		//Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println); //Se estiver presente - imprima
	}
}
