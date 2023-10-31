import java.util.Scanner;

class StringMethodLab1{

public static int countdigit(String name){
int count = 0;
int length = name.length();
for( int i = 0 ; i < length ; i++ ){

char ch = name.charAt(i);

if(Character.isDigit(ch)){ 

 count++;

}//if



}//while



return count;



}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter name : ");
String name = keyboard.nextLine();


int length = countdigit( name);
System.out.print(length);








}//main


}//class