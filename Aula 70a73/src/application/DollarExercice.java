package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class DollarExercice {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println(" Whats is the dollar price? ");
		double dolar = sc.nextDouble();
		System.out.println(" How many dollar will be bought? ");
		double buy = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(buy, dolar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		
		
		sc.close();

	}

}
