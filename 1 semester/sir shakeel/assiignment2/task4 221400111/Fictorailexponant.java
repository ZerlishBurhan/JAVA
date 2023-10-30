import java.util.Scanner;

public class Fictorailexponant{

public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter a positive number:");
	int num =keyboard.nextInt();

	while(num < 0){
	System.out.print("Please Enter a valid number :");
	num =keyboard.nextInt();	
	}//while1

//.....................................................................................................

//................................./fictorail/.........................................................

int   i = 1 , nf = 1 ;
	
	while(num >= i){

	
	nf *= i; 
	++i;
	}//while2

	System.out.println(num  + "! =" + nf );

//.................................../eponential x/...........................................................
	System.out.println("Enter value of x :");
	int x = keyboard.nextInt();
 
	System.out.println("Enter num of terms :");
	int num1 = keyboard.nextInt();


	double m = 1 , factorail = 1 , numerator = 1 , answer = 1 ;

   while( m <= num1 ){

	numerator *= x;
		
	factorail *= m;

	answer += numerator / factorail ;
	
	m++;

	}//while3

	System.out.print("The value of  e ^ pow  : " + answer);


	System.out.println();
//................................................. find E ................................................................

	System.out.println("Enter num of terms :");
	 num = keyboard.nextInt();

	double e = 1 ;
	m = 1;
	factorail=1;	

   while( m <= num ){

	
		
	factorail *= m;

	e += 1/ factorail ;
	
	m++;

	}//while3

	System.out.print("The value of  e ^ pow  : " + e );





}//main



}//class 