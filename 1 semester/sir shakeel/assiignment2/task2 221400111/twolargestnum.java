import java.util.Scanner;

public class twolargestnum{

   public static void main(String[] args){

	Scanner keyboard=new Scanner(System.in);

	int count=0 , largestnum =0 , secondnum = 0 ;
	while(count<10){

	System.out.println("Enter a num :");
	int num = keyboard.nextInt();

	if(num > largestnum){

	secondnum = largestnum ; 
	largestnum = num;
	

	}//if

	else if( num > secondnum ){
	 secondnum = num  ;
	}//else if

			
	++count;
}//while

	System.out.println("The largestnum is :" + largestnum);
	System.out.println("The Secondnum is :" + secondnum);


   }//main



}//class