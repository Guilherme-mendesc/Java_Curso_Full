package ExerciciosModUmAoQuatro;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double codPeca = sc.nextDouble();
		double numPeca = sc.nextDouble();
		double valorPeca = sc.nextDouble();
		double codPecaDois = sc.nextDouble();
		double numPecaDois = sc.nextDouble();
		double valorPecaDois = sc.nextDouble();
		
		double valorPagamento = (numPeca*valorPeca)+(numPecaDois*valorPecaDois);
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", + valorPagamento);
		
		sc.close();
		
		
	}

}
