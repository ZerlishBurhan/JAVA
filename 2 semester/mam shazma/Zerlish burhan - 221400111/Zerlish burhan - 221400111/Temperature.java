import java.util.Scanner;

class Temperature {

	public static void getData(double array[][]){

		Scanner keyboard = new Scanner(System.in);

			int month = 12;
			int j = 1 ; 

	for (int i = 0 ; i < month; ++i){

		System.out.print("Enter the highest temperatre of the " + j + " " + "month : " );
		array[i][0] = keyboard.nextDouble();

		System.out.print("Enter the lowest temperatre of the " + j + " month : " );
		array[i][1] = keyboard.nextDouble();

		System.out.println(" ");

		j++;

	}//for

}//input

		public static double averageHigh(double[][] array){

				int month = 12;
				double sum = 0;
			for (int i  = 0 ; i < month  ; ++i) {
				sum += array[i][0];
			}//for
			double average = sum/12;
			return average;
		}//avergehigh

		public static double averageLow(double[][] array){

				int month = 12;
				double sum = 0;
			for (int i  = 0 ; i < month  ; ++i) {
				sum += array[i][1];
			}//for
			double average = sum/12;
			return average;
		}//avergeLow

		public static int indexHighTemp(double[][] array){
			int month = 12;
			int index = 0;

			double highesttemprature = array[0][0];
			for (int i = 0 ; i < month ; ++i){
				if(array[i][0] > highesttemprature){
					 highesttemprature = array[i][0] ;
					 	index = i;
					}//if
			}//for



			System.out.println("The highest temprature is : " + highesttemprature);
			return index;
		}//lowest


	public static int  indexLowTemp(double[][] array){
			int month = 12;
			int index = 0;
			


			double lowesttemprature = array[0][1];

			for (int  i = 0 ; i < month ; ++i){
				if(array[i][1] < lowesttemprature){
					 lowesttemprature = array[i][1];
					 index = i;
					}//if
			}//for
			System.out.println("The lowest temprature is : " + lowesttemprature);
		return index;
		}//lowest
	
	public static void main(String[] args) throws Exception {
		
		Temperature obj = new Temperature();
		int month = 12;
		int temperature  = 2;

		double[][] temp = new double[month][temperature];

		getData(temp);
		
		System.out.println("The average of highest temprature : " + averageHigh(temp));
		System.out.println(" ");
		System.out.println("The average of lowest temprature : " + averageLow(temp));
		System.out.println(" ");
		System.out.println(indexHighTemp(temp));
		System.out.println(" ");
		System.out.println(indexLowTemp(temp));
		

		




	}//main 

}//class