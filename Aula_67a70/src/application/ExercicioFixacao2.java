package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosFuncionario;

public class ExercicioFixacao2 {

	public static void main(String[] args) {

		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner (System.in);
		 
		 DadosFuncionario dados = new DadosFuncionario();
		 
		 System.out.println("Name: ");
		 dados.nome = sc.nextLine();
		 System.out.println("Salario: ");
		 dados.salario = sc.nextDouble();
		 System.out.println("Taxa :");
		 dados.taxa = sc.nextDouble();
		 
		 System.out.println();
		 System.out.println("Employee: "+ dados.nome +dados);
		 
		 System.out.println("Witch percentage to increase salary?");
		 double porcentagem = sc.nextDouble();
		 dados.incrimento(porcentagem);
		 
		 System.out.println();
		 System.out.println("Updated data"+dados);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 sc.close();

	}

}
