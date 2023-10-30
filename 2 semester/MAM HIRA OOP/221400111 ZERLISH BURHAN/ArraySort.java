/*
ZERLISH BURHHAN 
221400111
OOP - LAB 
*/
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;

class ArraySort{

	static int[] sortArray(int[] array){

			isValidArray(array);
			System.out.println(isValidArray(array));
			System.out.println("");

			System.out.println("ARRAY BEFORE SORTING ");
			System.out.println(" ");
				printArray(array);
				System.out.println("");

			if(isValidArray(array) == true){
				for (int i = 0 ; i < array.length  ; ++i ) {
					for (int j = i+1 ; j < array.length -1  ; ++j ) {
						if(array[i] < array[j]){
								int temp = array[i];
								array[i] = array[j];
								array[j] = temp;
						}//if
					}//for
				}//for
			}//if
			else{
				System.out.println("false");;
			}//else

			System.out.println(" ");
			System.out.println("ARRAY AFTER SORTING");
			System.out.println("");
				printArray(array);
				System.out.println("");

				return array;

	}//sort method

	static boolean isValidArray(int[] array){
		boolean flag = true;
			for ( int num : array ) {
				if(num != 1 && num!= 2 && num!=3){
					return !flag;
				}//if
					
			}//for
				return flag;
	}//method

	static void printArray(int[] array){
		System.out.print("{");
			for (int i = 0 ; i < array.length ; ++i ) {
				System.out.print(array[i] + "," );
			}//for
			System.out.print("\b}");
	}//method
	public static void main(String[] args) throws Exception{
		
		File fl = new File("input.txt");
		Scanner keyboard = new Scanner(fl);
		FileWriter fw = new FileWriter("output.txt");
		PrintWriter pw = new PrintWriter(fw);
		
			int size = keyboard.nextInt();
			int array[] = new int[size];

			int i = 0 ; 
			while(keyboard.hasNext()){
				array[i] = Integer.parseInt(keyboard.next());
				++i;
			}//while

						pw.println("ARRAY BEFORE SORTING");

						for (int k = 0 ; k < array.length ; ++k ) {
          					pw.print(array[k] + " ");
					}//for

					boolean flag = isValidArray(array);

					if(isValidArray(array) == true){
							sortArray(array);
					}//if
					else{

							pw.println(" ");	
						    pw.println("The array without sorting is : ");

					}//else

					
						pw.println(" ");

					pw.println("The sorted array is : " );

					for (int k = 0 ; k < array.length ; ++k ) {
          					pw.print( array[k] + " ");
					}//for
				
			
				pw.close();


	}//main
}//class