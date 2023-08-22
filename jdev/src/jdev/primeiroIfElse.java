package jdev;

public class primeiroIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Operadores ternários são para micro validações */
		
		int nota1 = 30;
		int nota2 = 40; 
		int nota3 = 50; 
		int nota4 = 40; 
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(saidaResultado);
	}

}
