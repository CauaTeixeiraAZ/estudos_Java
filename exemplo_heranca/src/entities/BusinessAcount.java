package entities;

public class BusinessAcount extends Account{
	private Double loanLimite;
	
	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public Double getLoanLimite() {
		return loanLimite;
	}

	public void setLoanLimite(Double loanLimite) {
		this.loanLimite = loanLimite;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimite) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
