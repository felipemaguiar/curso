package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("NOME: ");
		student.name = sc.nextLine();
		System.out.print("\nNOTA1: ");
		student.n1 = sc.nextDouble();
		System.out.print("\nNOTA2: ");
		student.n2 = sc.nextDouble();
		System.out.print("\nNOTA3: ");
		student.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.media());
		
		if(student.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINT%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
