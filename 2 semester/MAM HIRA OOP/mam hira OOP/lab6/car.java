

class car{
	
	 private int yearModel;
	 private String make; 
	 private int speed;


	 	public void setyearModel(int ym){
	 		yearModel = ym;
	 	}//yearModel

	 	public int getyearModel(){
	 		return yearModel;
	 	}

	 	public void setmake(String m){
	 		make = m;
	 	}//yearModel

	 	public String getmake(){
	 		return make;
	 	}//getmake

	 	public void setspeed(int sp){
	 		speed = sp;
	 	}//yearspeed

	 	public int getspeed(){
	 		return speed;
	 	}//getspeed

	 	public void accelerate(){
	 		setspeed(getspeed()+5);
	 		System.out.println(getspeed());
	 	}//accelerate

	 	public void brake(){
	 		setspeed(getspeed()-5);
	 		System.out.println(getspeed());
	 	}//brake

}//class