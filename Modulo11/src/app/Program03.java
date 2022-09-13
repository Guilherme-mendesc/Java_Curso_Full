package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program03 {

	public static void main(String[] args) {
	
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-09-13T11:15:26");
		Instant d03 = Instant.parse("2022-09-13T11:15:26Z");
		
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Japan"));
		
		
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("r3 = "+r3);
		System.out.println("r4 = "+r4);
		
		System.out.println("r1 dia = "+r1.getDayOfMonth());
		System.out.println("r1 mes = "+r1.getMonthValue());
		System.out.println("r1 ano = "+r1.getYear());
	}

}
