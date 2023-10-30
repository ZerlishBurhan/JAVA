import java.util.Arrays;

class SelectionSort{
	public static void main(String[] args) {
		int[] arr = {4, 2, 3, 7, 7 , 9, 6, 2,1 , 8};
		selectionSort(arr);
		System.out.print(Arrays.toString(arr));

	}//main

	public static void selectionSort(int array[]){
		for (int i = 0, min, temp; i < array.length; i++) {
			min = i;
			for (int j = i+1; j < array.length; ++j) {
				if(array[min] < array[j])
					min = j;
			}//inner-for
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}//outer-for
	}//selectionSort

}//class