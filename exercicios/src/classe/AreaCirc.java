package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14; // final é acrescentado, assim não podemos modificar no nosso programa
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	double area() {
		return Math.pow(raio, 2) * PI;
	}		
	
	// Criando um método statico
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
