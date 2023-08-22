package exercicio4;

public class CurrencyConverter {

	public static final double IOF = 1.06;
	
	public static double reais(double price, double many) {
		return price * many * IOF;
	}
}
