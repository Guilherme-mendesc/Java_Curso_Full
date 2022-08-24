package ExerciciosModCinco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		if(a<0.0 || a>100.0) {
			System.out.println("fora de intervalo");
		}
		
		else if( a <=25){
			System.out.println("Intervalo 0,25");
		}
		else if(a <=50){
			System.out.println("Intervalo 25,50");
		}
		else if(a <=75){
			System.out.println("Intervalo 25,50");
		}
		else {
			System.out.println("Intervalo 75,100");
		}
			
		
		
		
		
		
		sc.close();

	}

}
