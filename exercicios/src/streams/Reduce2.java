package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Felipe", 7.1);
		Aluno a2 = new Aluno("Jana", 8.1);
		Aluno a3 = new Aluno("Mel", 4.1);
		Aluno a4 = new Aluno("Le", 6.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.stream()
			.filter(aprovados)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
	}
}
