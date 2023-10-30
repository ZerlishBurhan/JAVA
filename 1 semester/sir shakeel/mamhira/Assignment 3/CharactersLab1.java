import java.util.Scanner;

public class CharactersLab1{
	public static void wordsInfo(String word){
		int characters=word.length();
		System.out.println(characters+" Characters");
		int vowelCount=0;
		for(int i=0;i<word.length();i++){
			int character=word.toLowerCase().charAt(i);
			if(character=='i' || character=='a' || character=='e' || character=='o' || character=='u' || character=='y'){
				vowelCount++;
			}//if
		}//while
		System.out.println(vowelCount+" Vowels");
	}//wordsInfo
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Word: ");
		String word=input.nextLine();
		System.out.println();
		wordsInfo(word);
	}//main

}//class