package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Felipe", 5.8);
		Aluno a3 = new Aluno("Jana", 9.8);
		Aluno a4 = new Aluno("Le", 6.8);
		Aluno a5 = new Aluno("Mel", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		
		alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabéns! " + a.nome + "! Você foi aprovado com a nota " + a.nota)
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		System.out.println("Outra maneira de utilizar o Filter");
		System.out.println();
		
		// Outra maneira de utilizado o filtro
		
		Predicate<Aluno>  aprovado = a -> a.nota >= 7; //Filter deve ser um predicado
		Function<Aluno, String> saudacaoAluno = a -> "Parabéns! " + a.nome + "! Você foi aprovado com a nota " + a.nota;
		
		alunos.stream().filter(aprovado).map(saudacaoAluno).forEach(System.out::println);
	}
}
