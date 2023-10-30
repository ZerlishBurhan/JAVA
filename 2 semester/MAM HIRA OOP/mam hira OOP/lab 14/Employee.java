public abstract class Employee{
	public String name;
	public int id;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}


	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}

	public Employee(){

	}

	public Employee(String name, int id){
		this.name = name;
		this.id = id;
	}

	public abstract void display();
	public abstract double weeklyPay();

}//class