package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Felipe", 7.1);
		Aluno a2 = new Aluno("Jana", 8.1);
		Aluno a3 = new Aluno("Mel", 4.1);
		Aluno a4 = new Aluno("Le", 5.1);
		Aluno a5 = new Aluno("Te", 8.1);
		Aluno a6 = new Aluno("Qe", 6.3);
		Aluno a7 = new Aluno("Te", 8.1);
		Aluno a8 = new Aluno("Le", 5.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8 );
		
		System.out.println("distinct...");
		
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream().distinct().skip(1).takeWhile(a -> a.nota >= 7).forEach(System.out::println);
		
		
	}
}
