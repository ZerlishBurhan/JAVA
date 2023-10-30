/*
zerlish
221400111
*/
import java.util.Scanner;
public class number{

public static int swapping (int value1, int value2){

if(value1>value2){
return value1;
}//if
else{
return value2;
}
}//method1


public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

	System.out.print("enter first number=");
	int v1 = keyboard.nextInt();

	System.out.print("enter second  number =");
	int v2 = keyboard.nextInt();

	int temp = 0;
	temp = v1 ;
	v2 = temp;
	
	System.out.println( "value 1 is " + v1);
	System.out.println( "value 2 is " + temp);

	int a = swapping (v1,v2);
	System.out.print(a);

	
}//main

}//class