package entidades;

public class FuncionarioTerceirizado extends Funcionario{

	private Double cobrancaAdicional;

	public FuncionarioTerceirizado() {
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer hora, Double valorPorHora, Double cobrancaAdicional) {
		super(nome, hora, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + 1.1 * cobrancaAdicional;
	}
}
