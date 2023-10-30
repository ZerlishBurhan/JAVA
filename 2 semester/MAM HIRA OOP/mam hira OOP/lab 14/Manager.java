class Manager extends salariedEmployee{
	private double weeklyBonus;

	public void setweeklyBonus(){
		this.weeklyBonus = weeklyBonus;
	}
	public double getweeklyBonus(){
		return weeklyBonus;
	}

	public Manager(){

	}

	public Manager(double annualSalary, double weeklyBonus){
		super(annualSalary);
		this.weeklyBonus = weeklyBonus;
	}

	public Manager(String name, int id, double annualSalary, double weeklyBonus){
		super(name , id, annualSalary);
		this.weeklyBonus = weeklyBonus;
	}

	public void display(){
		super.display();
		System.out.println("weeklyBonus :" +weeklyBonus);
	}



}//class