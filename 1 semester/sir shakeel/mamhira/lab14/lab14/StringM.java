import java.util.Scanner;

class StringM{

public static void verifyPassword(String password){
Scanner keyboard = new Scanner(System.in);

int count1 = 0 , count2 = 0 , count3= 0 ;
int length = password.length();
for( int i = 0 ; i < length ; i++ ){

char ch = password.charAt(i);

if(Character.isLowerCase(ch)){ 

 count1++;

}//if1

}//for



for( int i = 0 ; i < length ; i++ ){

char ch = password.charAt(i);

if(Character.isDigit( ch)){ 

 count2++;

}//if2

}//for2



for( int i = 0 ; i < length ; i++ ){

char ch = password.charAt(i);
if(Character.isUpperCase(ch)){ 

 count3++;

}//if3

}//for3
 if(length<8 || count1<1 || count2<1 || count3<1){

System.out.println("password is invalid ");
System.out.print("Enter password AGAIN ! ");
 password = keyboard.nextLine();


}//validation



System.out.println("lower case = " + count1);
System.out.println("DIGIT  = " + count2);
System.out.println("upper case = " + count3);
System.out.println("password length = " + length);



}//method

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter password : ");
String password = keyboard.nextLine();


 verifyPassword(password);






}//main


}//class