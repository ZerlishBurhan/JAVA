import java.util.Scanner;
public class 2darray{
static void  printintarray(int[][] array){

for(int rows = 0 ; rows<array.length;++rows){

for(int columns = 0 ; column<array[rows].length;++columns){

System.out.print("Enter value for [" + rows + 
			"][" + columns + "]: "););

array[rows][columns]=keyboard.nextInt();
}//for
}//for


}//method

public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);

int[][] name = new int[][];

printintarray(name);
}//main
}//class