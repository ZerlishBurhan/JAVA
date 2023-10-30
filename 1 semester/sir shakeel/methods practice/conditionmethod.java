import java.util.Scanner;

public class conditionmethod{

static int con1(int num1 , int num2){
 	if(num1<=num2){
return num1 ;
	}
else{
return num2 ;
}//else
}//if
public static void main (String[] args){

Scanner input=new Scanner(System.in);

System.out.println ("Enter num1: ");
int n1 = input.nextInt();

System.out.println ("Enter num2: ");
int n2 = input.nextInt();

int maxnum= con1(n1,n2);
System.out.print(maxnum);
}//main

}//class