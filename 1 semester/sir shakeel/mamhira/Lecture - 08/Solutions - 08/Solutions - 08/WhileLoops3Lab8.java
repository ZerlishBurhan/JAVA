import java.util.Scanner;

public class WhileLoops3Lab8
{
	public static void main(String[] args)
	{

		final int LOOP_LIMIT = 15;
		Scanner input = new Scanner(System.in);	
		int i = 0;
		double sum = 0.0, avg = 0.0; 

		while(i < LOOP_LIMIT){
			System.out.print("Enter a number: ");
			double number = input.nextDouble();
			sum += number;
			++i;
			
		}//while

		avg = sum/LOOP_LIMIT;
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("The average of the numbers is: " + avg);

	}//main
}//class