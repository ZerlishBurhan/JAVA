class Manager extends SalariedEmployee{
	private double weeklyBonus;

	public Manager(){
		super();
		this.setWeeklyBonus(5000.0);
	}//Default constructor

	public Manager(double weeklyBonus){
		super();
		this.setWeeklyBonus(weeklyBonus);
	}//1-argument overloaded constructor

	public Manager(double weeklyBonus, double annualSalary, String name, int ID){
		super(annualSalary, name, ID);
		this.setWeeklyBonus(weeklyBonus);
	}//4-arguments overloaded constructor

	public void setWeeklyBonus(double weeklyBonus){
		this.weeklyBonus = weeklyBonus;
	}//setWeeklyBonus

	public double getWeeklyBonus(){
		return this.weeklyBonus;
	}//getWeeklyBonus

	public double weeklyPay(){
		return super.weeklyPay() + this.getWeeklyBonus();
	}//weeklyPay

	public void display(){
		super.display();
		System.out.println("Weekly bonus: " + this.getWeeklyBonus());
	}//display

}//class