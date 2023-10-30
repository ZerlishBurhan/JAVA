/*
zerlish burhan
221400111
section f 
*/


import java.util.Scanner;

public class Q2{

static void displayPrimesBetween(int start, int end){

   Scanner keyboard = new Scanner(System.in);
   while(end<=0){
    System.out.println("entered value is incorect! try again.");
    end = keyboard.nextInt();
   }//input validation end
   while(start<=0|| start > end){
    System.out.println("entered value is incorect! try again.");
    start = keyboard.nextInt();
   }//input validation start


 while(start<=end){
   int half = start/2;
   int divisor = 2;
   int i = 0;

	while(divisor<=half){
		if(start % divisor == 0){
		i++;
		}//if
			divisor++;
	}//inner while
	if(i==0){
	System.out.print(start + ", ");
	}//
 	start++;
 }//outer-while










}//method
//==============================main==============================================
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter start : ");
int start = keyboard.nextInt();

System.out.print("Enter end : ");
int end = keyboard.nextInt();

displayPrimesBetween(start,end);


}//main
}//class

