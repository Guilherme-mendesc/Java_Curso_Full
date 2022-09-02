package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, somaPares=0, quantidadePares=0;
		double mediaPares;
		
		System.out.println("Quantos numeros voce irá digitar: ");
		n=sc.nextInt();
		
		int[] vetor= new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(vetor[i]%2==0) {
				somaPares = somaPares+vetor[i];
				quantidadePares++;	
			}
		}
		
		if(quantidadePares==0) {
			System.out.println("Nenhum numero par");
		}
		else {
			mediaPares = (double)somaPares/quantidadePares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
			
		}
		
		
		
		sc.close();
	}

}
