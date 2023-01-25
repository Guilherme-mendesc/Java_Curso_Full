package ExerciciosFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list =  new ArrayList<>();
		
		System.out.println("Quantos empregados voce ira registrar? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #"+i+": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id, já esta sendo usado tente novamente! ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Entre com o id do empregado, que voce deseja acrescentar salário: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
		if(emp==null) {
			System.out.println("Esse id não existe !");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee obj: list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

	private static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
		return emp!= null;
	}

}
