package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		// double a = 2.3;
		
		String s = "Bom dia X";
		s = s.toUpperCase(); // Deixa tudo maiusculo
		
		s = s.replace("X", "Senhora"); // Substitui a palavra
		s = s.concat("!!!"); // Adiciona no final
		
		System.out.println(s);
		
		// Outro exemplo
		System.out.println("Felipe".toUpperCase().toUpperCase().concat("!!!!"));
		
		String y = "Bom dia X".replace("X", "Felipe");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		
		
	}
}
