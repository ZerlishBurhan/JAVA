/*
  Lecture - 27
  Array with methods
  29-03-2023
*/

class ArrayExample3 {

  // method to print the array
  static void printArray(int[] array) {
    for(int i = 0; i < array.length; ++i) {
      System.out.print(array[i] + ", ");
    }//for    
    System.out.println();
  }//printArray

  public static void main(String[] args) {
  
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // pass the array as the argument
    printArray(numbers);

  }//main

}//class
