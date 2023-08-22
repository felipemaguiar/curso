package aplicaca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Entre com o número do funcionário: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionário N° " + i + " dados:");
			System.out.print("Terceirizado (s/n) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Taxa adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				Funcionario func = new FuncionarioTerceirizado(nome, horas, valorPorHora, cobrancaAdicional);
				lista.add(func);
			}
			else {
				Funcionario func = new Funcionario(nome, horas, valorPorHora);
				lista.add(func);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTO:");
		for (Funcionario func : lista) {
			System.out.println(func.getNome() + "  - R$ " + String.format("%.2f", func.pagamento()));
		}
		
		sc.close();
	}
}
