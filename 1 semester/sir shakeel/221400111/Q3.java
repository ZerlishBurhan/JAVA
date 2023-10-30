/*
zerlish burhan
221400111
section f 
*/


import java.util.Scanner;

public class Q3{

public static int binarytodecimal(int binarynumber){
Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter binary: ");
	 int binary = keyboard.nextInt();

	int   moudulous = 0,  decimal = 0 , n = 0 , i = 0   ; 
	
	while((binary != 0)){

	if((moudulous==0 || moudulous==1)){
	moudulous = binary % 10;

	i =(int)(moudulous * Math.pow(2,n));

	binary = binary / 10;

	n++;

	decimal += i;

	
}//if
		else{
		System.out.println("Enter correct binary");
		decimal=0;
		break;
		}//else
}//while
	System.out.println("the decimal is :" + decimal);

        return decimal;

}//binarytodecimal

  public static void main(String[] arg){

   int num = 0;
   int decimal = binarytodecimal(num);
   System.out.print(decimal);

  }//main

}//class