package excecao.personalizadaB;

import excecao.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Felipe", 7);		
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroNegativoException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Fim :D");
	}
}
