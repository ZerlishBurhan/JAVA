import java.util.Scanner;
class practice3{
	public static void fillarray(int[][] array){
		Scanner keyboard = new Scanner(System.in);

		for (int rows= 0; rows < array.length;++rows) {
			for (int column = 0 ;column < array[rows].length ;++column) {
				System.out.println("[" + rows + "]" + " [" + column + "] = ");
				array[rows][column]= keyboard.nextInt();

			}
		}

	}
	public static void printarray(int[][] array){
System.out.print("{");

		for (int i = 0;i < array.length ;++i ) {
			for (int j = 0 ; j < array[i].length;++j ) {
				System.out.print(array[i][j] + ",");

			}
		}
System.out.print("\b}");		

	}//print

	// public static void printsumaverage(int[][] array){
			// int sum = 0;
			// for (int i = 0 ; i < array.length ; ++i) {
				// for (int j= 0 ;j < array[i].length ;++j) {
				// sum += array[i][j];	
				// }
			// }
			// System.out.println(sum);
 	// }

	// public static void replaceNegative(int [][] array){
			// for (int i = 0; i < array.length ; ++i) {
				// for (int j= 0;j < array[i].length ;++j ) {
					// if(array[i][j]< 0){
						// array[i][j]=0;
					// }
				// }
			// }
	// }

	public static void replace(int[][] array){
		
		for (int i = 0; i < array[0].length ; ++i) {
			int temp = array[0][i];
			array[0][i] = array[array.length - 1][i];
			array[array.length - 1][i] = temp;
		}//for


	}//aray



	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the number of rows :");
		int rows  = keyboard.nextInt();

		System.out.print("Enter the number of column :");
		int column  = keyboard.nextInt();

		int[][] array = new int[rows][column];
		fillarray(array);

		printarray(array);
System.out.println( );
		// printsumaverage(array);
// System.out.println();
		// replaceNegative( array);
// System.out.println();
		// printarray(array);
	replace(array);
	printarray(array);


	}
}