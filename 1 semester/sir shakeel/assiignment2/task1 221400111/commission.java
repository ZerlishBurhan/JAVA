import java.util.Scanner;
public class commission{

	public static void main(String[] args){

	Scanner keyboard= new Scanner(System.in);

	char ch ='Y';
	int b_s = 200 ;
	double sale1 =0 , sale = 0 , cm = 0 , pay = 0 ,price ,item , quantity    ;	

	while( ch =='Y' || ch == 'y'){


	System.out.print("Enter number of items..............................................=");	
	 item =keyboard.nextDouble();

	System.out.print("Enter number of quantity...........................................=");	
	quantity =keyboard.nextDouble();


 	System.out.print("Enter number of price..............................................=");	
	 price =keyboard.nextDouble();

	item = ( price * quantity);
	

 	sale = sale + item ;

	System.out.print("You want to add more item............................(Y/N)= ");
	ch = keyboard.next().charAt(0);
	
	System.out.println("The sale  : "+ sale );
	
	
	
	}//while

	cm = (0.09 * sale);
	System.out.println("The commission  is :" + " $ " + cm   );
	
	pay = cm + b_s;

 	System.out.println("The pay is : " + " $ " + pay );




	}//main


}//class