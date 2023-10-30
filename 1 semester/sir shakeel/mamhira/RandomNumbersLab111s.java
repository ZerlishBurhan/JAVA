import java.util.Random;
public class nestedloop
{
	public static void main(String [] args)
	{
/*
		for (int i = 1; i <= 10; ++i){
			for (int j = i; j <= i * 10; j += i){
				System.out.print(j + " ");
			}//inner for
			System.out.println();
		}//outer for
*/


 randomNumbers = new Random();

		Random randomNumbers = new Random();
		// Get a random integer and assign it to number.
		int number = randomNumbers.nextInt();
		System.out.println("A random integer: " + number);

		// Get a random integer between 0 and 99
		number = randomNumbers.nextInt(100);
		System.out.println("A random integer between 0 and 99: " + number);	
		
		// Get a random integer between 1 and 10
		number = randomNumbers.nextInt(10) + 1;
		System.out.println("A random integer between 1 and 10: " + number);	
		
		// Get a random integer between -50 and +49
		number = randomNumbers.nextInt(100) - 50;
		System.out.println("A random integer between -50 and +49: " + number);	
		
		// Get a random real number between 0.0 and 1.0
		double realNumber = randomNumbers.nextDouble();
		System.out.println("A random real number between 0.0 and 1.0: " + realNumber);	

	}//main
}//class
