import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
class FileIOFirstRepeatingNumberLab5{

	public static void smallest(int[] array){
		System.out.print(Arrays.sort(array));
		System.out.print(array[1]);
		}//method

	public static void largest(int[] array){
		System.out.print(Arrays.sort(array));
		System.out.print(array.length - 2);
		}//method
	 
	 public static void main(String[] args) throws Exception{
	 	
	 	File fl = new File("input3.txt");
	 	Scanner input3 = new Scanner(fl);
	 	FileWriter fw = new FileWriter("output_4.txt");


	 	int size = Integer.parseInt(input3.next());
	 	int[] array = new int[size];
	 	int i = 0;
	 	while(input3.hasNext()){
	 		array[i]=Integer.parseInt(input3.next());
	 		i++;
	 	}//while
		smallest(array);
		largest(array);
		
		fw.write("the second smallest is : "  + smallest);
		fw.write("the second largest is : " + largest);

		fw.close();	 		
	 }//main
}//class