package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program04 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-09-13T11:15:26");
		Instant d03 = Instant.parse("2022-09-13T11:15:26Z");
		
		
		LocalDate pastWeeLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		
		System.out.println("pastWeekLocalDate = " +pastWeeLocalDate);
		System.out.println("nextWeekLocalDate = " +nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDatetime = d02.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " +pastWeekLocalDateTime);
		System.out.println("NextWeekLocalDateTime = " +nextWeekLocalDatetime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstnat = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " +pastWeekInstant);
		System.out.println("NextWeekInstant = " +nextWeekInstnat);
		
		Duration t1= Duration.between(pastWeeLocalDate.atTime(0,0), d01.atTime(0,0));
		Duration t2= Duration.between(pastWeeLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t3= Duration.between(pastWeekLocalDateTime, d02);
		
		System.out.println("t1 dias= "+ t1.toDays());
		System.out.println("t1 dias= "+ t2.toDays());
		System.out.println("t1 dias= "+ t3.toDays());
		
	}

}
