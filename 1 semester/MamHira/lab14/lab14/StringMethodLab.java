import java.util.Scanner;

class StringMethodLab{

public static int countLowercaseCharacters(String name){
int count = 0;
int length = name.length();
for( int i = 0 ; i < length ; i++ ){

char ch = name.charAt(i);

if(Character.isLowerCase(ch)){ 

 count++;

}//if



}//while



return count;



}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter name : ");
String name = keyboard.nextLine();


int length = countLowercaseCharacters( name);
System.out.print(length);








}//main


}//class