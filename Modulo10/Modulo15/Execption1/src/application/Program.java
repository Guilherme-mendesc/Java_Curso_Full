package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			System.out.println("Numero quarto: ");
			int number = sc.nextInt();
			System.out.print("Check-in data (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out data (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());		
				
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation "+reservation);
			
			System.out.println();
			System.out.println("Entre com a nova data da reserva: ");
			System.out.print("Check-in data (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out data (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.datasAtualizadas(checkIn, checkOut);
			System.out.println("Reserva: " + reservation);
		}
		
		catch(ParseException e) {
			System.out.println("formato de data invalida");
		}
		catch(DomainException e) {
			System.out.println("Erro na reserva: "+ e.getMessage());
		}
		catch(RuntimeException e ) {
			System.out.println("Erro inesperado: ");
		}
		
		sc.close();

		}
}



