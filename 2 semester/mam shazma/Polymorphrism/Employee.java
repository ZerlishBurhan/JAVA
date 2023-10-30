class Employee{
	private String name;
	private int ID;

	public Employee(){
		this.setName("Abdullah");
		this.setID(101);
	}//Default constructor

	public Employee(String name, int ID){
		this.setName(name);
		this.setID(ID);
	}//Overloaded constructor

	public void setName(String name){
		this.name = name;
	}//setName

	public void setID(int ID){
		this.ID = ID;
	}//setID

	public String getName(){
		return this.name;
	}//getName

	public int getID(){
		return this.ID;
	}//getID

	public double weeklyPay(){
		return 0.0;
	}//weeklyPay

	public void display(){
		System.out.println("Name: " + this.getName() + 
			"\nID: " + this.getID());
	}//display

	public static void display(Employee[] employees){
		for (int i = 0; i < employees.length; ++i) {
			employees[i].display();
			System.out.println("Weekly pay: " + employees[i].weeklyPay() + "\n\n");
		}
	}//display
}//class