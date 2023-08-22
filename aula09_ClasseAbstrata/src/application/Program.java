package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		List<Account> lista = new ArrayList<>();
		
		lista.add(new SavingsAccount(1001, "Alex", 500.00, 0.001));
		lista.add(new BusinessAccount(1002, "Felipe", 1000.00, 400.00));
		lista.add(new SavingsAccount(1003, "Jana", 300.00, 0.01));
		lista.add(new BusinessAccount(1004, "Le", 500.00, 500.00));
		
		double sum = 0.0;
		for (Account acc : lista) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for (Account acc : lista) {
			acc.deposit(10.0);
		}

		for (Account acc : lista) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
