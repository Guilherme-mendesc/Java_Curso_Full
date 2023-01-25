package ExemplosAula;

import java.io.File;
import java.util.Scanner;

public class Progam03 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		

		
		System.out.println("getName: "+ path.getName());
		System.out.println("geParent: "+ path.getParent());
		sc.close();
	}

}
