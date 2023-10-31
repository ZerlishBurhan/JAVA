import java.util.Scanner;

public class WhileLoops1Task2Lab8 {
	public static void main (String[] args) {
		final int LOOP = 15;

		Scanner input = new Scanner(System.in);
		
		double sumAverage = 0.0, sumEven = 0.0;
		int productOdd = 1;
		int number, countEven = 0, oddCount = 0;

		int i = 0;
		while (i < LOOP){
			System.out.print("Enter number " + (i + 1) + ": ");
			number = input.nextInt();

			if (number % 2 == 0){
				sumEven += number;
				countEven++;
					
			} else {
				oddCount++;
				productOdd *= number;
			}//if

			++i;
		}//while

		sumAverage = sumEven/countEven;

		System.out.println("Sum of even numbers: " + sumEven);
		System.out.println("Average of even numbers: " + sumAverage);
		System.out.println("Count of even numbers: " + countEven + "\nCount of odd numbers: " + oddCount);		
		System.out.println("Product of odd numbers: " + productOdd);

	}//main
}//class