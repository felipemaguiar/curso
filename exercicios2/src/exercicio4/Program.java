package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double many = sc.nextDouble();
		
		double valor = CurrencyConverter.reais(price, many);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", valor);
		
		sc.close();
	}

}
