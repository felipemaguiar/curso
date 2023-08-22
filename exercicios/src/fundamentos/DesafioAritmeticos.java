package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double a = Math.pow((6 * (3 + 2)) , 2) / (2 * 3);
		
		double c = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		
		double sup = Math.pow((a - c), 3);
		double inf = Math.pow(10, 3);
		
		double fim = (sup / inf);
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(sup);
		System.out.println(inf);
		System.out.println(fim);
		
		
	}
}
