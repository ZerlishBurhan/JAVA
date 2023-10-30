class practice2{
	public static void unique(int[] array){
		// boolean flag = true;

		for (int i = 0;i <  array.length ;++i ) {
			for (int j = 0;j < array.length;++j ) {
				if(array[i]!=array[j]){
					
				}//if
			}//for
			System.out.print(array[i] + ",");
		}//for
		}//unique
	public static void main(String[] args) {
		int array[] ={2, 4, 2, 15, 4, 5, 6, 9, 12, 2};
		unique(array);
	}//main
}//class