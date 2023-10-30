import java.util.Scanner;

public class BinaryDigitsLab11
{
	public static void main(String [] args)
	{

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		String binary = "b";
		
		while (number > 0){
			int remainder = number % 2;
			binary =   remainder + binary;
			System.out.println(binary);
			number /= 2;
		}//while

		/*
		if the input is 0, then the loops will never runs
		and we'll not see any output on the console as String binary in empty
		So we'll assign 0 to it if the binary String is empty
		Then we see 0 as the output if we input 0, because binary representation of 0 is also 0.
		*/

		if(binary.equals("")){
			binary = "0";
		}//if
		System.out.println(binary);

	}//main
}//class