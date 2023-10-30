import java.util.Random;

public class RandomNumbersLab11
{
	public static void main(String [] args)
	{

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