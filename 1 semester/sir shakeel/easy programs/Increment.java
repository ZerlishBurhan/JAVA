import java.util.Scanner;
public class Increment{

	public static void main (String[] args){

	Scanner keyboard=new Scanner (System.in);

	

	int x =21, y =30, z =65;
	y=--y;
	System.out.println("the value of Y is :" + y);
	z = ++x - --y;


	System.out.println("the value of X is :" + x);
	System.out.println("the value of Y is :" + y);
	System.out.println("the value of Z is :" + z);



	}//main
}//class





