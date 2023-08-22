package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		//+ - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação que deseja fazer: ");
		String op = entrada.next();
		
		
		
		//Lógica
		double res = "+".equals(op) ? num1 + num2 : 0;
		res = "-".equals(op) ? num1 - num2: res;
		res = "*".equals(op) ? num1 * num2: res;
		res = "/".equals(op) ? num1 / num2: res;
		res = "%".equals(op) ? num1 % num2: res;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, res);
		
		entrada.close();
	}
}
