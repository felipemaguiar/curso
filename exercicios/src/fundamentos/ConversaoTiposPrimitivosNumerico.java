package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.023655686898989; //Fazendo CAST -> Conversão explicita.
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}
}
