import java.util.Scanner;

public class SumIntegersLab8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int sum = 0, i = 1;

		if(number > 0){
			while(i <= number){
				if(i%2 == 0){
					sum += i;
				}//if
				++i;
			}//while
			System.out.println("The sum of all odd numbers from 1 to " + number + " is: " + sum);
		} else {
			System.out.println("Please only enter positive nonzero number.");	
		}//if

	}//main
}//class