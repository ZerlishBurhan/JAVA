/*
  Lecture - 28
  Arrays and Methods
  30-03-2023
*/

class ArrayExample {

  // print the array 
  static void printIntArray(int[] array) {
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


  }//main


}//class