package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao7 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.println("Quantos elementos vai ter no vetor: ");
		n=sc.nextInt();
		
		double[] vetor = new double[n];
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero");
			vetor[i] = sc.nextDouble();
		}
		soma=0;
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero");
			soma = soma+vetor[i];
		}
		media=soma/n;
		
		System.out.printf("\n MEDIA DO VETOR = %.3f\n", media);
		System.out.printf("Elementos abaixo da media: \n");
		
		for(int i=0; i<n; i++) {
			if( vetor[i]<media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		
		
		
		sc.close();

	}

}
