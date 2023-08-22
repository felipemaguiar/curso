package entidades;

public class ProdutoImportado extends Produto{

	private Double taxaAlfandega;
	

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		return taxaAlfandega + getPreco();
	}
	
	@Override
	public String precoTag() {
		return getNome()
				+ " R$ "
				+ String.format("%.2f", precoTotal())
				+ " (Taxa Alfandegária: R$ "
				+ String.format("%.2f", taxaAlfandega)
				+ ")";
	}
}
