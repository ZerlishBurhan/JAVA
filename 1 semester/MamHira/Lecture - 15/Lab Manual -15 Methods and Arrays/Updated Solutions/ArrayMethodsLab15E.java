import java.util.Scanner;
public class ArrayMethodsLab15E {


	public static void copyReverseArrays(int[] source, int[] target){

		if (source.length == target.length){
			int size = source.length;
			
			for (int i = 0; i < size; ++i){
				
			}//for	

			///print the target array
			for (){
				
			}//for	
						
		}
		else{
			System.out.println("The size of source and target array are not compatible.");
		}//if
	}//copyReverseArrays()


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many size for the array?: ");
		int size = input.nextInt();

		int [] source = new int[size];
		int [] target = new int[size];

		for (int i = 0;i < size;++i){
			System.out.print("Enter the element for index [" + i +"]: ");
			source[i]=input.nextInt();
		}//for

		copyReverseArrays(source, target);
		
	}///main
}//class