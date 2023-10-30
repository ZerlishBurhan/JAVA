import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class FileIOFibonacciLab4{
	public static void main(String[] args) throws Exception{
		File file=new File("input-5.txt");
		Scanner input=new Scanner(file);
		FileWriter fw=new FileWriter("output-5.txt");

		int size=Integer.parseInt(input.next());
		int[] array=new int[size];
		
		int i=0;
		while(input.hasNext()){
			array[i]=Integer.parseInt(input.next());
			
			i++;	
		}//while
		
		if (isFibonacci(array)){
			fw.write("Fibonacci.");
		}
		else{
			fw.write("Not fibonacci.");
		}//if
		fw.close();
		

	}//main

	static boolean isFibonacci(int[] array){
		
		boolean result = true;
		if (!(array[0] == 0 && array[1] == 1)){
			result = false;
		}//if

		if (result){
			for (int i = 2; i < array.length; ++i) {
				if (array[i - 1] + array[i - 2] != array[i]){
					result = false;
				}//if
			}//for
		}//if

		return result;

	}//isFibonacci

}//class