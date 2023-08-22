package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < vetor.length; i++) {
			sum += vetor[i];
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);;
		}
		
		
		System.out.println("\nSOMA: " + sum);
		
		double media = sum / vetor.length;
		
		System.out.println("MEDIA: " + media);
		
		
		sc.close();
	}
}
