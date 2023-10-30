class salariedEmployee extends Employee{
	private double annualSalary;

	public void setAuualsalary(){
		this.annualSalary = annualSalary;
	}
	public double getAnnualsalaray(){
		return annualSalary;
	}

	public salariedEmployee(){

	}

	public salariedEmployee(double annualSalary){
		this.annualSalary = annualSalary;
	}

	public salariedEmployee(String name, int id, double annualSalary){
		super(name , id);
		this.annualSalary = annualSalary;
	}

	public void display(){
		System.out.println("Name :" + super.getName() + "\nId : " + super.getId() + "Annual Salary : " + getAnnualsalaray() );
	}

	public double weeklyPay(){
		return annualSalary / 52;
	}

}//class