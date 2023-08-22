package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas irá informar? ");
		
		int totalNotas = entrada.nextInt();
		
		double[] notasAluno = new double[totalNotas];
		
		for(int contador = 0; contador < totalNotas; contador++  ) {
			System.out.print("Digite a " + (contador + 1) + " nota: \n");
			notasAluno[contador] = entrada.nextDouble();			
		}
		
		double total = 0;
		for (double nota: notasAluno) {
			total += nota;			
		}
		
		double media = total / notasAluno.length;		
		System.out.println("A média do aluno é " + media);
		
		entrada.close();
	}
}
