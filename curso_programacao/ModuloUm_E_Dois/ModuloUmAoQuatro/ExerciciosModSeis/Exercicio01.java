package ExerciciosModSeis;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha=sc.nextInt();
		
		while(senha != 2002) {
			
			System.out.println("senha incorreta");
			senha =sc.nextInt();
		}
			System.out.println("acesso permimido");
			sc.close();
		}
	

		
		
	}


