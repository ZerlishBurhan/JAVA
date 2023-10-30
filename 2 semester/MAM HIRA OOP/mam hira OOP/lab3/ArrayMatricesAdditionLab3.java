public class ArrayMatricesAdditionLab3{

	static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix){
		
		int[][] additionMatrices = new int[firstMatrix.length][firstMatrix[0].length];

		for (int i = 0; i < firstMatrix.length ; ++i) {
			for (int j = 0; j < firstMatrix[i].length ; ++j){
				additionMatrices[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}//inner-for
		}//outer-for

		return additionMatrices;

	}//addMatrices()

	static void printArray(int[][] array){
		
		for (int i = 0; i < array.length ; ++i) {
			for (int j = 0; j < array[i].length ; ++j){
				System.out.print(array[i][j] + "\t");
			}//inner-for
			System.out.println();
		}//outer-for

	}//printArray()

	public static void main (String [] args){

		int[][] firstArray = new int[][]{{5, 7, 9, 4, 3}, {2, 3, 9, 7, 6}, {3, 6, 8, 7, 9}, {1, 9, 7, 5, 6}, {3, 8, 7, 9, 2}};
		int[][] secondArray = new int[][]{{7, 3, 2, 1, 5}, {3, 9, 4, 0, 3}, {6, 2, 8, 9, 4}, {5, 0, 3, 8, 7}, {1, 6, 8, 4, 3}};
		
		System.out.println("The addition of two matrices:");
		printArray(addMatrices(firstArray, secondArray));

	}//main
}//class