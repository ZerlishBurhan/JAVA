import java.util.Arrays;

class SelectionSorta{
	public static void main(String[] args) {
		int[] arr = {4, 2, 3, 7, 7 , 9, 6, 2,1 , 8};
		selectionSort(arr);
		System.out.print(Arrays.toString(arr));

	}//main

	public static void selectionSort(int array[]){
		for (int i = 0, min, temp; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; ++j) {
				if(array[i] < array[j]){
					i = j;
					temp = array[i];
					array[j] = array[i];
					array[i] = temp;
				}//if
					
			}//inner-for
			
		}//outer-for
	}//selectionSort

}//class