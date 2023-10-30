import java.util.Scanner;

public class ArrayMethodsLab15D {


	public static int getSLIndex(int[] array, char typeOfValue){

		if (typeOfValue == 'S'){
			
			int sIndex = 0;
			int size = array.length;
			
			for (int i = 0; i < size; ++i){
				if (array[i] < array[sIndex]){
					sIndex = i;	
			}//if		
			
		}//for
		
		return sIndex;
	} else if (typeOfValue == 'L'){
		int lIndex = 0;
		int size = array.length;
		
		for (int i = 0; i < size; ++i){
			if (array[i] > array[lIndex]){
				lIndex = i;	
			}//if		
			
		}//for
		
		return lIndex;

	} else{

		return -1;
		
	}//if

	}//getSLIndex()







	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many size for the array?: ");
		int size = input.nextInt();

		int [] array = new int[size];

		for (int i = 0;i < size;++i){
			System.out.print("Enter the element for index [" + i +"]: ");
			array[i]=input.nextInt();
		}//for

		System.out.print("Enter the \"S\" to find index of smallest value or \"L\" to find index of largest value: ");
		char type = input.next().toUpperCase().charAt(0);

		int index = getSLIndex(array, type);

		if (index == -1){
			System.out.println("Invalid type has been entered.");
		}
		else{
			System.out.println("The index is: " + index);
		}//if

		
	}//main
}//class