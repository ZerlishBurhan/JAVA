import java.util.Scanner;

 public class arrayD{

	public static int getSecondIndex(int[] array, int occurrence, int value){
	int count = 0;
	for(int i = 0 ; i<array.length ; ++i){

	if(array[i]==value){

	count++;

	}//if
	if(count== occurrence){
	return i;
	}//if

	}//for

	return-1;

	}//method

     public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter length of the array: ");
		int len = keyboard.nextInt();

		int[] array = new int[len];

		for(int i = 0 ; i< array.length;++i ){
		array[i] = keyboard.nextInt();
		}//for

		System.out.print("Enter the number you want to find : ");
		int num = keyboard.nextInt();

		System.out.print("Enter the occurrence you want to find : ");
		int occur = keyboard.nextInt();
		
		System.out.print(getSecondIndex(array,occur , num));
		
		if(occur<=1){
			System.out.print("not found");

		}else{
			System.out.print("found");

		}
		
    }//main

   }//classs