package application;
// exericio de fixação 1 do modulo 14
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesEmployee.Employee;
import entitiesEmployee.OutSorcedEmployee;

public class ProgramEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employeees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.printf("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge =sc.nextDouble();
				list.add(new OutSorcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName()+" - $ "+String.format("%.2f", emp.payment()));
		}
	
		sc.close();

	}

}
