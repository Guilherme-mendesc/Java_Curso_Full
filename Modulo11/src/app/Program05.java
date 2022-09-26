package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program05 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-09-13T14:57:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		int minutos = cal.get(Calendar.MINUTE);
		int mes = cal.get(Calendar.MONTH);
		
		System.out.println(sdf.format(d)); 
		System.out.println("Minutos: "+ minutos);
		System.out.println("Mes: "+ mes);
		
		
		 
	}

}
