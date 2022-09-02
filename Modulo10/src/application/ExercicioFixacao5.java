package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posMaior;
		double maior;
		
		System.out.println("Quantos numeros voce vai digitar?");
		n=sc.nextInt();
		
		double[] vetor= new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posMaior = 0;
		
		for(int i=0; i<n; i++) {
			if(vetor[i]> maior) {
				maior= vetor[i];
				posMaior=i;
			}
		}
		
		System.out.printf("Maior valor = %.1f\n", maior);
		System.out.printf("Posicao Maior valor = %d\n", posMaior);
		

		
		
		sc.close();

	}

}
