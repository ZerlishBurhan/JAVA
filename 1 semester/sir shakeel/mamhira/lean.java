import java.util.Scanner;

public class lean{

public static boolean isVowel(char v){

if(v== 'a' || v=='e' || v=='i' || v=='o' || v=='u'){

return true;
}
return false;
}//method
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter a character = ");
char ch = keyboard.next().charAt(0);

isVowel(ch);


}//main

}//class