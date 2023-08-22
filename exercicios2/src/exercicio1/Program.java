package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		System.out.print("Digite o valor da largura: ");
		r.width = sc.nextDouble();
		System.out.print("Digite o valor do comprimento: ");
		r.height = sc.nextDouble();
		
		System.out.printf("Área: %.2f",  r.area());
		System.out.printf("\nPerímetro: %.2f", r.perimetro());
		System.out.printf("\nDiagonal: %.2f", r.diagonal());
		
		
		
		
		sc.close();
	}
}
