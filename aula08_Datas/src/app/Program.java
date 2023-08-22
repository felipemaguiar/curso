package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/index.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // Gera a data atual local
		LocalDateTime d02 = LocalDateTime.now(); // Gera a data e a hora local
		Instant d03 = Instant.now(); // Gera a data ea hora global
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // Pegar um texto iso e transformar em data
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Pegar um texto iso e transformar em data hora
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Formato Global
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Colocou o local Brasil que é -03:30 e ele irá trazer o horário de londres
		
		// Texto no formato Customizado
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Precisa trazer o argumento de como vai interpretar o texto. neste caso o fmt1
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); 
		LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));  //outra maneira de escrever o modelo de cima
		
		// Informando dia mes e ano isoladamente
		
		LocalDate d11 = LocalDate.of(2022, 07, 20);
		LocalDateTime d12 = LocalDateTime.of(2022, 07, 20, 01, 30);
		
		System.out.println("d01 = " + d01.toString()); // Posso colocar toString() ou não
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());		
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		System.out.println("d12 = " + d12.toString());
		
		/*
		 * TRANSFORMANDO PADRÃO ISO PARA texto
		 */
		
		LocalDate d13 = LocalDate.parse("2023-01-25");
		LocalDateTime d14 = LocalDateTime.parse("2023-01-25T10:30:25");
		Instant d15 = Instant.parse("2023-01-25T10:30:25Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		// Pegando um texto padrão iso e transformando em texto
		
		System.out.println("d13 = " + d13.format(fmt3)); // Pode ser este tipo ou o debaixo
		System.out.println("d13 = " + fmt3.format(d13));
		System.out.println("d13 = " + d13.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d14 = " + d14.format(fmt3));
		System.out.println("d14 = " + d14.format(fmt4));
		
		//Imprimindo uma data de uso global
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // pega o fusohorário do sistema local.
		System.out.println("d15 = " + fmt5.format(d15)); 
		
		// Convertendo data-hora global para local
		System.out.println("Convertendo data-hora global para local");
		
		LocalDate d001 = LocalDate.parse("2023-01-25");
		LocalDateTime d002 = LocalDateTime.parse("2023-01-25T01:15:30");
		Instant d003 = Instant.parse("2023-01-25T01:16:30Z");
		
		// Locais onde podemos pegar as zonas de horário
//		for (String s: ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		LocalDate r1 = LocalDate.ofInstant(d003, ZoneId.systemDefault()); //Convertendo um instant para uma data local considerando o fuso do meu computador
		LocalDate r2 = LocalDate.ofInstant(d003, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d003, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d003, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// Obter dados de uma data-hora local
		
		System.out.println("d001 dia = " +d001.getDayOfMonth());
		System.out.println("d001 mês = " +d001.getMonthValue());
		System.out.println("d001 ano = " +d001.getYear());
		
		System.out.println("d002 hora = " + d002.getHour());
		System.out.println("d002 minuto = " + d002.getMinute());
		
		
		
	}
}
