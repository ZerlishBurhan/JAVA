/*
Zerlish Burhan
221400111
section-A
cs-240 OOP lab
*/
import java.util.Arrays;

import java.util.Scanner;

  public class FindWordByLength{

	public static String[] findWordsByLength(String[] array, int length){
 	  int count = 0;
	   for(int i = 0 ; i < array.length ; ++i){
	   int w =array[i].length();
	   if( w == length ){
	   System.out.print(array[i]);
		count++;
	   }//if

	}//for

System.out.println();
 
	        
	 String[] findWords = new String[count];

	   int index =0; 
	   for(String word : array){
	   if( word.length() == length ){
	   findWords[index] = word ;
	   index++;
	   }//if

	   }//for		
	
                	System.out.print(Arrays.toString(findWords));

	System.out.println();

	String w;
	if(findWords.length!=0){
	for(int i = 0 ; i < findWords.length ; ++i){
	 w = findWords[i];
	 countVowels(w + ",");
	}//for 
	}else
	{
 	System.out.print("not found");
	}//else 
    
	 return array;


        }//method

	static int countVowels(String word){

	int vowelcount = 0 ;

	for(int i = 0 ; i < word.length() ; ++i){
	
	char character = word.toLowerCase().charAt(i);
	if(character=='i' || character=='a' || character=='e' || character=='o' || character=='u' || character=='y'){
	vowelcount++;
			}//if
	}//for
	System.out.print( "The vowel are : " + vowelcount);
	return vowelcount;
	}//method2

     public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

      	System.out.print("Enter the length of array : ");     
        int length = keyboard.nextInt();
	String[] array = {"apple", "orange", "strawberry", "grape", "kiwi"} ;

	 findWordsByLength(array, length);



     }//main
  }//class
