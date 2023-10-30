class BankAccount {
	private int accountNumber;
	private String accountOwner;
	private double accountBalance;

	public void setAccountNumber(int accountNumber){
	this.accountNumber = accountNumber;
	}
	public void setAccountOwner(String accountOwner){
	this.accountOwner = accountOwner;	
	}
	public void setAccountBalance(double accountBalance){
	this.accountBalance = accountBalance;	
	}

	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountOwner(){
		return accountOwner;
	}
	public double getAccountBalance(){
		return accountBalance;
	}

	public BankAccount(){

	}
	public BankAccount(int accountNumber, String accountOwner, double accountBalance){
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;	
		this.accountBalance = accountBalance;	
	}
	public void accountStatement(){
		System.out.println("AccountNumber : " + accountNumber + "\nAccount Owner: " + accountOwner+ "\nAccount Balance: " + accountBalance);
	}

	public void deposit(double amount){
		this.accountBalance = this.accountBalance + amount;
	} 
	public void withdrawal(double amount){
		this.accountBalance = this.accountBalance - amount;
	}
}