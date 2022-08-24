package ExerciciosModUmAoQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int exUm = a + b;
		int exDois = (b*-1)+a;
		int exTres = c+c;
		
		System.out.println("SOMA = "+ exUm);
		System.out.println("SOMA = "+ exDois);
		System.out.println("SOMA = "+ exTres);
		
		
		sc.close();
		

	}

}
