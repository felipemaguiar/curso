package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double tf = 60;
		final int C1 = 32;
		final double C2 = 5/9.0;
		double res = (tf - C1) * C2;
		
		System.out.println(tf + " °F = " + res + " °C");
		
		tf = -40;
		res = (tf - C1) * C2;
		System.out.println(tf + " °F = " + res + " °C");
	}
}
