import java.util.Scanner;

	public class Equalnum{

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.println("enter a num 1:");
	int a=keyboard.nextInt();

	System.out.println("enter a num 2:");
	int b=keyboard.nextInt();

	System.out.println("enter a num 3:");
	int c=keyboard.nextInt();

	if((a==b)&&(b==c)){

	System.out.println("equal");

}else{

	System.out.println(" not equal");
	}//if


 	}//main


	}//class