package ExerciciosModCinco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % b ==0 || b%a== .0  ){
			System.out.println("São multiplos");	
		}
		else {
			System.out.println("nao sao multiplos");
		}
		
		
		sc.close();

	}

}
