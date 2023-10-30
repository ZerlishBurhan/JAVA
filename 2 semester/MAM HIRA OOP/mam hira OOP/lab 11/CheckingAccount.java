class CheckingAccount extends BankAccount{
	
	private double insuffientFundsFee;

	public CheckingAccount(){

	}

	public CheckingAccount(int accountNumber, String accountOwner, double accountBalance, double insuffientFundsFee){
		super(accountNumber,accountOwner,accountBalance);
		this.insuffientFundsFee = insuffientFundsFee;
	}
	public CheckingAccount( double insuffientFundsFee){
		this.insuffientFundsFee = insuffientFundsFee;
	}

	public void setInsuffientFundsFee(double insuffientFundsFee){
		this.insuffientFundsFee = insuffientFundsFee;
	}

	public double getInsuffientFundsFee(){
		return insuffientFundsFee;
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

}