/*
ZERLISH BURHHAN 
221400111
OOP - LAB 
*/
import java.util.Scanner;

class columnsumsequal {

	static boolean isFirstAndLastColumnSumEqual(int[][] array){

				boolean flag = true ;
				int column = array[0].length;
				int sum1 = 0 , sum2 = 0 ;

					for (int k = 0 ; k < array.length ; ++k ) {
						sum1 += array[k][0];
						sum2 += array[k][column - 1];
						}//for

		
		System.out.println(sum1 + "=");
		System.out.println(sum2 + "=");

System.out.println();

		if(sum1 == sum2 ){
			return flag;
		}//if
		else{
			return !flag;
		}//else


	}//method 


public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the size of rows : ");
		int row = keyboard.nextInt();

		System.out.print("Enter the size of column : ");
		int column = keyboard.nextInt();

		int array[][] = new int[row][column];

		for (int i = 0 ; i < array.length ; ++i ) {
			for (int j = 0 ; j < array[i].length; ++j ) {
				System.out.print("Enter the value for " + "[" + i + "]" + "[" + j + "]" + "=");
				array[i][j] = keyboard.nextInt();
			}//for
		}//for

		System.out.print(isFirstAndLastColumnSumEqual(array));
	}//main	
}//class