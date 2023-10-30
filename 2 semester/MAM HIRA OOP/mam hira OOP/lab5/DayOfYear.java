import java.util.*;
import java.util.Scanner;
class DayOfYear{

	private int day;
	private int month;

		public void input(){

			Scanner read = new Scanner(System.in);

			System.out.println("Enter the month as a number: ");
			int m = read.nextInt();

			System.out.println("Enter the day of the month: ");
			int d = read.nextInt();

			set(m,d);

		}//input

		public  void output(){
				System.out.println( "\nthe month is : " + getMonth() + "\nthe date is : " + getDay());

		}//output


		public  void set(int m , int d){
			day = d;
			month = m;

		}//setDate

		public  int getMonth(){
				return month;

		}
	
			public  int getDay(){
				return day;

		}
}//class