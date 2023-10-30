import java.util.Scanner;

public class arrayprime{
Scanner keyboard = new Scanner(System.in);

    static void prime(int[] array){
   int count = 0;
   
          for (int i = 1; i < array.length; i++) {
  int divide = array[i]/2;
    for (int j = 2; j <= divide ; j++) {
    if (i % j == 0) {
    System.out.print(array[j] + ",");
   }
   
    }
   }
   
  }
 

                
                 

public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    System.out.print("enter the size of array");
    int size =  keyboard.nextInt();

    int[] array = new int [size] ;

    for(int i=0 ; i< array.length ; ++i){
    array[i] = keyboard.nextInt();
    }

    prime(array);
    
    }  

    }