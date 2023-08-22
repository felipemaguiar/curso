package fundamentos;


public class Wrappers {
	public static void main(String[] args) {
		
			
		// byte
		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt(entrada.next());
		Integer i = 10000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 25);
		
		Float f = 123F;
		System.out.println(f);
		
		Double d = 2334.556;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Converteu booleano para string e agora fez tudo maiuscula
		
		Character c = 'F'; // char
		System.out.println(c.toString());
		
		
		
	}
}
