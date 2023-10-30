import java.util.Scanner;

public class array2{

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

String[] name = new String[10];

name[0]="my-";
name[1]="name-";
name[2]="is-";
name[3]="zerlish-";
name[4]="burhan-";
name[5]="mughal";
name[6]=".........";

for(int i = 0 ; i < name.length ; ++i){
System.out.print(name[i]);
}//for

System.out.println("");

System.out.print("how many word your line should contain ? =  ");

int str = keyboard.nextInt();

String[] nam = new String[str];

	for(int i = 0 ; i <= nam.length-1 ; ++i ){

	System.out.print("Enter a good line = ");

	nam[i] = keyboard.nextLine();
	
	}//for


	for(int i = 0 ; i < nam.length ; ++i ){

	System.out.print(nam[i] + "");

	}//for

}//main
}//class