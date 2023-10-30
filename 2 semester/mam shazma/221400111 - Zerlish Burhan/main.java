 class main{

public class Vehicle{

	private  String	vehicleType; 
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

	// public void  deepCopy(Vehicle vehicle){
	// 	this.vehicleType = vehicle.vehicleType;
	// 	this.numberOfWheels = vehicle.numberOfWheels;
	// 	this.seatingCapacity = vehicle.seatingCapacity;
	// 	this.speed = vehicle.speed;
	// }//deepcopy

    // public void shallowCopy(Vehicle vehicle){
    // 	this = vehicle;
    // }//shallow-copy

    // public Vehicle getCallerObject(){
    // 	return this;
    // }//getcallercopy

	public String toString(){
		return "{" + this.getVehicleType() + "," + this.getNumberOfWheels() + "," + this.getSeatingCapacity()+ "," + this.getSpeed() + "}";
	}


}//vehicle class
  
  	public class Engine{
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
	
}//ENGINE CLASS


	public class Car{

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
 		return "{" + "The model number of car :" + this.getModelName() + "The License Number of the car: " + this.getLicenseNumber() + "The year of purchase is : " + this.getYearOfPurchase() + "}";
 	}//toString

}//CAR - class

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Prado",4,9,4.7);
		Vehicle v3 = new Vehicle("bugatti" , 5.7 , 4 , 6);
		// Vehicle v4 = new Vehicle();
		// Vehicle v5 = new Vehicle();

		System.out.println();
		System.out.println("Vehicle 2 ");
		System.out.print(v2.toString());
		System.out.println();
		System.out.println("Vehicle 3 ");
		System.out.print(v3.toString());
		// System.out.println();
		// System.out.print("Deep copy");
		// v3.deepCopy(v4);
		// v4.toString();
		// System.out.println();
		// System.out.println("Shallow copy");
		// v4.shallowCopy(v5);

	}//main
}//class