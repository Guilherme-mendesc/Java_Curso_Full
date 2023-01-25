package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program1 {
	//referente à aula 159 Override
	public static void main (String[] args) {
		
		
		Account acc1 = new Account(1001, "Alemao",1000.0);
		acc1.withDraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2= new SavingsAccount(1002, "Cilene",1000.0, 0.01);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		
		
		Account acc3= new BusinessAccount(1003, "Lucao",1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
