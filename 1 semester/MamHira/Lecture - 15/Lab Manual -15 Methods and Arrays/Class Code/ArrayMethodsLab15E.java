public class ArrayMethodsLab15E {


	public static void copyReverseArrays(int[] source, int[] target){

		if (source.length == target.length){
			int size = source.length;
			
			for (int i = 0; i < size; ++i){
				target[size - 1 - i] = source[i];
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

		int [] array = new int[size];

		for (int i = 0;i < size;++i){
			System.out.print("Enter the element for index [" + i +"]: ");
			array[i]=input.nextInt();
		}//for

		countEvenOddIntegers(array);

		
	}///main
}//class