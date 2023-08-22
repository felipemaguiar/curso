package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			ps.addValue(sc.next());
		}
		
		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		
		sc.close();

	}

}
