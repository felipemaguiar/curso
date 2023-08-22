package classe;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Felipe Magalhães";
		u1.email = "felipe@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Felipe Magalhães";
		u2.email = "felipe@email.com";
		
		System.out.println(u1 == u2);		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
		
		
	}
}
