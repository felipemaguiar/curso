package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do produto n° " + i);
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			if(tipo == 'i') {
				System.out.print("Taxa Alfandegária R$: ");
				Double taxa = sc.nextDouble();
				Produto prod = new ProdutoImportado(nome, preco, taxa);
				lista.add(prod);
			}else if(tipo == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Produto prod = new ProdutoUsado(nome, preco, data);
				lista.add(prod);
			} else {
				Produto prod = new Produto(nome, preco);
				lista.add(prod);
			}
			
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO: ");
		for (Produto prod : lista) {
			System.out.println(prod.precoTag());
		}
		
		
		
		sc.close();
	}
}
