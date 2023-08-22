package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Felipe");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta",2.85, 10);
		compra1.adicionarItem(new Produto("Notebook", 2020.00), 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno",15.85, 3);
		compra2.adicionarItem(new Produto("calculadora", 125.15), 1);
		
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValortotal());
	}
}
