package entidades;

public class Empresarial extends Contribuinte {

	private Integer numeroDeFuncionarios;
	
	public Empresarial(String nome, Double rendimentoAnual, Integer numeroDeFuncionarios) {
		super(nome, rendimentoAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double taxa() {
		if(numeroDeFuncionarios > 10) {
			return getRendimentoAnual() * 0.14;
		}
		else {
			return getRendimentoAnual() * 0.16;
		}
	}
	
	
}
