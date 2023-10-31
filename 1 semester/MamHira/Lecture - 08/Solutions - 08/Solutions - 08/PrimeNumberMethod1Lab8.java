import java.util.Scanner;

public class PrimeNumberMethod1Lab8
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int sqrt = (int)Math.sqrt(number);
                System.out.print(sqrt);
		boolean isPrime = true;

		int i = 2;
		while (i <= sqrt){
			if (number % i == 0){
				isPrime = false;
			}//if
			++i;
		}//while

		if (isPrime){
			System.out.println("The number " + number + " is prime.");
		}
		else{
			System.out.println("The number " + number + " is not prime.");
		}//if

	}//main
}//class