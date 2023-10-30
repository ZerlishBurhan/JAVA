import java.util.Scanner;
import java.io.*;
class FileIOFirstRepeatingNumberLab4{

	public static int getrepeat(int[] array){

		for (int i = 0 ; i < array.length;++i){
			for(int j=i+1; j < array.length; ++j){
				if(array[i]==array[j]){
					return array[i];
				}//if
			}//for
		}//for
		return -1;

	}//method
	 
	 public static void main(String[] args) throws Exception{
	 	
	 	File fl = new File("input2.txt");
	 	Scanner input2 = new Scanner(fl);
	 	FileWriter fw = new FileWriter("output_3.txt");


	 	int size = Integer.parseInt(input2.next());
	 	int[] array = new int[size];
	 	int i = 0;
	 	while(input2.hasNext()){
	 		array[i]=Integer.parseInt(input2.next());
	 		i++;
	 	}//while
		int repeat = getrepeat(array);
		System.out.println(repeat);
		fw.write("value: " + repeat);
		fw.close();	 		
	 }//main
}//class