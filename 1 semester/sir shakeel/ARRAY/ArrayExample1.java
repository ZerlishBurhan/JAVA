/*
  Lecture - 27
  Arrays
  29-03-2023
*/

import java.util.Scanner;

class ArrayExample1 {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    // constant for the array size
    final int SIZE = 100;
    String[] names = new String[SIZE];

    int[] values;    // declaration only

    System.out.print("How many elements in the array? ");    
    int len = reader.nextInt();
  
    // input validation    
    while(len <= 0) {
      System.out.print("Sorry! How many elements in the array? "); 
      len = reader.nextInt();    
    }//while

    // initialization
    values = new int[len];

    // taking input into the array
    for(int i = 0; i < values.length; ++i) {
      System.out.print("Enter an integer: ");
      values[i] = reader.nextInt();
    }//for

    // print the array
    for(int i = 0; i < values.length; ++i) {
      System.out.print(values[i] + ", ");
    }//for
    System.out.println();

    names[0] = "GIFT";
    names[1] = "University";
    names[2] = "Gujranwala";

    // print the array
    for(int i = 0; i < names.length; ++i) {
      System.out.print(names[i] + ", ");
    }//for
    System.out.println();

    //array bounds: >=0 and <= length-1
    // Out-of-bounds: exception
    names[100] = "XYz";
    System.out.println(names[100]);


  }//main



}//class