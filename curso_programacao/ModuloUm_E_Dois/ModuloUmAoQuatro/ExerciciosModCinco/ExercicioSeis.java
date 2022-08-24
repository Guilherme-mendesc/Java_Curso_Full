package ExerciciosModCinco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int duracao;
		
		if(a<b) {
			duracao=b-a;
		}
		else {
			duracao =24-a+b;
		}
		System.out.println("O jogo durou " +duracao + " Horas");
		
		
		
		
		sc.close();

	}

}
