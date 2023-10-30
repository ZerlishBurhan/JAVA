public  class ArrayMethodsLab15B {

	public static int getSecondIndex(int[] array, int value){
		int size = array.length;
		int count = 0;

		for(int i = 0; i < size  ; i++){
				
			
		}//for


		


	}//getSecondIndex()


	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.print("How many size for the array?: ");
		int size = input.nextInt();

		
		int [] array = new int[size];

		for (int i = 0;i < size; ++i){
			System.out.print("Enter the element for index [" + i +"]: ");
			array[i]=input.nextInt();
		}//for

		System.out.print("Enter the value you want to find: ");
		int number = input.nextInt();
		

		//method call here
		











		if (){
			System.out.print("Not found.");
		} else {
			System.out.println("Index of 2nd occurrence of \"" + number + "\": "  + index);
		}//if
		
	}//main
}//class