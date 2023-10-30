import java.util.Scanner;
import java.io.*;

public class FileIOSumNumbersLab4{

	public static void main(String[] args) throws Exception{
	
		
		File file = new File("input.txt");
		Scanner input = new Scanner(file);
		FileWriter fw = new FileWriter("output_1.txt" );

		int sum = 0;
		while(input.hasNext()){
			int n = Integer.parseInt(input.next());
			sum+=n;

		}

		fw.write("the sum of 5 integer is " + sum);
		fw.close();
	}	


}