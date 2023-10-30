
import java.util.Scanner;
public class array{

public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);
int[] list = new int[10];
int size = 10;

int[] array = new int[size];

array[1]=20;

array[2]=30;

array[3]=35;

array[9]=30;

array[2]=40;

for(int i = 0;i < array.length;++i){

System.out.print(array[i] + ",");

}//for

//============================================================================================
System.out.println();
System.out.println("what length of array do u want ? : ");

int len = keyboard.nextInt();

int[] array2 = new int[len]; 

for(int i = 0; i < array2.length ; ++i ){
System.out.print("Enter numbers in array = ");
array2[i] = keyboard.nextInt();

}//for

for(int i = 0; i < array2.length ; ++i ){
System.out.print("," + array2[i]);
}//for





}//main
}//class