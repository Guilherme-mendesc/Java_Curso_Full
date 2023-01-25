package ExerciciosModUmAoQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double numRegistro = sc.nextDouble();
	double horasTrabalhadas = sc.nextDouble();
	double valorHora = sc.nextDouble();
	
	
	double salario = horasTrabalhadas*valorHora;
	
	System.out.println("NUMBER = " + numRegistro);
    System.out.printf("SALARY = U$ %.2f%n", salario);
	
	
	
	
	sc.close();
}
}