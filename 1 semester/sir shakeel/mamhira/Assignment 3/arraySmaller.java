/*
Zerlish Burhan
221400111
section-A
cs-240 OOP lab
*/

import java.util.Arrays;

import java.util.Scanner;

  public class arraySmaller{

	static int[] findsmallerAndReplace(int[] array){

	int smallest1 = array[0] , smallest2 = array[1] ; 
	int length = array.length;

	    if (smallest2 < smallest1) {
            int temp = smallest1;
            smallest1 = smallest2;
            smallest2 = temp;
            }//if 

	for(int i = 2 ; i < array.length ; ++i){

	    if( array[i] < smallest1 ){
		smallest2 = smallest1;
		smallest1 = array[i];
		}//if
	   else if( array[i] < smallest2 ){
		smallest2 = array[i]; 
		}
	    

	}//for



	array[0]=smallest1;
	array[1]=smallest2;
	array[length-2]=smallest1;
	array[length-1]=smallest2;
	int j = 0 ;
	int [] arr = 
	for(int i = 2 ; i < array.length ;  ++i , ++j ){
	System.out.print(array[i] = array[j]);
	}

	return array;
	}//method

   public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter array length = ");
		int size = keyboard.nextInt();
		int array[] = new int[size];
		  for(int a = 0 ; a < array.length ; ++a ){
		      System.out.println("Enter the integers in array = ");	
		      array[a]=keyboard.nextInt();
		  }

	findsmallerAndReplace(array);
	System.out.println();
	System.out.print("THE ARRAY IS : " + Arrays.toString(array));
           
        

   }//main
  }//class
