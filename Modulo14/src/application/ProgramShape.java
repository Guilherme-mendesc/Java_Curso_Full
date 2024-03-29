package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesShape.Retangle;
import entitiesShape.Shape;
import entitiesShape.Circle;
import entitiesShape.Enum.Color;

public class ProgramShape {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			System.out.print("SHAPE # "+i+ "DATA");
			System.out.print("Retangle or Circle (r/c)?  ");
			char ch = sc.next().charAt(0);
			System.out.print("BLACK/BLUE/RED ");
			Color color = Color.valueOf(sc.next());
			if(ch =='r') {
			
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Retangle(color, width,height));
			}else {
				System.out.print("raius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREA: ");
		for(Shape shape: list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		sc.close();

	}

}
