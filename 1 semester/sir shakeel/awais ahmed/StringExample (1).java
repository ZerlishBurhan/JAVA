/*
  Lecture - 23
  String
  15-03-2023
*/
import java.util.Scanner;

class StringExample {

/*  public static void main(String[] args) {

    String s = "GIFT University Gujranwala";

    System.out.println(s);
    System.out.println("Length: " + s.length());

    int len = s.length();
    System.out.println("Length: " + len);

    for(int i = 0; i <= s.length() - 1; ++i) {
      char c = s.charAt(i);
      System.out.print(c + ", ");
    }//for
    System.out.println();

    //System.out.println(s.charAt(s.length()));
    System.out.println(s.charAt(s.length() - 1));

    for(int i = s.length()-1; i >= 0; --i) {
      char c = s.charAt(i);
      System.out.print(c + ", ");
    }//for
    System.out.println();

    String s2 = s.toLowerCase();
    String s3 = s.toUpperCase();

    System.out.println(s2);
    System.out.println(s3);

    int location = s.indexOf('j');
    System.out.println("j is located at: " + location);

*/

/*  static void printIntArray(int[] array) {
    for(int i = 0; i < array.length; ++i) {
      System.out.print(array[i] + ", ");
    }//for
    System.out.println("\n");
  }//printIntArray

  static void printDoubleArray(double[] array) {
    for(int i = 0; i < array.length; ++i) {
      System.out.print(array[i] + ", ");
    }//for
    System.out.println("\n");
  }//printDoubleArray

  static void printStringArray(String[] array) {
    for(int i = 0; i < array.length; ++i) {
      System.out.print(array[i] + ", ");
    }//for
    System.out.println("\n");
  }//printStringArray

  // pass-by-value
  static void changeValue(int value) {
    value += 1000;
  }//changeValue

  static void changeArrayValues(int[] array) {
    for(int i = 0; i < array.length; ++i) {
      array[i] += 20;    
    }//for
  }//changeArrayValues

  // method to return an array
  static int[] absoluteValueArray(int[] array) {
    int[] absArray = new int[array.length];    

    for(int i = 0; i < array.length; ++i) {
      absArray[i] = Math.abs(array[i]);    
    }//for
    
    return absArray;
  }//absoluteValueArray

  public static void main(String[] args) {

    int[] inumbers = { 0, -5, 10, 3, 16, -10 };
    double[] dnumbers = { -1.5, 0.01, 3.76, -22.55, 10.99 };
    String[] names = { "GIFT", "University", "Gujranwala" };

    // call all methods
    printIntArray(inumbers);
    printDoubleArray(dnumbers);
    printStringArray(names);

    int value = 100;
    changeValue(value);
    System.out.println(value);

    changeArrayValues(inumbers);
    printIntArray(inumbers);

    int[] negativeValuesArray = {-1, -2, -3, -4, -5};
    printIntArray(negativeValuesArray);

    int[] absArray = absoluteValueArray(negativeValuesArray);
    printIntArray(absArray);
    printIntArray(negativeValuesArray);

    for(int i = 0; i < absArray.length; ++i) {
      System.out.print(absArray[i] + ", ");
    }//for
    System.out.println("\n");   
 
   // enhanced-for loop
   for(int ivalue : absArray) {
     System.out.print(ivalue + ", ");
   }//enhanced-for
   System.out.println("\n");      
*/

public static void main(String[] ags){
Scanner keyboard =  new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = keyboard.nextInt();

    System.out.print("Enter a starting number: ");
    int start = keyboard.nextInt();

    // input validation using a for-loop
    /*
    while(start == 0) {

    }//while
    */	

    for(int tries = 1; start == 0 && tries <= 3; ++tries) {
      System.out.print("Enter a non-zero starting number: ");
      start = keyboard.nextInt();

      if(tries == 3) {
	// wait 
        for(int i = 1; i <= 100000; ++i) {}
        tries = 0;
      }//if	

    }//for
 
  }//main



}//class