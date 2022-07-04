package ExerciciosModSeis;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUri1114 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;
		double media = 0;
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		if (media > 0) {
			media = soma / cont;
			System.out.println("%.2f%n" + media);
		} else {
			System.out.println("impossivel calcular");
		}

		sc.close();

	}

}
