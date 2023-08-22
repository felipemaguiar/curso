package fundamentos;

import java.util.Scanner;

public class ExercicioSegundoGrau {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cálculo para determinar o delta e uma equação do segundo grau.");
		System.out.print("Digite o valor de a: ");
		double a = entrada.nextDouble();
		System.out.print("Digite o valor de b: ");
		double b = entrada.nextDouble();
		System.out.print("Digite o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = (b * b) - 4 * a * c;
		
		System.out.printf("Delta = %.2f", delta);
		
		entrada.close();
		
	}
}
