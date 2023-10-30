public class method{

     static void sum(int num1,int num2){

 int result = num1 + num2;
 System.out.println("The result is: " + result);
}//sum
     static void sum2(int num1,int num2,double num3 ){

 double  result = num1 + num2 + num3 ; 
 System.out.println("The result is: " + result);
}//sum2
     static void sum3(int num1,int num2,  String num4,double num3){

 String  result = num1 + num2 + num4 + num3 ; 
 System.out.println("The result is: " + result);
}//sum2
public static void main (String[] args){


sum(5,4);
	int n1= 2 , n2= 3;
	double num3= 9 ; 
                    sum2(n1,n2,num3);


	sum2(5,4 , 6.0 );



	sum3(5,4 , "hello ",18.9999);
}
}