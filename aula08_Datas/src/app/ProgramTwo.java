package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramTwo {

	public static void main(String[] args) {
		System.out.println("Cálculo com data - hora");
		/*
		 * Data-hora +/- tempo -> Data-hora
		 */
		
		LocalDate d04 = LocalDate.parse("2023-01-25");
		LocalDateTime d05 = LocalDateTime.parse("2023-01-25T01:30:26");
		Instant d06 = Instant.parse("2023-01-25T01:30:26Z");
		
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); //Menos 7 dias
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		
		System.out.println("Past Week LocalDate: " + pastWeekLocalDate);
		System.out.println("Next Week LocalDate: " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); //Menos 7 dias
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("Past Week LocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("Next Week LocalDateTime: " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); //Menos 7 dias
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past Week Instant: " + pastWeekInstant);
		System.out.println("Next Week Instant: " + nextWeekInstant);
		
		/*
		 * Duração entre duas datas
		 */
		
		
//		Duration t1 = Duration.between(pastWeekLocalDate, d04); // Não dá para calcular com o local Date
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0)); // Convertemos pada Date Time
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t4 = Duration.between(pastWeekInstant, d06);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());		
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
	
}
