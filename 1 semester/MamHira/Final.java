 import java.util.Scanner;

   public class Final{

	public static double totalCost(double numberOfRooms, double squareFeet, double priceOfPaint){

	squareFeet*=4;

	System.out.println("The squareFeet are =" + squareFeet);
	System.out.println(" ");

	double gallon = squareFeet * numberOfRooms;
	gallon/=115;

	System.out.print("The gallons are =" + gallon);
		System.out.println(" ");
	
	double hours = gallon*8;
	System.out.println(" hours = " + hours);
		System.out.println(" ");

	double labourcharges= hours*18;
	System.out.println(" labour charges = " + labourcharges);
		System.out.println(" ");

	 priceOfPaint *= gallon;
	System.out.println(" priceOfPaint = " + priceOfPaint);
		System.out.println(" ");
	 
	double cost = priceOfPaint + labourcharges;
	System.out.println(" total cost is  = " + cost);
		System.out.println(" ");	 

	return gallon;
	}//method



	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter number of rooms = ");
	double rooms = keyboard.nextInt();


	System.out.print("Enter price of paint  = ");
	double price = keyboard.nextDouble();

	System.out.print("Enter squarefeet of wall = ");
	double sqrft = keyboard.nextInt();
	System.out.println(" ");

	totalCost(rooms, sqrft, price);

	

	
	}//main


   }//class