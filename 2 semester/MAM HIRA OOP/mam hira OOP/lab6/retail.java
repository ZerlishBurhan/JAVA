
import java.util.Scanner;

class retail{

	 private int description;
	 private String unit; 
	 private double price;

	 		public void input(){

	 				Scanner keyboard = new Scanner(System.in);

	 			System.out.println("Enter the discrition of item :");
	 			int description = keyboard.nextInt();

	 			System.out.println("Enter units on hand :");
	 			String unit = keyboard.next();

	 			System.out.println("Enter the price : ");
	 			double price = keyboard.nextDouble();
	 				 setdiscription(description);
	 				 setunit(unit);
	 				 setprice(price);

	 				display();

	 		}//setter

	 	public void setdiscription(int d){
	 		description = d;
	 	}//descr

	 	public int getdiscrition(){
	 		return description;
	 	}

	 	public void setunit(String u){
	 		unit = u;
	 	}//yearModel

	 	public String getunit(){
	 		return unit;
	 	}//getmake

	 	public void setprice(double p){
	 		price = p;
	 	}//yearspeed

	 	public double getprice(){
	 		return price;
	 	}//getspeed

	 	public void display(){

	 		System.out.println("the discription is = " + getdiscrition());
	 		System.out.println("the unit is : " + getunit());
	 		System.out.println("the price is : " + getprice());

	 	}//display

	 	

}//class
