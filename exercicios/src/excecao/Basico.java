package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
				
		try {
		imprimirNomeDoAluno(a1);
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("O tipo de erro é: " + e.getMessage()); // Imprime o tipo de erro
			e.printStackTrace(); // imprime a linha em que houve a excecao
		}
		
		System.out.println("Fim :");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
