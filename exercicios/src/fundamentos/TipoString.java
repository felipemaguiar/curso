package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(4)); // A posição da letra
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // Pergunta se inicia com a palavra Boa
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase()); // letras minúsculas
		System.out.println(s.length()); // Quantidade de caractere
		System.out.println(s.endsWith("tarde")); // Pergunta se termina com a palavra tarde
		System.out.println(s.equals("boa tarde")); // Pergunta se é igual
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Ignora as letras maiuscula
		
		var nome = "Felipe";
		var sobrenome = "Magalhães";
		var idade = 33;
		var salario = 8987.32;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		System.out.printf("Nome: %s %s tem %s anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s %s tem %s anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
