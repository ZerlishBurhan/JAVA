import java.util.Arrays;

public class array3{
 public static void printarray(int[] array) {

	for(int i = 0; i < array.length; ++i){
	System.out.print(array[i] + ",");
	}//for

}//method 


public static void main(String[] args){

char[] carray = {'A', 'a', 'B', 'c', 'd', 'r', 'y', 'u'};

	for(int i = 0 ; i < carray.length ; ++i){
	System.out.println( carray[i] + ",");
	}//for

//===================================================================

	int[] num = {190, 45, 7 , 12 , 8, 100, 9890};
	System.out.println(  " ARRAY BEFORE SORTING ..........");
	for(int i = 0; i < num.length ; ++i ){
	System.out.println( num[i] + ",");
	}//FOR

System.out.println();

	Arrays.sort(num);

	System.out.println(  " ARRAY AFTER SORTING ..........");
	for(int i = 0; i < num.length ; ++i ){
	System.out.println( num[i] + ",");
	}//FOR
//========================method array=======================================
System.out.println("\n");

int[] no = {2, 67, 89, 76 , 90 , 88, 90, 89};

printarray(no);

}//main

}//class