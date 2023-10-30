
public class Bike{//Parent/General/Super/Base
	//Data Members /Properties
	String model;
	private double price;
	protected int speed;

	//Member Methods / Actions
	public double getPrice(){ //Getter / Accessor 
		return price;
	}

	public void setPrice(double p){
		price = p;
	}

	public void setSpeed(int s){
		speed = s;
	}

	public int getSpeed(){
		return speed;
	}

	public void start(){
		speed += 10;
		System.out.println("Car has been started!");
	}

}