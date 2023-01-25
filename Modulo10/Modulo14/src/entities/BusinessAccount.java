package entities;

public class BusinessAccount extends Account {
	
	
	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanlimite) {
		super(number, holder, balance);
		this.loanLimit = loanlimite;
	}

	public Double getLoanlimite() {
		return loanLimit;
	}

	public void setLoanlimite(Double loanlimite) {
		this.loanLimit = loanlimite;
	}

	public void loan(double amount) {
		if(amount<= loanLimit) {
			balance += amount -10.0;
		}
	}
		@Override
		public void withDraw(double amount) {
			super.withDraw(amount);
			balance -= 2.0;
		
		
	}

}
