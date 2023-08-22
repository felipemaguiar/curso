package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		
		Pessoa[] vetor = new Pessoa[n];
		
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Dados da pessoa:  \n");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double sum = 0;
		int somaMenor = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			sum += vetor[i].getAltura();
			if(vetor[i].getIdade() < 16) {
				somaMenor ++;
			}
		}
		
		double media = sum / vetor.length;		
		System.out.printf("\nAltura média: %.2f%n", media);		
		double porcentagemMenor = somaMenor / sum * 100;		
		System.out.printf("Pessoas com menos de 16 ano: %.2f%n", porcentagemMenor);
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		
		sc.close();
	}
}
