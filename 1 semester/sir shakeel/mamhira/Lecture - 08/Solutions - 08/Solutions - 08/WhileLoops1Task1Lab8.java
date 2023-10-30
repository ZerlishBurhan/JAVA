import java.util.Scanner;

public class WhileLoops1Task1Lab8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		

		//part a
		System.out.println("a. All numbers between the range of 1 to 100 with increment of 1.\n");
		int i = 1;
		while(i <= 100){
			System.out.println("i " + i);
			i++;
		}//while



		//part b
		System.out.print("\n\nEnter number: ");
		int n = input.nextInt();

		System.out.println("\nb. All powers of 3 less than n.\n");
		i = 0;
		while (Math.pow(3,i) < n ){
			System.out.print((int)Math.pow(3,i) + " ");
			++i;
		}//while


		//part b
		System.out.println("\n\nc. All positive numbers that are divisible by 7 and less than n.\n");
		i = 1;
		while (i < n){
			if(i%7==0){
				System.out.print(i + " ");
			}//if
			++i;
		}//while


	}//main
}//class