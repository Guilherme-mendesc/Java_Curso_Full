package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double mediaAluno;
		
		System.out.println("Quantos alunos serao digitados: ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i =0; i<n; i++) {
			System.out.println("Digite o nome e primeira e segunda nota do "+(i+1)+ "� aluno ");
			sc.nextLine();
			nome[i]=sc.next();
				nota1[i] = sc.nextDouble();
				nota2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados");
		
		for(int i=0; i<n; i++) {
			
			mediaAluno=(nota1[i]+nota2[i])/2;
			
			if(mediaAluno>=6.0) {
				System.out.printf("%s\n", nome[i]);
				
			}
			
		}
		
		sc.close();
	}

}
