package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cadastro cadastro;
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();		
		System.out.print("Enter acocount holder: ");
		sc.nextLine(); // Compreender a quebra de linha que não foi foi no nextInt
		String holder = sc.nextLine();
		System.out.print("\nIs there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			// NÃO PODE DECLARAR A VARIÁVEL DENTRO DO IF
			cadastro = new Cadastro(holder, number, initialDeposit);
		} else {
			cadastro = new Cadastro(holder, number);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(cadastro);
		
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		cadastro.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(cadastro);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		cadastro.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(cadastro);
		
		
		
		sc.close();

	}

}
