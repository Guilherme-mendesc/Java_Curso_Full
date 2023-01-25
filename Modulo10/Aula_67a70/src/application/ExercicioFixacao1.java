package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ExercicioFixacao1 {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangulo = new Retangle();
		
		System.out.println("Insira a altura");
		retangulo.width = sc.nextDouble();
		System.out.println("Insira o comprimento");
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());	
		System.out.printf("DIAGONAL = %.2f%n ", retangulo.diagonal());
		

		
		
		
		sc.close();
		
	}

}
