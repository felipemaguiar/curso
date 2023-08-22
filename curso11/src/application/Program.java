package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N e uma matriz de ordem N contendo 
		 * números inteiros. Em seguir, mostrar a diagonal principal e a quantidade
		 * de valores negativos da matriz.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// Criando uma matriz bidimensional
		
		int[][] mat = new int[n][n];
		
		// Ler a matriz
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Imprimindo a diagonal
		System.out.println("Main diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative number = " + count);
		
		sc.close();
	}
}
