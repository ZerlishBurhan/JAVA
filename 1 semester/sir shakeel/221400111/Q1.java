/*
zerlish burhan
221400111
section f 
*/



import java.util.Scanner;

public class Q1{
static boolean isprime(int number){
Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter a num:");
	 number= keyboard.nextInt();

	boolean flag = true;
	int i = 2  ;

if(number > 1){
	while(i <= number / 2){
	if(number % i == 0 ){
	flag = false;
	}//if

	i++;
	
}//while

}//if
	else	
	{

	flag = false;

	}//else
	
	
return flag;
		
 }//boolean

public static void main (String[] args){

	int number=0;
	boolean output = isprime(number);
	System.out.print(output);

}//main

}//class