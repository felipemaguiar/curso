package classe;

public class Pessoa {

	String nome;
	int idade;
	double peso;
	
	Pessoa(String nome, int idade, double peso){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.pesoDaComida;
		}
	}
	
	String apresentar() {
		return "Olá, eu sou o " + nome + " tenho " + idade + " anos e peso " + peso + " kg";
	}
}
