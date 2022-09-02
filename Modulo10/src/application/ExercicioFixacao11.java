package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, quantidadeHomem, quantidadeMulher;
		double menorAltura, maiorAltura, alturaFemMedia, alturaFemTotal;
		
		System.out.println("Quantas pessoas serao digitadas: ");
		n= sc.nextInt();
		
		double[] alturas = new double[n];
		char[] generos=new char[n];
				
		for (int i = 0; i<n ; i++) {
			System.out.printf("Altura da %da pessoa ", i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:  ", i+1);
			generos[i] = sc.next().charAt(0);
		}
		
		menorAltura=alturas[0];
		maiorAltura=alturas[0];
		
		for (int i =1; i<n ; i++) {
			if(alturas[i]>maiorAltura) {
				maiorAltura=alturas[i];
			}
			if(alturas[i]>menorAltura) {
				menorAltura=alturas[i];
			}
		}
		
		quantidadeHomem=0;
		quantidadeMulher=0;
		alturaFemTotal=0;
		
		for(int i=0; i<n; i++) {
			if(generos[i]=='M') {
				quantidadeHomem++;
			}
			else {
				quantidadeMulher++;
				alturaFemTotal=alturaFemTotal+alturas[i];
			}
			
		}
		alturaFemMedia = alturaFemTotal/quantidadeMulher;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Menor altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
		System.out.printf("Numero de homens = %d\n", quantidadeHomem);
		
		
		
		
		sc.close();
	}

}
