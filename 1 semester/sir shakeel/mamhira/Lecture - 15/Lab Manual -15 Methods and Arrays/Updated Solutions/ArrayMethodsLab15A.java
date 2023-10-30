public class ArrayMethodsLab15A {

		public static void largerThanNumber(int[] array, int number){
		int size = array.length;

		for(int i = 0;i < size;++i){
			if (array[i] > number){
				System.out.println(array[i]);
			}//if
		}//for

	}//largerThanNumber()

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many size for the array?: ");
		int size = input.nextInt();

		int [] array = new int[size];

		for (int i = 0;i < size;++i){
			System.out.print("Enter the element for index [" + i +"]: ");
			array[i]=input.nextInt();
		}//for

		System.out.print("Enter the number you want to compare with: ");
		int number = input.nextInt();

		largerThanNumber(array, number);

		
	}//main


}//class