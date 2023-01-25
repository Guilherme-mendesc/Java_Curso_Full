package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade, posicaoMaior;
		
		System.out.println("quantas pessoas serao digitadas? ");
		 n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int [n];
		
		for (int i = 0; i<n ; i++) {
			System.out.println("Dados da" + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("idade: ");
			idades[i] = sc.nextInt();

		}
		maiorIdade=idades[0];
		posicaoMaior=0;
		
		for(int i=1; i<n; i++) {
			if(idades[i]>maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaior =i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n ", nomes[posicaoMaior]);
		
		
		
		
		sc.close();
	

	}

}
