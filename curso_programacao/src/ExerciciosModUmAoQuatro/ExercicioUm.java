package ExerciciosModUmAoQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("Area = " + area);
		System.out.println("PRECO = " + preco);
		System.out.println();
		System.out.printf("Area = %.2f%n", + area);
		System.out.printf("PRECO = %.2f%n", + preco);
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
