class HourlyEmployee extends Employee{
	private double hourlyWage;
	private int hoursWorkedPerWeek;

	public HourlyEmployee(){
		super();
		this.setHourlyWage(15.0);
		this.setHoursWorkedPerWeek(40);
	}//Default constructor

	public HourlyEmployee(double hourlyWage, int hoursWorkedPerWeek){
		super();
		this.setHourlyWage(hourlyWage);
		this.setHoursWorkedPerWeek(hoursWorkedPerWeek);
	}//2-arguments overloaded constructor

	public HourlyEmployee(double hourlyWage, int hoursWorkedPerWeek, String name, int ID){
		super(name, ID);
		this.setHourlyWage(hourlyWage);
		this.setHoursWorkedPerWeek(hoursWorkedPerWeek);
	}//4-arguments overloaded constructor

	public void setHourlyWage(double hourlyWage){
		this.hourlyWage = hourlyWage;
	}//setHourlyWage

	public void setHoursWorkedPerWeek(int hoursWorkedPerWeek){
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}//setHoursWorkedPerWeek

	public double getHourlyWage(){
		return this.hourlyWage;
	}//getHourlyWage

	public int getHoursWorkedPerWeek(){
		return this.hoursWorkedPerWeek;
	}//getHoursWorkedPerWeek

	public double weeklyPay(){
		final int routineWorkHours = 40;
		double weeklyPay = 0.0;
		if (this.getHoursWorkedPerWeek() <= routineWorkHours){
			weeklyPay = this.getHourlyWage() * this.getHoursWorkedPerWeek();
		}
		else{
			weeklyPay =  this.getHourlyWage() * routineWorkHours
			+ ((this.getHoursWorkedPerWeek() - routineWorkHours) * this.getHourlyWage() * 1.5);
		}//if
		return weeklyPay;
	}//weeklyPay

	public void display(){
		super.display();
		System.out.println("Hourly wage: " + this.getHourlyWage());
		System.out.println("Hours worked per week: " + this.getHoursWorkedPerWeek());
	}//display

}//class