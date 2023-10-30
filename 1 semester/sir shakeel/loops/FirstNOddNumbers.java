import java.util.Scanner;
public class FirstNOddNumbers {

  public static void main(String[] args) {

    // Declare variable to take a positive number
    int num;

    // x is a loop controlled variable
    int x = 1;  // as positive odd numbers start from 1

    // Declare an Object of Scanner Class
    Scanner read = new Scanner(System.in);

    // Take a positive number from user 
    System.out.print("Enter a positive integer: ");

    // Reading next int value and assigning to num
    num = read.nextInt();

    // Counter-Controlled while loop; loop will continue to execute until condition does not get false. 
    while(x <= num) { // initially x = 1 as above initialized and then on each iteration it will be updated by 2 inside loop body
       
      System.out.print(x + ", ");
    
      // Increment by two, as each number is 2 number away, e.g. after 3 there is 5 
      x += 2;              

    }//while

  }//main
}//class