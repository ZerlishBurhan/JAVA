/*
zerlish burhan
221400111
section f 
*/
import java.util.Scanner;
public class Q4{

public static long factorial(int number){

 int i = 1 , fac = 1;

if(number>0){

	while(number>=i){
	     fac*= i;
	        ++i;
	}//while
System.out.print(fac);
	return fac ;
}//if
else{

System.out.print("-9999");

return-9999;

}//else


}//method


public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

int number = keyboard.nextInt();
	
        factorial(number);

}//main
}//class