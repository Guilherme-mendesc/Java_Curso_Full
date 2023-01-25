package ExemplosAula;

import java.io.File;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfully ");
		
		
		sc.close();
	}

}
