import java.util.Scanner;

  public class middleoperator{

	public static void main (String[] args){

	Scanner keyboard= new Scanner(System.in);

	System.out.println("Enter number 1:");
	int num1 =keyboard.nextInt();

	System.out.println("Enter number 2:");
	int num2 =keyboard.nextInt();

	System.out.println("Enter number 3:");
	int num3 =keyboard.nextInt();

	if(num1>num2 && num2<num3){
	System.out.println(num2);

	}//if

	}//main


    }//class