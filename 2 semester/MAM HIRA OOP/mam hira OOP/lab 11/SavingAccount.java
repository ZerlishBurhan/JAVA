class SavingAccount extends BankAccount {
	private double annualIntrestRate;

	public SavingAccount(){

	}
	public SavingAccount(int accountNumber, String accountOwner, double accountBalance,double annualIntrestRate){
		super(accountNumber,accountOwner,accountBalance);
		this.annualIntrestRate = annualIntrestRate;
	}
	public SavingAccount(double annualIntrestRate){
		this.annualIntrestRate = annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate){
		this.annualIntrestRate = annualIntrestRate;
	}

	public double getAnnualIntrestRate(){
		return annualIntrestRate;
	}

	public void withdrawal(double amount){
		if(this.getAccountBalance() < 500){
			System.out.println("insufficient ammount");
		}
		else{
			double balance = this.getAccountBalance();
			balance = balance - amount;
		}
	}

	public void depositMonthlyIntrest(){

		double monthlyintrest = this.getAnnualIntrestRate()/12;
		double balance = this.getAccountBalance();
		balance = balance + monthlyintrest;
	}


}