class hourlyEmployee extends Employee{
	
	private double hourlyWage;
	private int hoursWorkesPerWeek;

	public void setHourlryWage(double hourlyWage){
		this.hourlyWage = hourlyWage;
	}
	public double getHourlyWage(){
		return hourlyWage;
	}

	public void setHoursWorkesPerWeek(int hoursWorkesPerWeek){
		this.hoursWorkesPerWeek = hoursWorkesPerWeek;
	}
	public double gethoursWorkesPerWeek(){
		return hoursWorkesPerWeek;
	}

    public hourlyEmployee(){

    }

    public hourlyEmployee( double hourlyWage,int hoursWorkesPerWeek){
		this.hourlyWage = hourlyWage;
		this.hoursWorkesPerWeek = hoursWorkesPerWeek;
    	
    }

    public hourlyEmployee(String name, int id,double hourlyWage,int hoursWorkesPerWeek){
    		super(name , id);
    		this.hourlyWage = hourlyWage;
			this.hoursWorkesPerWeek = hoursWorkesPerWeek;	
    }

    public double weeklyPay(){
    	double total = 0;
    	if(this.gethoursWorkesPerWeek() > 40){
    		double bonus = hoursWorkesPerWeek - 40;
    		bonus = bonus * getHourlyWage() * 1.5;
    		total += bonus;
    	}
    	total = hoursWorkesPerWeek * hourlyWage;
    	return total;
    }

    public void display(){
		System.out.println("Name :" + super.getName() + "\nId : " + super.getId() + "\nHourly Wage : " + getHourlyWage() + "\nHours worked per week :" + gethoursWorkesPerWeek() + "\nthe weekly pay is : " + this.weeklyPay());
	}

    

}