import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrint5{

	public static void add(int[][] firstmatrix , int[][] secondmatrix){
	
	 int[] array3 = new int[];
	for (int row = 0;  row < array.length; ++row) {
	for (int column = 0; column < array[row].length; ++column){	
	 firstmatrix+=secondmatrix;
	 array3 = firstmatrix;
	System.out.print(array3 + " ");
	}//for
	}//for
	
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

	System.out.println();
	System.out.print("Enter the value of second matrix : ");
	System.out.print("Enter the size of row : ");
	int sr = keyboard.nextInt();
	System.out.print("Enter the size of column :");
	int sc = keyboard.nextInt();
	
	int[][] array2 = new int[sr][sc];
	for (int row = 0;  row < array2.length; ++row) {
	for (int column = 0; column < array2[row].length; ++column){
	System.out.println("Enter the value for index " +
	row + " of row at index " + column + ": ");
	array[row][column] = keyboard.nextInt();
	}//for
	}//for

	add(array,array2);
	printarray(array,array2);

	}//main


}//class