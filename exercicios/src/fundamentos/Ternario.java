package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5 ? "em Recuperação." : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
	}
}
