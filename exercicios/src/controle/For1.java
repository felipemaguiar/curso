package controle;

public class For1 {

	public static void main(String[] args) {
		
		int cont = 0;
		
		while(cont < 10) {
			System.out.printf("i = %d\n", cont);
			cont += 1;
		}
		System.out.println("");
		for(int contador = 0; contador < 10; contador += 1) {
			System.out.printf("i = %d\n", contador);
		}
		
	}
}
