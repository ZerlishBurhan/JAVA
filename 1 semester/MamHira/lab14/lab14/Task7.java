import java.util.Scanner;

   public class Task7{

    public static void verifyPassword(String password){

		Scanner keyboard = new Scanner(System.in);

		int count1=0 , count2=0 ,count3=0;

System.out.println();

	int len = password.length();
	System.out.println("The length of password is : " + len);

System.out.println();

//..........upper case.......

	for(int i = 0 ; i<len; ++i){
		char ch = password.charAt(i);
			if(Character.isLowerCase(ch)){
			count1++;
			}//if
		
	}//for
	System.out.println("The Lowercase in the given password are : " + count1);

System.out.println();
//........lower case........

	for(int i = 0 ; i<len; ++i){
		char ch = password.charAt(i);
			if(Character.isUpperCase(ch)){
			count2++;
			}//if
		
	}//for
	System.out.println("The Uppercase in the given password are : " + count2);

System.out.println();

//.....Digit.......

	for(int i = 0 ; i<len; ++i){
		char ch = password.charAt(i);
			if(Character.isDigit(ch)){
			count3++;
			}//if
		
	}//for

	System.out.println("The digits in password are : " + count3);

System.out.println();

//............Validation....................

		if(len<=8 || count1<1 || count2<1 || count3<1){
		
			System.out.print("Password not verified !");
			System.out.print("Enter the correct password =  ");
			password = keyboard.nextLine();

		System.out.println("The length of password is : " + len);
	        System.out.println("The Lowercase in the given password are : " + count1);
		System.out.println("The Uppercase in the given password are : " + count2);
		System.out.println("The digits in password are : " + count3);


		}//if valaidation 
		else{
		System.out.print("Password verified !");
		}


}//method

public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

System.out.println();

		System.out.println(".......Password instructions........");
System.out.println();
System.out.println("The password should be at least eight characters long.");	
System.out.println("The password should contain at least one uppercase and at least one lowercase letter.");
System.out.println("The password should have at least one digit.");

System.out.println();


		System.out.print("Enter  the password :");
		String password = keyboard.nextLine();

System.out.println();


		verifyPassword(password);



}//main


}//class