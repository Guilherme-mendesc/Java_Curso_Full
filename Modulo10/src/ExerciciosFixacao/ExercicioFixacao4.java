package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao4 {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n, quantidadePares;
	
	System.out.println("Quantos numero voce vai digitar ?");
	n=sc.nextInt();
	
	int[] vetor=new int[n];
	
	for(int i=0; i<n; i++) {
		System.out.println("Digite um numero: ");
		vetor[i] = sc.nextInt();
	}
	
	System.out.println("\nNumero Pares");
	
		quantidadePares=0;
		
	for(int i=0; i<n; i++) {
		if(vetor[i]% 2==0) {
			System.out.printf("%d ",vetor[i]);
			quantidadePares++;
		}
	}
	System.out.printf("\n\nQuantidade de Pares = %d\n", quantidadePares);
	
	sc.close();
	}
}