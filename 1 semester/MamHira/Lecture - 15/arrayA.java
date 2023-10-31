import java.util.Scanner;

   public class arrayA{

     public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter length of the array: ");
		int len = keyboard.nextInt();

		int[] array = new int[len];

		for(int i = 0 ; i< array.length;++i ){
		array[i] = keyboard.nextInt();
		}//for

		for(int i = 0 ; i< array.length;++i ){		
		System.out.print(array[i] + ",");

		}//for

    }//main

   }//class