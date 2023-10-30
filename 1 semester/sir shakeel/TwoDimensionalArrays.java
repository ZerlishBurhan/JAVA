/*
  Lecture - 30
  2D Arrays
  06-04-2023
*/

import java.util.Scanner;

class TwoDimensionalArrays {

  // print 2D integer array
  static void printIntArray(int[][] array) {
    for(int rows = 0; rows < array.length; ++rows){
      for(int columns = 0; columns < array[rows].length; ++columns) {
        System.out.print(array[rows][columns] + ", ");
      }//for
      System.out.println();
    }//for    
    System.out.println();
  }//printIntArray
  
  // print 2D integer array
  static void printDoubleArray(double[][] array) {
    for(int rows = 0; rows < array.length; ++rows) {
      for(int columns = 0; columns < array[rows].length; ++columns) {
        System.out.print(array[rows][columns] + ", ");
      }//for
      System.out.println();
    }//for    
    System.out.println();
  }//printDoubleArray

  // print 2D integer array
  static void printStringArray(String[][] array) {
    for(int rows = 0; rows < array.length; ++rows) {
      for(int columns = 0; columns < array[rows].length; ++columns) {
        System.out.print(array[rows][columns] + ", ");
      }//for
      System.out.println();
    }//for    
    System.out.println();
  }//printStringArray

  static void inputStringArray(String[][] array) {
    Scanner reader = new Scanner(System.in);
    for(int rows = 0; rows < array.length; ++rows) {
      for(int columns = 0; columns < array[rows].length; ++columns) {
        System.out.print("Enter value for [" + rows + 
			"][" + columns + "]: ");
        array[rows][columns] = reader.nextLine();
      }//for
      System.out.println();
    }//for    
    System.out.println();
  }//inputStringArray



}//class