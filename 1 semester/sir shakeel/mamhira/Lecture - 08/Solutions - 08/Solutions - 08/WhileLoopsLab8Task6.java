import java.util.Scanner;

public class WhileLoopsLab8Task6
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int startingNum = input.nextInt();
		System.out.print("Enter second number: ");
		int endingNumber = input.nextInt();

		if (startingNum < endingNumber){
			System.out.println("\nAll even numbers between " + startingNum + " and " + endingNumber);
			
			//We will copy the value of startingNum to i, because we need it for second while loop
			int i = startingNum;

			/*
			As we have to count only even numbers between startingNum and endingNumber
			So we will jump by 2 in every iteration instead of 1
			This will eliminate the need of if condition in every iteration
			But, first we have to make sure that the startingNum is odd, if it is not
			We will increment it by one to make it odd.
			*/
			if (i % 2 == 1){
					++i;
			}//if
			while (i <= endingNumber){
				System.out.println(i);
				i += 2;
			}//while

			int sumEven = 0;
			int sumOddSquare = 0;
			i = startingNum;
			System.out.println("\nAll numbers and their squares between " + startingNum + " and " + endingNumber);
			System.out.println("Number\t\tSquare");
			while (i <= endingNumber){
				int square = (int)Math.pow(i,2);
				System.out.println(i + "\t\t" + square);
				if (i % 2 == 0){
					sumEven += i;
				}
				else{
					sumOddSquare += square;
				}//if
				++i;
			}//while

			System.out.println("\nSum of all even numbers between " + startingNum + " and " + endingNumber + ": " + sumEven);
			System.out.println("Sum of the square of all odd numbers between " + startingNum + " and " + endingNumber + ": " + sumOddSquare);
		}
		else{
			System.out.println("The starting number should be less than ending number.");		
		}//if

	}
}