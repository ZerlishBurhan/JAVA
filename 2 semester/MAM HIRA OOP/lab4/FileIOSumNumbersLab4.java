import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileIOSumNumbersLab4{
	public static void main(String[] args) throws Exception{
		File file=new File("input.txt");
		Scanner input=new Scanner(file);
		FileWriter fw=new FileWriter("output-2.txt");

		int sum=0;

		while(input.hasNext()){
			int n=Integer.parseInt(input.next());
			sum+=n;
		}//while
		
		fw.write(sum+" ");
		fw.close();	
	}//main

	

}//class