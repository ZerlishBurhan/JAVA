//=========================VEHICLE CLASS=======================
class Vehicle{

	private String	vehicleType; 
	private int numberOfWheels;
	private int seatingCapacity ;
	private double speed;

	public  void setVehicle(String vehicleType){
		this.vehicleType = vehicleType;
	}//set
	public String getVehicleType(){
		return vehicleType;
	}//get 

	public  void setNumberOfWheels(int numberOfWheels){
		this.numberOfWheels = numberOfWheels;
	}//set
	public int getNumberOfWheels(){
		return numberOfWheels;
	}//get

	public  void setSeatingCapacity(int seats){
		seatingCapacity = seats;
	}//set
	public int getSeatingCapacity(){
		return seatingCapacity;
	}//get

	public  void setSpeed(double speed){
		this.speed = speed;
	}//set
	public double getSpeed(){
		return speed;
	}//get

	public Vehicle(){
		System.out.println("0-Argument-constructor");
	}//default-constructor

	public Vehicle(String vehicleType,int numberOfWheels,int seatingCapacity,double speed){
		this.vehicleType = vehicleType;
		this.numberOfWheels = numberOfWheels;
		this.seatingCapacity = seatingCapacity;
		this.speed = speed;
	}//over-loaded

	public Vehicle(String vehicleType,double speed,int numberOfWheels,int seatingCapacity){
		this.vehicleType = vehicleType;
		this.speed = speed;
		this.numberOfWheels = numberOfWheels;
		this.seatingCapacity = seatingCapacity;
	}//2-overloaded - constructor;

	public Vehicle deepCopy(Vehicle vehicle){
		this.vehicleType = vehicle.vehicleType;
		this.numberOfWheels = vehicle.numberOfWheels;
		this.seatingCapacity = vehicle.seatingCapacity;
		this.speed = vehicle.speed;

		return this;

	}//deepcopy

    public Vehicle shallowCopy(Vehicle vehicle){
    	Vehicle temp = new Vehicle();
    	temp = vehicle;
    	return temp;

    }//shallow-copy

    public Vehicle getCallerObject(){
    	return this;
    }//getcallercopy

	public String toString(){
		return "{" + this.getVehicleType() + "," + this.getNumberOfWheels() + "," + this.getSeatingCapacity()+ "," + this.getSpeed() + "}";
	}
}//vehicle class
//============================ENGINE CLASS====================================  
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
		return "{" + "The capacity of engine is : " + this.getCapacity() + "  The number of cylinders in engine are : " +this.getNumberOfCylinders() + "}";
	}//String
	
}//ENGINE CLASS

//================ CAR CLASS ======================================== 
class Car{

	private String modelName;
	private String licenseNumber;
	private int yearOfPurchase;

	public void setModelName(String modelName){
		this.modelName = modelName;
	}//set
	public String getModelName(){
		return modelName;
	}//get

	public void setLicenseNumber(String licenseNumber){
		this.licenseNumber = licenseNumber;
	}//set
	public String getLicenseNumber(){
		return licenseNumber;
	}//get

	public void setYearOfPurchase(int yearOfPurchase){
		this.yearOfPurchase = yearOfPurchase;
	}//set
	public int getYearOfPurchase(){
	return yearOfPurchase;
	}//get

 	public Car(){
 		System.out.println("0-Arguments constructor");
 	}//default-car
	

 	public Car(String modelName,String licenseNumber,int yearOfPurchase){
 		this.modelName = modelName ;
 		this.licenseNumber = licenseNumber;
 		this.yearOfPurchase = yearOfPurchase;
 	}//overloaded-car

 	public Car(String modelName,String licenseNumber){
 		this.modelName = modelName ;
 		this.licenseNumber = licenseNumber;
 	}//2-Arguments constructor

 	public void Copy(Car car){
 		this.setModelName(car.getModelName());
 		this.setLicenseNumber(car.getLicenseNumber());
 		this.setYearOfPurchase(car.getYearOfPurchase());
 	}//copy

 	public String toString(){
 		return "{" + " The model number of car : " + this.getModelName() + "  The License Number of the car: " + this.getLicenseNumber() + "The year of purchase is : " + this.getYearOfPurchase() + "}";
 	}//toString

}//CAR - class


//==========================MAIN CLASS=========================================
 public class main{

	public static void main(String[] args){
System.out.println("----------------- Vehicle -------------------------");
System.out.println();
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Prado", 4, 9, 4.7);
		Vehicle v3 = new Vehicle("bugatti" , 5.7, 4, 6);

		Vehicle v4 = new Vehicle();
		Vehicle v5 = new Vehicle();

		System.out.println();

		System.out.println("Vehicle 2 ");
		System.out.println(v2.toString());
		System.out.println();

		System.out.println("Vehicle 3 ");
		System.out.println(v3.toString());
		System.out.println();

		System.out.println("-------------------Deep copy change in one parameter dosent change the other paratmeter---------------");
		v4.deepCopy(v3);
		v4.toString();
		v3.setVehicle("Mercedees");
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);

		System.out.println("--------Shallow copy change in one parameter  change the other paratmeter---------------");
		v4 = v4.shallowCopy(v3);
		v4.toString();
		v4.setVehicle("Farari");
		System.out.println("v3" + v3);		 
		System.out.println("v4" + v4);

		//===============================Engine CLASS USED ========================
System.out.println();
System.out.println();

System.out.println("---------Engine -----------------");
		Engine e1 = new Engine();
		Engine e2 = new Engine(233.444F , 56);
		Engine e3 = new Engine(435.44F ,89);
		System.out.println();
		System.out.println(e2.toString());
		System.out.println();
		System.out.println(e3.toString());
		System.out.println();
		System.out.println("Equals method to show that if e2 and e3 are equal : ");
		System.out.println();
		System.out.println(e2.equals(e3));


//===========================Car===========================================

		System.out.println();
		System.out.println();
		System.out.println("-------------Car--------------");
		Car c1 = new Car();
		Car c2 = new Car("23n-9" , "4578" , 90);
		Car c3 = new Car("34-mj" , "6789" , 78);

		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(c3.toString());
		System.out.println();
		System.out.println("========copy contructor used to copy value of c3 to c2 :============");
		System.out.println();
		c2.Copy(c3);
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(c3.toString());
		
	}//main

}//class