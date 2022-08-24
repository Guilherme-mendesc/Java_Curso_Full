package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter produtc data;");
		System.out.print("Name");
		String name = sc.nextLine();
		System.out.print("Price:");
		double price = sc.nextDouble();
	
		Product product = new Product(name, price);
		

		product.setName("Computer Filhao");
		System.out.println("Updated name: "+ product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: "+ product.getPrice());
		
		
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