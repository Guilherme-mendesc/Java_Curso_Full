package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter produtc data;");
		System.out.print("Name");
		product.name = sc.nextLine();
		System.out.print("Price:");
		product.price = sc.nextDouble();
		System.out.print("quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("product data: "+ product);
		
		System.out.println();
		System.out.println("Enter the numer of products to add from stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("product data: "+ product);
		
		System.out.println();
		System.out.println("Enter the numer of products to add from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
	
		System.out.println("product data: "+ product);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
