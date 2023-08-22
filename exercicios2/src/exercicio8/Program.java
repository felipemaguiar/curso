package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		/*
		 * Fazer um programa para ler dois números M e N, e depois ler
		 * uma matriz de M linhas por N colunas contendo número inteiros,
		 * podendo haver repetições. Em seguida, ler um número inteiro X que
		 * pertence à matriz. PAra cada ocorrência de X, mostrar os valores à
		 * esquerda, acima, à direita e abaixo de X, quando houver.
		 */
		
		System.out.print("Número de Linhas: ");
		int M = sc.nextInt();
		System.out.print("Número de colunas: ");
		int N = sc.nextInt();
		
		int[][] matriz = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
		System.out.print("Número: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(x == matriz[i][j]) {
					System.out.println("Position: "+ i + ", " + j + ": ");
					if(j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
	
	
}
