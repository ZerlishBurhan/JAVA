import java.util.Scanner;

public class LoopExampleLab8{
	public static void main(String[] args) { Scanner read = new Scanner(System.in);
    		int num; 
    		int product;
    		int count = 0;

		System.out.print("Enter a value for product: "); 
    		product = read.nextInt();

    		while (count < 4) {
        		System.out.print("Enter a value for num: "); 
        		num = read.nextInt();
        		product = product * num; 
        		count++;
    		}//while

		System.out.print("Product = " + product);


	}//main

}//class
