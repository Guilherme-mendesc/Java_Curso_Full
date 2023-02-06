package applicationDiamond;

import devices.ComboDevice;
import devices.ConcrectePrinter;
import devices.ConcreteScanner;

public class ProgramDiamond {

	public static void main(String[] args) {
	
		
		ConcrectePrinter p = new ConcrectePrinter("1080 ");
		p.processDoc("My letter ");
		p.print("My letter ");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My email");
		System.out.println("Scan Result: "+ s.scan());
		
		
		System.out.println();
		ComboDevice c = new ComboDevice("2609");
		c.processDoc("My dissertation ");
		c.print("My dissertation ");
		System.out.println("Scan result: "+ c.scan());
		
	}

}
