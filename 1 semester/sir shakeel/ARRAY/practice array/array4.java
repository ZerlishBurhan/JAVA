public class array4{

public static void printinteger(int[] array1){

	for(int i = 0; i < array1.length; ++i){
	System.out.print(array1[i] + ",");

	}//for
System.out.println();
}//array1

public static void printString(String[] array2){

	for(int i = 0; i < array2.length ; ++i){
	System.out.print(array2[i] + ",");
	
	}//for
System.out.println();
}//array2

public static void printdouble(double[] array3){

	for(int i = 0; i < array3.length; ++i){
	System.out.print(array3[i] + ",");
	
	}//for
System.out.println();
}//array3

public static void main(String[] args){

int[] num ={1 , 3, 7, 9 , 0, 8 , 67 , 89};
String[] name = {"my " , "name" ,"is zerlish ......"};
double[] num1 = {0.9 , 9.8 , 7.90 , 7.56 , 3.45};

printinteger(num);

printString(name);

printdouble(num1);

}//main
}//class