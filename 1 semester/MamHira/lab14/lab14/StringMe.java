import java.util.Scanner;

class StringMe{

public static int countNumberOfWords(String name){

int count = 1;

int length = name.length();

for( int i = 0 ; i < length ; i++ ){


char ch = name.charAt(i);

if(Character.isWhitespace(ch)){ 

 count++;

}//if



}//while



return count;



}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter line : ");
String line = keyboard.nextLine();


int length = countNumberOfWords(line);
System.out.print(length);



}//main
}//class