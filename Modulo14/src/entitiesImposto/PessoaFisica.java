package entitiesImposto;

public class PessoaFisica extends ImpostoRendimentos {
		
	private double GastosComConvenio;
	
	
	public PessoaFisica(String nome, Double rendaAnual, double gastosComConvenio) {
		super(nome, rendaAnual);
		GastosComConvenio = gastosComConvenio;
	}

	public double getGastosComConvenio() {
		return GastosComConvenio;
	}

	public void setGastosComConvenio(double gastosComConvenio) {
		GastosComConvenio = gastosComConvenio;
	}

	@Override
	public Double imposto() {
		if(getRendaAnual()<20000.00) {
			return getRendaAnual()*0.15-GastosComConvenio*0.5;
		}else {
			return getRendaAnual()*0.25-GastosComConvenio*0.5;
		}
	}
	

}
