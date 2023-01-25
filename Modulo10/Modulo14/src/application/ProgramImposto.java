package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesImposto.Empresa;
import entitiesImposto.ImpostoRendimentos;
import entitiesImposto.PessoaFisica;

public class ProgramImposto {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ImpostoRendimentos>list = new ArrayList<>();
		
		System.out.println("Entre com o numero de pagantes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Imposto do pagante: #"+i+" ");
			System.out.print("Pessoa Fisica ou Empresa: (F/E)");
			char ch = sc.next().charAt(0);
			if(ch=='F') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Salario anual: ");
				Double salario = sc.nextDouble();
				System.out.print("Gastos com Convenio: ");
				double GastosConvenio = sc.nextDouble();
				list.add(new PessoaFisica(nome, salario, GastosConvenio));
				
			}else {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Salario anual: ");
				Double salario = sc.nextDouble();
				System.out.print("Numero de empregados: ");
				Integer numeroEmpregados  = sc.nextInt();
				list.add(new Empresa(nome, salario, numeroEmpregados));
			}
		}
		
		double soma =0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS");
		for(ImpostoRendimentos taxa: list ) {
			double imposto = taxa.imposto();
			System.out.println( taxa.getNome()+" : $"+String.format("%.2f", imposto));
			soma += imposto;
		}
		
		
		
		System.out.println();
		System.out.println("TOTAL IMPOSTOS: $ " + String.format("%.2f", soma));
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
