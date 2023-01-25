package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.ImportedProduct;
import entitiesProduct.Product;
import entitiesProduct.UsedProduct;

public class ProgramProduct {
//exercicio de fixacao 2 modulo 14
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n =sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.printf("Common, used or imported (c/u/i) ?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (ch =='i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				list.add(new  ImportedProduct(name, price, customFee));
			}else if(ch=='u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}else {
				System.out.print("Customs fee: ");
				list.add(new Product(name, price));
			}
				System.out.println();
				System.out.println("Price Tags: ");
				for(Product prod: list) {
					System.out.println(prod.priceTag());
				}
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
