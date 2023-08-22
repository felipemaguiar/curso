package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ProdutoUsado extends Produto{

	private LocalDate fabricacao;
	
	

	public ProdutoUsado(String nome, Double preco, LocalDate fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}

	public LocalDate getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(LocalDate fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	@Override
	public String precoTag() {
		return getNome()
				+ " (Usado) R$ "
				+ String.format("%.2f", getPreco())
				+ " (Data de Produção: "
				+ fabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
}
