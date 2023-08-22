package fundamentos;

public class Interferencia {
	
	public static void main(String[] args) {
		double a = 4.55;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		byte d = 3;
		System.out.println(d);
	}
}
