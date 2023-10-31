import java.util.Scanner;

class StringMethodLa{

public static int searchString(String source, String target){


   return source.indexOf(target);
}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter source : ");
String source  = keyboard.nextLine();

System.out.print("Enter target : ");
String target = keyboard.nextLine();



int b = searchString(source,target);
System.out.print("string count is "+ b );








}//main


}//class