
import java.util.Scanner;

public class ArrayPrint2{

	public static void Average(int[][] array){
	
	int sum=0 , count = 0;
	
	for (int row = 0;  row < array.length; ++row) {
	for (int column = 0; column < array[row].length; ++column){
	 sum = sum + array[row][column];
	count++;
	
	}//for
	}//for
	System.out.print(" THE SUM IS " + sum);	
	System.out.println();
	double average = sum/count;
	System.out.print(" the average is  " + average);
	
	}//method

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter the size of row : ");
	int r = keyboard.nextInt();
	System.out.print("Enter the size of column :");
	int c = keyboard.nextInt();
	
	int[][] array = new int[r][c];
	for (int row = 0;  row < array.length; ++row) {
	for (int column = 0; column < array[row].length; ++column){
	System.out.println("Enter the value for index " +
	row + " of row at index " + column + ": ");
	array[row][column] = keyboard.nextInt();
	}//for
	}//for
	
	Average(array);

	}//main


}//class