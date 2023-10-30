class temperature{
	private double ftemp;

	public temperature(){

	}//0- argument constructor 

	public temperature(double ftemp){
		this.ftemp = ftemp;
	}//over loaded-constructor

	public void setTemperature(double ftemp){
		this.ftemp = ftemp;
	}//set

	public double getTemperature(){
		return ftemp;
	}//get
 	
 	public double getCelciusTemperature(){
 	return  (0.556)*(this.getTemperature() - 32);	
	}//get

	public double getKelvinTemperature(){
 	return ((0.556) * (this.getTemperature() - 32)) + 273;	
	}//get

	public void copy(temperature t){
		t.setTemperature(this.getTemperature());
	}//copy method

	public String toString(){
		return "{" + this.getTemperature() + "}";
	}//toString

	public boolean compare(temperature t){
		// return this.getTemperature() == t.getTemperature();
		// return (this.getFahrenheit() - t.getFahrenheit()) < 0.000001;
		return this.getTemperature() - t.getTemperature() < 0.000001;
	}//compare

	public boolean isEqual(temperature t){
		return this.getTemperature() == t.getTemperature();
	}//isEqual

	public temperature create(temperature t){
		return new temperature(this.getTemperature() + t.getTemperature());
	}

	public void display(){
		System.out.println("Temperature in fahrenheit: " + getTemperature());
	}//display()


}//class