 /*
	Zerlish Burhan
	221400111
	section-F
	CS-132
*/
import java.util.Scanner;
import java.util.Arrays;
public class A4_221400111{

	static void printMaxMin(int[] array){

	int MaxNum = array[0], MinNum = array[0];

	for(int i = 0; i < array.length ; ++i){

		if(  MaxNum < array[i]){
		MaxNum = array[i];
		}//if

		if(array[i] < MinNum){
		MinNum = array[i];
		}//if

	}//for

	System.out.println( "the maximum num is = " + MaxNum );
	System.out.println( "the minimum num is =" + MinNum );

	
	
	}//Q1

	static void alternatingSum(int[] array){
		int sum1 = 0;
		int sum2 = 0;
			for(int i =0; i<= array.length- 1; ){
				sum1 += array[i] ;
				i+=2;
			}//FOR (for even index sum)

			for(int count =1; count<= array.length- 1; ){
				sum2 += array[count] ;
				count+=2;
			}//FOR (for odd index sum)

			int sum3 = sum1 - sum2;

			System.out.print("The alternating sum is =  " + sum3);

			

			}//Q2

		static void reverseArray(int[] array){

		int a = array.length;

		int[] result = new int[a];

		for(int i = 0 ; i < a ; ++i ){
		result[array.length-1-i] = array[i];
		}//for
		
			for(int n : result ){
		System.out.print(n + ",");		
		}//for
					
		}//Q3	

	static boolean identicalStringArrays(String[] first, String[] second){

		boolean flag = true;
			if(first.length!=second.length){
				flag = false;
				return flag;
			}//if
		for(int i = 0; i< first.length; ++i){
			if(first[i].equals(second[i])){
				flag = true;
			}//if
			else{
				flag = false;
			}//else
		}//for
		return flag;

	}//Q4

		

	public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	System.out.print("............Q1.................");

	System.out.print("Enter the length of array : ");
	int len = keyboard.nextInt();

	int[] array = new int[len];

	System.out.print("Enter values in array ");
		for(int i = 0; i < array.length ; ++i){
		array[i] = keyboard.nextInt();
		}//FOR TO TAKE INPUT OF INTEGER

		for(int i = 0; i < array.length;++i){
		System.out.print(array[i]+",  ");
		}//FOR TO PRINT ARRAY

	System.out.println();	

	 printMaxMin(array);
	
	

//================================================================================================
	System.out.print("............Q2.................");

	System.out.println();

	System.out.println("enter array size:  ");
	int size = keyboard.nextInt();

		int[] arraya = new int[size];

		System.out.println("enter integer in array:  ");

			for(int i =0; i<= arraya.length- 1; i++){
			arraya[i] = keyboard.nextInt();
			}//FOR TO TAKE INPUT OF INTEGER

			for(int i = 0; i < arraya.length;++i){
			System.out.print(arraya[i]+",  ");
			}//FOR TO PRINT ARRAY

	System.out.println();

	 alternatingSum(arraya);
	
	

//======================================================================================
		System.out.print("............Q3.................");

	System.out.println();

	System.out.println("enter array size:  ");
	int SIZE = keyboard.nextInt();

		int[] arrayb = new int[SIZE];

		System.out.println("enter integer in array:  ");

			for(int i =0; i<= arrayb.length- 1; i++){
			arrayb[i] = keyboard.nextInt();
			}//FOR TO TAKE INPUT OF INTEGER
		
			reverseArray(arrayb);		

	System.out.println();
//==================================================================================
		System.out.print("............Q4.................");

	System.out.println();

	System.out.println("enter array size:  ");
	int LENGTH = keyboard.nextInt();

		String[] arrayc = new String[LENGTH];

		
			System.out.println("enter words in array:  ");
			for(int i =0; i<= arrayc.length- 1; i++){
			
			arrayc[i] = keyboard.next();
			}//FOR TO TAKE INPUT OF INTEGER

			for(int i =0; i<= arrayc.length- 1; i++){
			System.out.print( arrayc[i] + " ");
			}//FOR TO TAKE INPUT OF INTEGER
	System.out.println();


	System.out.println("enter second array size:  ");
	 len = keyboard.nextInt();

		String[] arrayd = new String[len];

		
			System.out.println("enter words in  second array:  ");
			for(int i =0; i<= arrayd.length- 1; i++){
			
			arrayd[i] = keyboard.next();
			}//FOR TO TAKE INPUT OF INTEGER

			for(int i =0; i<= arrayd.length- 1; i++){
			System.out.print( arrayd[i] + " ");
			}//FOR TO TAKE INPUT OF INTEGER

	System.out.println();
			identicalStringArrays(arrayc , arrayd);
			System.out.println(identicalStringArrays(arrayc , arrayd));


	}//main


}//class