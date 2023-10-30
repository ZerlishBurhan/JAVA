import java.util.Scanner;
  public class senitalloop{

  	public static void main (String[] args){

	Scanner keyboard=new Scanner (System.in);

	System.out.println("Enter a postive number:");
	int num=keyboard.nextInt();


	while(num<=0){
	System.out.println("the enter number is invalid");

	System.out.println("please enter correct number");
	num = keyboard.nextInt();

	}//while

	System.out.println("The entered number" +   num   +"is positive");






	}//main



















  }//class