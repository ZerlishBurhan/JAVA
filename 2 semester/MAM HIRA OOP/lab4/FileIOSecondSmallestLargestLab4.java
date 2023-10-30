import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class FileIOSecondSmallestLargestLab4{
	public static void main(String[] args) throws Exception{
		File file=new File("input-4.txt");
		Scanner input=new Scanner(file);
		FileWriter fw=new FileWriter("output-4.txt");

		int size=Integer.parseInt(input.next());
		System.out.println("Size" + size);
		int[] array=new int[size];
		
		int i=0;
		while(input.hasNext()){
			array[i]=Integer.parseInt(input.next());
			
			i++;	
		}//while
		
		
		fw.write(getSecondSmallestNumber(array)+" "+getSecondLargestNumber(array));
		fw.close();
		

	}//main

	static int getSecondSmallestNumber (int[] array){
		
		Arrays.sort(array);
    		return array[1];


	}//getSecondSmallestNumber()

	static int getSecondLargestNumber (int[] array){

		Arrays.sort(array);
    		return array[array.length-2];
	}//getSecondLargestNumber()
}//class