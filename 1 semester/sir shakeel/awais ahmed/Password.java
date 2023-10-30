import java.util.Scanner;
public class Password{
	public static void varifyPassword(String s){

	 int l = s.length(), LC = 0, UC = 0, numCount = 0;

	 for(int i = 0; i < l; ++i){
	  char ch = s.charAt(i);
	   if(Character.isLowerCase(ch)){
	    ++LC;
	   }if(Character.isUpperCase(ch)){
	    ++UC;
	   }if(Character.isDigit(ch)){
	    ++numCount;
	   }//if	   
	  }//For(Validation)
	System.out.println("Password length: " + l);
	System.out.println("UpperCase letters: " + UC);
	System.out.println("LowerCase letters: " + LC);
	System.out.println("Digits: " + numCount);
	System.out.println();
	System.out.println("Password Varified! ");
	}//varifyPassword

	public static void main(String[] args){
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.print("Enter The Password: ");
	 String s = keyboard.nextLine();
 
	 int l = s.length(), LC = 0, UC = 0, numCount = 0;

	 for(int i = 0; i < l; ++i){
	  char ch = s.charAt(i);
	   if(Character.isLowerCase(ch)){
	    ++LC;
	   }if(Character.isUpperCase(ch)){
	    ++UC;
	   }if(Character.isDigit(ch)){
	    ++numCount;
	   }//if	   
	  }//For(Validation)
	 while(l < 8 || LC == 0 || UC == 0 || numCount == 0){
	  System.out.print("Invalid Password \nEnter The Password Again: ");
	  s = keyboard.nextLine();
	 }//while(Validation)

	 varifyPassword(s);

	}//main
}//class