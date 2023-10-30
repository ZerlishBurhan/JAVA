import java.util.Scanner;
public class twodarray{
static void  printintarray(int[][] array){

Scanner keyboard = new Scanner(System.in);

	for(int rows = 0 ; rows<array.length;++rows){
	for(int columns = 0 ; columns<array[rows].length;++columns){
	System.out.print("Enter value for [" + rows + 
			"][" + columns + "]: ");
	array[rows][columns]=keyboard.nextInt();
	}//for
	}//for
	}//method

	static void printarray(int[][] array){
	for(int rows = 0 ; rows<array.length;++rows){
	for(int columns = 0 ; columns < array[rows].length; ++columns){
	System.out.print(array[rows][columns]+",");
	}//for
System.out.println();
	}//for
	}//method

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

	int[][] name = new int[3][4];
		
		printintarray(name);
		printarray(name );
	}//main
	}//class