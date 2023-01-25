import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Insira o valor de B: ");
		double b = sc.nextDouble();
		
		
		double soma = a+b;
		double subtracao = a-b;
		double divisao =  a/b;
		if (b==0) {
			System.out.println("Imposivel dividir por 0 vai estudar mula");
		}
		double multiplicaco = a*b; 
	
		
		System.out.println("soma: "+soma);
		System.out.println("subtracao: "+subtracao);
		System.out.println("divisao: "+ divisao);
		System.out.println("multiplicaco: "+multiplicaco);
		
		
		
		

		sc.close();

	}

}
