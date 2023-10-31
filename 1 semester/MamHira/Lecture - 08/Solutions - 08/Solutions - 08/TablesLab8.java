import java.util.Scanner;

public class TablesLab8
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);	
		
		System.out.print("Enter a positive number: ");
		int number = input.nextInt();
		System.out.print("Enter a start value: ");
		int start = input.nextInt();
		System.out.print("Enter an end value: ");
		int end = input.nextInt();

		if(number >= 0 && start >= 0 && end >= 0){
			while (start <= end){
				System.out.println(number + " X " + start + " = " + (number * start));
				++start;
			}//while
		} else {
			System.out.println("Please enter only positive numbers.");
		}//if

	}//main
}//class