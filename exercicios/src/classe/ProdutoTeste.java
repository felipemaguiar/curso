package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		

		Produto p1 = new Produto("Notebook", 4356.99);
		
		var p2 = new Produto();
		p2.nome = "Cane Preta";
		p2.preco = 10.20;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		
		System.out.println(p1.nome + " R$: " + precoFinal1);
		System.out.println(p2.nome + " R$: " + precoFinal2);
		
		System.out.println();
		
	}
}
