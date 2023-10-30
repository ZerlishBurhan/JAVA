class car {
	private int yearModel;
	private String make;
	private int speed;

	public void setYearmodel(int yearModel){
		this.yearModel = yearModel;
	}//set
	public int  getYearModel(){
		return yearModel;
	}//get


	public void setmake(String make){
		this.make = make;
	}//set
	public String getmake(){
		return make;
	}//get


	public void setSpeed(int speed){
		this.speed = speed;
	}//set
	public int getSpeed(){
		return speed;
	}//get

	public boolean compare(car arg){
		return this.yearModel == arg.yearModel && this.make.equals(arg.make) && this.speed == speed;  
	}//compare

	public String toString(){
		return "{" + yearModel + " ," + make + " ,"+ speed + " }";
	}//string

	public void acelerate(){
	speed += 5;
	}//add

	public void brake(){
		 speed = speed + 5;
	}//get

	public void copy(car c){
		this.speed = c.speed;
		this.yearModel = c.yearModel;
		this.make = c.make;
	}//copy

	public boolean isNotEqual(car c){
		return !this.compare(c);
	}//return

	public car(int yearModel , String make , int speed){
			this.yearModel = yearModel ;
			this.make = make;
			this.speed = speed;
	} 

	public car create(car c){
		return new car(this.getYearModel()  + c.getYearModel(),
					this.getmake() +" "+ c.getmake(),
					this.getSpeed()  + c.getSpeed());
	}//car

	public car(){

	}

}//class