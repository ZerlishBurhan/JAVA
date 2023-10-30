import java.util.Scanner;
import java.io.*;
public class lab2{

	public boolean fabbico(int[] array){

		boolean flag = true ; 

		if(array[0]!= 0 && array[1]!=1){
		flag = false ; 
		}//if

		for(int i = 2 ; i < array.length ; ++i){

				if(flag){
					if(array[i-1] + array[i-2] = array[i]){
							flag = false ; 
					}
				}
				else{
					return false;
				}

		}//for
				return flag; 
	}//method

 	public static void main(String[] args) {
	
		File obj = new File("input.txt");
		Scanner read = new Scanner(obj);
		FileWriter fw = new FileWriter("output.txt");

		int size = Integer.parseInt(read.next());
		int array[] = new int[size];

		int i = 0 ;
		 while(read.hasNext()){
		 		array[i] = Integer.parseInt(read.next());
		 		++i;
		 }//while

		 if(fabbico(array)){
		 	
		 }
		 fw.close();




	}

}