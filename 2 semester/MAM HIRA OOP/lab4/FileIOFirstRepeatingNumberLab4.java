

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileIOFirstRepeatingNumberLab4{
	public static void main(String[] args) throws Exception{
		File file=new File("input-3.txt");
		Scanner input=new Scanner(file);
		FileWriter fw=new FileWriter("output-3.txt");

		int size=Integer.parseInt(input.next());
		int[] array=new int[size];
		int i=0;
		while(input.hasNext()){
			array[i]=Integer.parseInt(input.next());
			i++;	
		}//while

		int firstRepeatingNumber=getFirstRepeatingNumber(array);
		if(firstRepeatingNumber>0){
			fw.write(firstRepeatingNumber+" ");
		}//if
		else{
			fw.write("All Elements are Unique");
		}//else
		fw.close();

	}//main

	static int getFirstRepeatingNumber(int[]array){
		
		for (int i = 0; i < array.length ; ++i) {
			for (int j = i + 1; j < array.length ; ++j) {
				if (array[i] == array[j]){
					return array[i];
				}//if
			}//inner-for
		}//outer-for

		return -1;

	}//getFirstRepeatingNumber

}//class
FileIOFirstRepeatingNumberLab4.java
Displaying FileIOFirstRepeatingNumberLab4.java.