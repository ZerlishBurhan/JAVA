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
 		return "{" + "The model number of car :" + this.getModelName() + "The License Number of the car: " + this.getLicenseNumber() + "The year of purchase is : " + this.getYearOfPurchase() + "}";
 	}//toString

}//class