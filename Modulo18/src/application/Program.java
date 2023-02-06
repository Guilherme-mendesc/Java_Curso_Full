package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("entre com o os dados do aluguel");
		System.out.println("Modelo do Carro: ");
		String  carModel = sc.nextLine();
		System.out.println();
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start =LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.println("Retorno(dd/MM/yyyy hh:mm): ");
		LocalDateTime finish =LocalDateTime.parse(sc.nextLine(),fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("Enter a price per hour ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Enter a price of day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoce(cr);
		System.out.println("FATURA: ");
		System.out.println("basic payment: " + cr.getInvoice().getBasicPayment());
		System.out.println("Tax: "+ cr.getInvoice().getTax());
		System.out.println("Total Payment: " + cr.getInvoice().gettotalPayment());
		
		
		
		sc.close();

	}

}
