class Engine{
	private float capacity;
	private int numberOfCylinders;

	public void setCapacity(float capacity){
		this.capacity = capacity;
	}//set
	public float getCapacity(){
		return capacity;
	}//get

	public void setNumberOfCylinders(int numberOfCylinders){
		this.numberOfCylinders = numberOfCylinders;
	}//set
	public float getNumberOfCylinders(){
		return numberOfCylinders;
	}//get

	public Engine(){
		System.out.println("0-argument Argument");
	}//0-argument
	
	public Engine(float capacity,int numberOfCylinders){
		this.capacity = capacity;
		this.numberOfCylinders = numberOfCylinders;
	}//overloaded constructor

	public boolean equals(Engine engine){
		return this.getCapacity() == engine.getCapacity() && this.getNumberOfCylinders() == engine.getNumberOfCylinders();
	}//equals

	public String toString(){
		return "{" + "The capacity of engine is : " + this.getCapacity() + " The number of cylinders in engine are : " +this.getNumberOfCylinders() + "}";
	}//String
	
}//main