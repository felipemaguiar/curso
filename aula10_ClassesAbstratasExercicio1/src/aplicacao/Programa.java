package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.Empresarial;
import entidades.Individual;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Insira o número de contribuíntes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Contribuinte n°" + i);
			System.out.print("Individual ou empresarial (i/e)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Rendimento anual: ");
			double rendimento = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Gastos com Saúde: ");
				double gastosComSaude = sc.nextDouble();
				lista.add(new Individual(nome, rendimento, gastosComSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numeroDeFuncionarios = sc.nextInt();
				lista.add(new Empresarial(nome, rendimento, numeroDeFuncionarios));
			}
		}
		
		double soma = 0.0;
		System.out.println();
		System.out.println("Imposto Pago: ");
		for (Contribuinte con : lista) {
			double taxa = con.taxa();
			System.out.println(con.getNome() + ": R$ " + String.format("%.2f", taxa));
			soma += taxa;
		}
		
		System.out.println();
		System.out.println("Total de Taxas: R$ " + String.format("%.2f", soma));
		
		
		sc.close();
	}
}
