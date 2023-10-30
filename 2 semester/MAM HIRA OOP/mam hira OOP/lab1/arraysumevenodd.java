import java.util.Scanner;

public class arraysumevenodd{
Scanner keyboard = new Scanner(System.in);

    static void sumevenodd(int[] array){
        int sum =0 , odd =0 ;

        for(int i=0 ; i < array.length; ++i){
            if(array[i]%2==0){
                sum+=array[i];
                }else
                { odd+=array[i]; }
             }
                System.out.println("the sum of even is " + sum);
                 System.out.println("the sum of odd is " + odd);
                 }

public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    System.out.print("enter the size of array");
    int size =  keyboard.nextInt();

    int[] array = new int [size] ;

    for(int i=0 ; i< array.length ; ++i){
    array[i] = keyboard.nextInt();
    }

    sumevenodd(array);
    }
    }   