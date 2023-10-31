import java.util.Scanner;
public class ArmstrongLab8 {

	public static void main(String[] args) {

        	// some armstrong numbers are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748


        	Scanner input = new Scanner(System.in);
        	int originalNumber, remainder, result = 0;
    
        	System.out.print("Enter a number: ");
        	int number = input.nextInt();


        	originalNumber = number;

       		// int temp, numberOfDigits=0;
        	//temp = number;  

		int numberOfDigits = 0;

         	//Find total digits in num 
	  	numberOfDigits = (int) Math.log10(number) + 1;

/*

	        while(temp>0) {   
            		temp = temp/10;   
            		numberOfDigits++;   
        	}//while   

*/

        	while (originalNumber != 0) {

            		remainder = originalNumber % 10;
            		result += Math.pow(remainder, numberOfDigits);
            		originalNumber /= 10;

        	}//while

        	if(result == number) {
            		System.out.println(number + " is an Armstrong number.");
		} else {
            		System.out.println(number + " is not an Armstrong number.");

		}//if
	}//main
}//class





































