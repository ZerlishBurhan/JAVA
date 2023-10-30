import java.util.Scanner;

  public class forloop{

	public static void main (String[] args){

	Scanner keyboard= new Scanner(System.in);

	System.out.println("Enter starting number");
	int start =keyboard.nextInt();

	System.out.println("Enter count:");
	int num =keyboard.nextInt();


	System.out.println("Enter end:");
	int end=keyboard.nextInt();

	

	for(int i= num ; i<=end ; ++ i){
	System.out.println(start + "x" + i + "=" +(num * i));

	}//for








	}//main


    }//class