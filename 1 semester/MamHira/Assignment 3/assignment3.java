/* 
roll no. 221400111
name: ZERLISH BURHAN
*/
 
import java.util.Scanner;

public class assignment3{

	public static void main (String[] args){

    Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter first number:");
	int num1 = keyboard.nextInt();

	
while((num1 <= 0) || (num1 % 2 != 0) ){
	        System.out.println("enter num1 is invalid!");
	        System.out.println("PLease enter correct number!");
	        num1 = keyboard.nextInt();
}//while1

	System.out.println("Enter second number:");
	int num2 = keyboard.nextInt();

 while((num2 <= 0) || (num2 % 2 == 0) || (num2 < num1 ) ){
                System.out.println("enter num2 is invalid!");
		System.out.println("PLease enter correct number!");
		num2 = keyboard.nextInt();
}//while2
	int i = 0 , product= 1  ;
	i=num1;
while(i<=num2){
 
 product *=i;
	i++;
}//while3
	System.out.println("The product of Numbers between num1 and num2 is :" + product);

//===========================================/formula/========================================
double sum=0 , answer = 0;
for( i = 1 ; i <= 4 ; i++ ){

  sum = (Math.pow(i,2)) / 5 ;
	answer += sum;	
}//for
System.out.print("The sum is " + answer);


}//main
}//class