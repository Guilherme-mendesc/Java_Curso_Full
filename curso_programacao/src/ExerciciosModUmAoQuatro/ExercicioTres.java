package ExerciciosModUmAoQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double pi = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double exUm = pi* Math.pow(a, 2.0);
		double exDois = pi*Math.pow(b, 2.0);
		double exTres = pi*Math.pow(c, 2.0);
		
		System.out.printf("A = %.4f%n ", exUm);
		System.out.printf("A = %.4f%n ", exDois);
		System.out.printf("A = %.4f%n ", exTres);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
