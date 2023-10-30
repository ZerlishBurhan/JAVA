/*
  Lecture - 27
  Arrays
  29-03-2023
*/

import java.util.Arrays;

class ArrayExample2 {

  public static void main(String[] args) {

    // array initializer
    char[] cArray = { 'A', 'B', 'a', 'b', '?' };

    /*
	The above single statement is equivalent to:
	
	char[] cArray = new char[5];

	cArray[0] = 'A';
	cArray[1] = 'B';
	cArray[2] = 'a';
	cArray[3] = 'b';
	cArray[4] = '?';

    */

    int[] numbers = { 0, 22, -4, 33, 100, -2, 3, -8, 12 };

    // print before sorting
    System.out.println("Before sorting...");

    for(int i = 0; i < numbers.length; ++i) {
      System.out.print(numbers[i] + ", ");	
    }//for 
    System.out.println();	

    // sort the array using the class Arrays
    Arrays.sort(numbers);

    // print after sorting
    System.out.println("After sorting...");

    for(int i = 0; i < numbers.length; ++i) {
      System.out.print(numbers[i] + ", ");	
    }//for 
    System.out.println();	

  }//main 

}//class