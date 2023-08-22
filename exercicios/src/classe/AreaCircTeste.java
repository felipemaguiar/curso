package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;		
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
		// a2.pi = 5;		
		System.out.println(a2.area());
		
		// Podemos acessar o pi diretamente da classe -> Modificando a istância.
		// AreaCirc.pi = 3.1415; -> Não é possível modificar pois ele foi acrescido de final
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		// Versão do pi no java
		System.out.println(Math.PI);
		
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(20));
		
	}
}
