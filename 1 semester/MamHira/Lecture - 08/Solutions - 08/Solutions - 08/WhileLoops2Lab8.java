import java.util.Scanner;

public class WhileLoops2Lab8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	
		int count = 0;
		double average = 0.0;
		//part a
		System.out.println("\n\na. The average of all odd numbers between a and b (inclusive).\n");
		int sumOdd = 0;
		System.out.print("Enter value for a: ");
		int a = input.nextInt();
		System.out.print("Enter value for b: ");
		int b = input.nextInt();		
		while (a <= b){
			if(a % 2 == 1){
				sumOdd += a;
				count++;
			}//if
			++a;
		}//while
		average = sumOdd/count;

		System.out.println("The sum of all odd numbers between a and b is: " + sumOdd);
		System.out.println("The average of all odd numbers between a and b is: " + average);



		//part b
		System.out.println("\n\nb. Print sequence of numbers.\n");
		int start = 3, end = 25;
		while(start <= end){
			System.out.print(start + "\t");
			start= start+4;
		}

	
	}//main
}//class