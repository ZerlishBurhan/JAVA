import java.util.Scanner;

class StringMethodLab14{

public static int countSpaceCharacter(String name){
int count = 0;
int length = name.length();
for( int i = 0 ; i < length ; i++){

char ch = name.charAt(i);

if(Character.isWhitespace(ch)){ 

 count++;

}//if



}//for

if(count == 0){

System.out.print("Invalid");

}//if2



return count;



}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter name : ");
String name = keyboard.nextLine();


int length = countSpaceCharacter( name);
System.out.print(length);








}//main


}//class