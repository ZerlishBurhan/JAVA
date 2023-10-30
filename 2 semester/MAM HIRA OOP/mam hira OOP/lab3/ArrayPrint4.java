import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint4{

	public static void reversearray(int[][] array){
	
	int a = array.length;
	int[] temp = array[0];
	array[0] = array[a-1];
	array[a-1] = temp;

	
	}//method


	public static void printarray(int[][] array){
	System.out.print("[");
	for (int row = 0;  row < array.length; ++row) {
	for (int column = 0; column < array[row].length; ++column){
	System.out.print(array[row][column] + ",");

	}//for
	}//for
	System.out.print("\b]");
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

	reversearray(array);
	printarray(array);

	}//main


}//class