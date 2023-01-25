package entities;

public class DadosFuncionario {
	
	public String nome;
	public double salario;
	public double taxa;
	
	public double salarioLiquido () {
		return salario-taxa;
	}
	
	public void incrimento(double porcentagem) {
		salario += salario* porcentagem/100;
	}
	
	public String toString() {
		return nome + ",$ " + String.format("%.2f", salarioLiquido());
	}
	
	
	

}
