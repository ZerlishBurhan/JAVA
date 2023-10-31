import java.util.Scanner;

public class TotalPayLab8
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of days worked: ");
		int days  = input.nextInt();
		int i = 1 ;
		double sum = 0.0;

		if(days >= 1){
			System.out.println("Days\t\t\tAmount earned");
			while(i <= days){
				double amount = Math.pow(2,i-1) / 100;
				System.out.println(i + "\t\t\t$" + amount);
				sum += amount;
				++i;
			}//while
			System.out.println("Total salary earned is: $" + sum);
		}
		else{
			System.out.println("Please enter a number greater than 0.");	
		}//if
		

	}//main
}//class