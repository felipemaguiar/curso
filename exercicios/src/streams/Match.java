package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Felipe", 7.1);
		Aluno a2 = new Aluno("Jana", 8.1);
		Aluno a3 = new Aluno("Mel", 4.1);
		Aluno a4 = new Aluno("Le", 9.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Predicate<Aluno> reprovados = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados)); // allMatch - todos
		System.out.println(alunos.stream().anyMatch(aprovados)); // anyMatch - algum
		System.out.println(alunos.stream().noneMatch(reprovados)); // noneMatch - nenhum
		
		
	}
}
