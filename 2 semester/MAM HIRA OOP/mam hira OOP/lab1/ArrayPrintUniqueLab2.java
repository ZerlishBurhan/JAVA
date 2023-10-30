public class ArrayPrintUniqueLab2{

	static int printUnique (int[] array , int x){
		
		for (int i = 0; i < array.length ; ++i) {
			boolean isUnique = true;
			for (int j = 0; j < array.length ; ++j) {
				if (i != j){
					if (array[i] == array[j]){
						isUnique = false;
					}//if
				}//if
			}//inner-for
			if (isUnique){
				System.out.print(array[i] + " ");
			}//if
			x+=1;
return x;
		}//outer-for

	}//printUnique()

	public static void main (String [] args){
		int x = 1 ; 
		int[] array = {2, 4, 2, 15, 4, 5, 6, 9, 12, 2};
		printUnique(array,x);
		System.out.print(x);


	}//main
}//class