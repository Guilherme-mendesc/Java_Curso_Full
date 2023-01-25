package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountExercicioFixacao;

public class ProgramBankExercicioFixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountExercicioFixacao account;
		
		
		System.out.println("Enter account number");
		int number = sc.nextInt();
		System.out.println("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an inital deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Enter a inital deposit value :");
			double initalDeposit = sc.nextDouble();
			account = new AccountExercicioFixacao (number,holder,initalDeposit);
		}
		else {
			account = new AccountExercicioFixacao(number, holder);
			
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		
		
		
		
		
		sc.close();

	}

}
