package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double total = 0;
		double nota = 0;
		int cont = 0;
		
		while (nota != -1) {
			System.out.print("Digite a nota (-1) para sair: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				total += nota;
				cont += 1;
			} else if(nota != -1) {
				System.out.println("Nota inválida, digite novamente");
			}
		}
		double media = total / cont;
		System.out.printf("Média: %.2f", media);
		
		entrada.close();
	}
}
