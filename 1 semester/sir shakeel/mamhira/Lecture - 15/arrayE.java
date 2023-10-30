import java.util.Scanner;

 public class arrayE{

	public static int getSLIndex(int[] array, char typeofvalue){
	int sindex=0,lindex=0;
	if(typeofvalue=='s'){
	for(int i = 0; i<array.length;++i){
	if(array[ i]<array[sindex]){
	 sindex=i;
	}//if	
	}//for
	return sindex;
	}//if for s


	else if(typeofvalue =='l'){
	for(int i = 0; i < array.length;++i){
	if(array[i]>array[lindex]){
	 lindex=i;
	}//if
	}//for
	return lindex;
	}//elseif for l
	else{
	return -1;
	}
	}//method

     public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter length of the array: ");
		int len = keyboard.nextInt();

		int[] array = new int[len];

		for(int i = 0 ; i< array.length;++i ){
		array[i] = keyboard.nextInt();
		}//for

		System.out.print("Press 's' to find smallest number and 'l' to find largest number :");
		char value = keyboard.next().charAt(1);		

		System.out.print(getSLIndex(array,value));
		
    }//main

   }//classs