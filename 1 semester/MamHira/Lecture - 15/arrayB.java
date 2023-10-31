import java.util.Scanner;

 public class arrayB{

	public static void largerThanNumber(int[] array, int number){
	
	for(int i = 0 ; i< array.length ;++i ){
		if(array[i]>number){
		System.out.print(array[i]);
}//if
	}//for

	

	}//method

     public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter length of the array: ");
		int len = keyboard.nextInt();

		int[] array = new int[len];

		for(int i = 0 ; i< array.length;++i ){
		array[i] = keyboard.nextInt();
		}//for

		System.out.print("Enter the number you want to campare : ");
		int num = keyboard.nextInt();
		
		largerThanNumber(array,num);
    }//main

   }//class