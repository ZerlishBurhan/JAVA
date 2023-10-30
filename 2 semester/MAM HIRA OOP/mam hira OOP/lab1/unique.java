import java.util.Scanner;

public class unique{ 
Scanner keyboard = new Scanner(System.in);

    static void uniquenumber(int[] array){
      int  count = 0 ; 
       for(int i = 0 ; i <array.length ; ++i){
       for(int j = 0 ;  j < array.length  ; ++j){
        if(array[i]==array[j]){
            count ++;
             }
       }
       if(count == 1 ){
            System.out.print(array[i] + " , ");
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

    uniquenumber(array);

    }

    }   