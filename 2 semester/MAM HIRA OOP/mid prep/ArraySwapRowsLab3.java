import java.util.Scanner;

public class ArraySwapRowsLab3{

	static void fillArray (int[][] array){

		Scanner input = new Scanner(System.in);
		for (int i = 0;i<array.length ; ++i) {
			for (int j = 0;j<array[i].length ; ++j){
				System.out.print("Enter the value for index " + j + " of row at index " + i + ": ");
				array[i][j] = input.nextInt();
			}//inner-for
		}//outer-for

	}//fillArray()

	static void swapFirstAndLastRow(int[][] array){
		
		for (int i = 0; i < array[0].length ; ++i) {
			int temp  = array[0][i];
			array[0][i] = array[array.length - 1][i];
			array[array.length - 1][i] = temp;
		}//for

	}//swapFirstAndLastRow()

	static void printArray(int[][] array){
		
		for (int i = 0; i < array.length ; ++i) {
			for (int j = 0; j < array[i].length ; ++j){
				System.out.print(array[i][j] + "\t");
			}//inner-for
			System.out.println();
		}//outer-for

	}//printArray()

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
		int rows = 0, columns = 0;

		while(rows <= 0){
			System.out.print("Enter the number of rows. (must be greater than 0): ");
			rows = input.nextInt();
		}//while

		while(columns <= 0){
			System.out.print("Enter the number of columns. (must be greater than 0): ");
			columns = input.nextInt();
		}//while

		int[][] array = new int[rows][columns];
		
		fillArray(array);
		System.out.println("The array before calling the swapFirstAndLastRow method:");
		printArray(array);
		swapFirstAndLastRow(array);
		System.out.println("The array after calling the swapFirstAndLastRow method:");
		printArray(array);

	}//main
}//class