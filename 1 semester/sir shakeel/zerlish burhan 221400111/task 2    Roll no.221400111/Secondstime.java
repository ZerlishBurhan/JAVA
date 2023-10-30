/* name zerlish burhan
Id 221400111
*/
import java.util.Scanner;
public class Secondstime{

	public static void main(String[] args){
	Scanner keyboard= new Scanner(System.in);

	System.out.print("Enter the no. of seconds:");
	int sec = keyboard.nextInt();

	if(sec>0){
	int days= (int)sec/86400;
	int mod=sec%86400;	
	System.out.print("Enter no. of days:" + days +",");

	int hours= (int)mod/3600;
	 mod=mod%3600;
	System.out.print("Enter no. of hours:"+hours+",");

	int mins=(int)mod/60;
	 mod=mod%60;
	System.out.print("Emter no. of mins:"+mins+",");

	System.out.print("secs: " + mod);	

	}//if
	else{
	System.out.println("Invalid");

	}//else



}//main





}//class