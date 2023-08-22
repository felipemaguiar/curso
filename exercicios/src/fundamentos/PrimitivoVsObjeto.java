package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = "texto";
		s.toUpperCase();
		
		String d = new String("Texto");
		d.toUpperCase();
		
		// Wrappers são as versões objeto dos tipos primitivos!
		int a = 123;
		
		System.out.println(a);
	}
}
