/*
  Lecture - 30
  2D Arrays
  06-04-2023
*/

class TwoDimensionalArraysTest{

  public static void main(String[] args) {

    // create two-D array
    int[][] numbers = new int[3][3];

    final int ROWS = 4;
    final int COLUMNS = 5;

    double[][] ratios = new double[ROWS][COLUMNS];

    numbers[0][0] = 10;
    numbers[1][2] = 100;

    String[][] names = { {"A", "B"}, {"C","D"}, {"E", "F"} };

    TwoDimensionalArrays.printStringArray(names);

    TwoDimensionalArrays.inputStringArray(names);

    TwoDimensionalArrays.printStringArray(names);



  }//main

}//class