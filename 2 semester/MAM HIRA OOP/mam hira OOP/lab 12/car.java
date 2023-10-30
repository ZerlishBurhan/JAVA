public class car{
	private engine ENGINE;
	private fuleTank TANK;
	private String make;
	private int model;
	private double price;

//==================================constructors==============================================

	public car(){
		this.ENGINE = new engine();
		this.TANK = new fuleTank();
		this.setMake("");
		this.setModel(0);
		this.setPrice(0);
	}//default constructor

	public car(fuleTank tank, engine engine, String m, int mm, double p){
		this.TANK = new fuleTank(tank);
		this.ENGINE = new engine(engine);
		this.setMake(make);
		this.setModel(model);
		this.setPrice(price);
	}//overloaded constructor

//===============================setters/getters==============================================

	public void setMake(String m){
		make = m;
	}//setMake

	public String getMake(){
		return make;
	}//getMake

	public void setModel(int mm){
		model = mm;
	}//setModel

	public int getModel(){
		return model;
	}//getModel

	public void setPrice(double p){
		price = p;
	}//setPrice

	public double getPrice(){
		return price;
	}//getPrice

//==================================function methods=========================================

	public double getMax(){
		return this.TANK.getmaxFuelCapacity();
	}
	public double refuel(){
		double fuelAdded = 0.0;
		if(!this.TANK.isFull()){
			fuelAdded = this.TANK.getmaxFuelCapacity() - this.TANK.getlitersFuel();
			this.TANK.add(fuelAdded);
		}
		return fuelAdded;
	}

	public void currentCarState(){
		System.out.println("the company of the car is : " + this.getMake());
		System.out.println("The model of the car is : " + this.getModel());
		System.out.println("the price of the car is : " + this.getPrice());
		this.ENGINE.currentEngineState();
		this.TANK.Currentfulelevel();

	}//currentcar stATE

	public boolean Startcar(){
		boolean isStarted = true;

		if(!this.ENGINE.isEngineRunning()){
			this.ENGINE.startEngine();
			this.TANK.remove(10);

		}else{
			isStarted= false;
		}
		return isStarted;
	}
 

}//class