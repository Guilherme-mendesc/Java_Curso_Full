package ExemplosAula;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program01 {

	public static void main(String[] args) {
		
		String [] lines = new String[] {"Bom dia O sol já nasceu na fazendinha","O mae wa mo Shindeiru"," NANI" };
		
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}			
}		
