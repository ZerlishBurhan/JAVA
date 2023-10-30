public class returningmethod{

static  int sum1(int n1,int n2){
	 int result = n1 + n2 ;
	return result;
}
static  double sum2(int n1,int n2 , double n3){
	double result = n1 + n2 + n3 ;
	return result;
}
static  String sum3(int n1,int n2 , String n4  ){
	 String result = n1 + n2 + n4 ;
	return result;
}
static  boolean evaluation(boolean n1 ,boolean n2){
	 boolean result = n1 && n2 ;
	return result;
}


public static void main (String[] args){

int n1=5 , n2 =6 ;
int result= sum1(n1, n2);
	System.out.println("The result is " + result);

 n1=52 ;  n2 =64 ;
double n3= 2.89;
double  n7 = sum2(n1, n2 , n3);
	System.out.println(n7);

 n1=54 ; n2 =66 ;
 String n4 = "my world";
 String n5 = sum3(n1, n2 , n4 );
	System.out.println( n5);

boolean n9= 0<1;
boolean n11 = 4!=5;
 boolean n6 = evaluation(n9,n11);
	System.out.println (n6);
}//main

}//class