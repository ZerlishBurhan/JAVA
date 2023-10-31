public class ArrayMethodsLab15C {


	public static int getNthIndex(int[] array, int occurrence, int value){
		int size = array.length;
		int count = 0;

		for(int i = 0;i < size;++i){
		}//for


	}//getNthIndex()








	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.print("How many size for the array?: ");
		int size = input.nextInt();

		int [] array = new int[size];

		for (int i = 0;i < size;++i){
			System.out.print("Enter the element for index [" + i +"]");
			array[i]=input.nextInt();
		}//for

		System.out.print("Enter the value you want to find: ");
		int number = input.nextInt();

		System.out.print("Which occurrence of " + number + " you want to find: ");
		int occurrence = input.nextInt();

		while (occurrence <= 0){
			System.out.print("Error! Please enter a positive non-zero number for occurrence...: ");
			occurrence = input.nextInt();
		}//while

		int index = getNthIndex(array, occurrence, number);

		if (index == -1){
			System.out.print("Not found.");
		} else {
			System.out.print("Index of " + occurrence);
			
			if (occurrence == 1){
				System.out.print("st ");
			}
			else if (occurrence == 2){
				System.out.print("nd ");
			}
			else if (occurrence == 3){
				System.out.print("rd ");
			}
			else if (occurrence >= 4){
				System.out.print("th ");
			}
			System.out.println("occurrence of \"" + number + "\": "  + index);
		}//if
		



		
	}//main
}//class