/*name zerlish burhan
 ID 221400111
*/
import java.util.Scanner;
public class Data{
	public static void main(String[] args){
	Scanner keyboard=new Scanner(System.in);

	System.out.println("Enter Days:");
	int day =keyboard.nextInt();

	System.out.println("Enter Months:");
	int month =keyboard.nextInt();

	System.out.println("Enter Years:");
	int year =keyboard.nextInt();

if((day>0 && day<=31)&&(month>0 && month<=12)&&(year>=1990 && year<=2023)){

	if((month==4|| month==6 || month==9 || month==11) && (day <=30)){
	System.out.println("The entered date "+day+"_"+month+"_"+year+"valid");
	}//nested 1 if


	if((month==1 || month==3 || month==5 || month==7|| month==8 || month==10|| month==12) && (day <=31)){
	System.out.println("The entered date "+day+"_"+month+"_"+year+"is valid");
	}//nested 2 else
	
	 if(month==2 && day==29 && (year %4==0)){
	System.out.println("The entered date "+day+"-" +month+"- "+year+"is valid");
	}// nested 3 else

	 if( (day<=28)&& (month==2)){
	System.out.println("The entered date "+day+"-"+month+"-"+year+"is valid");
	}// nested 4 else
	
	 if( (day>29)&& (month==2)){
	System.out.println("The entered date "+day+"-"+month+"-"+year+"is invalid");
	}// nested 5 else	
}//if
else{
	System.out.println("The entered date"+day+"-"+month+"-"+year+" is invalid");
    }//else

	}//main



}//class

