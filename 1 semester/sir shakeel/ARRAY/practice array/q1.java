import java.util.Scanner;
	class q1{
		static int alternatingSum(int[] array){
			int s1 = 0;
			int s2 = 0;
			for(int i =0; i<= array.length- 1; ){
				sum1 += array[i] ;
				i+=2;
			}
			for(int count =1; count<= array.length- 1; ){
				sum2 += array[count] ;
				count+=2;
			}
			int sum3 = sum1 - sum2;
			return sum3;
		}//method
		public static void main(String[] args){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter array size:  ");
			int size = keyboard.nextInt();
			int[] array = new int[size];
			for(int i =0; i<= array.length- 1; i++){
				System.out.println("enter integer in array:  ");
				array[i] = keyboard.nextInt();
			}
			for(int i = 0; i < array.length;++i){
				System.out.println(array[i]+",  ");
			}
			int a = alternatingSum(array);
			System.out.println(a);
		}

	}