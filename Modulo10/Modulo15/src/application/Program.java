package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		method1();
		System.out.println("Fim do programa");
	
	}
	
	public static void method1() {
		System.out.println("METHOD 1 START");
		method2();
		System.out.println("Method 1 end");
	}
	
	
	
	public static void method2() {
		System.out.println("METHODO 2 START");
		Scanner sc = new Scanner (System.in);
		
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("input error");
		}
		System.out.println("METHODO 2 END");
		
		
				
				sc.close();

	}
}
