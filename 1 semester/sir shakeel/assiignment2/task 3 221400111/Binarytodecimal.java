import java.util.Scanner;

public class Binarytodecimal{

  public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

    double n =0 , modulous = 0 , decimal1 = 0 ,decimal2 =0 ;

	System.out.println("enter a binary number:");
	 int binary = keyboard.nextInt();
   
	while(binary != 0){

	
             if (modulous == 1 || modulous == 0){
     	
	
	modulous = binary % 10 ;
	decimal2 = modulous * Math.pow(2,n);
	binary = binary / 10 ;

        n++;

	decimal2 += decimal1;		
	
}//if

     else{
			System.out.println("The Binary is Incorrect");
			decimal2 = 0;
	                 break;

     }//else



}//while
	  if(decimal2 != 0){
		System.out.println("the decimal is :" + decimal2);

}//if


}//main


}//class