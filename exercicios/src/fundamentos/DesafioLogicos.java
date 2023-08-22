package fundamentos;


public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 32\"? " + comprouTv32);
		System.out.println("Tomou sorvete ? " + tomouSorvete);
		System.out.println("Ficou mais saudável? " + !tomouSorvete);
		
		
	
	}
}
