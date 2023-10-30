import java.util.Scanner;

class StringMethod{

public static void displayBackwards(String str){

int length = str.length();
for( int i = length-1 ; i >= 0 ; i-- ){

  System.out.println(str.charAt(i));


}//while






}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter name : ");
String name = keyboard.nextLine();

displayBackwards(name);


}//main
}//class
