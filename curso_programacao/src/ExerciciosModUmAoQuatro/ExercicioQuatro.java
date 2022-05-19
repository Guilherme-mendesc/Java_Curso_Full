package ExerciciosModUmAoQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		
		double exUm = (a*b)-(c*d);
		double exDois =(a*b)-(-c*d);
		System.out.printf("A = %.4f%n ", exUm);
		System.out.printf("A = %.4f%n ", exDois);
		
		
		sc.close();
		

	}

}
