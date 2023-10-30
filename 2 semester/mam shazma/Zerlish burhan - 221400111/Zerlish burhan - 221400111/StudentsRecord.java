import java.util.Scanner;
class StudentsRecord{

	public static int[][] readData(String[] name , int[][] numbers){
		Scanner keyboard = new Scanner(System.in);

		int k = 0;
		for (int i = 0; i < numbers.length ; ++i){
			System.out.print("Enter the name of student: ");
			name[i] = keyboard.next();
			for (int j = 0; j < numbers[i].length ; ++j) {				
				System.out.println("Enter the marks of " );
				numbers[i][j]=keyboard.nextInt();
				++k;
			}//for
			
		}//for
		return numbers;
	}//method

	public static void averagetestscore(int[][] numbers , char[] grades){
		
		double percentage = 0 , average = 0 , percentage1 = 0  ;
		int sum = 0 ,i , classaverage = 0 , classsum = 0 ;
		char classgrades = ' ';

		for ( i = 0  ; i < numbers.length; ++i) {
			for (int j = 0 ; j < numbers[i].length ; ++j ) {
				sum += numbers[i][j];


			}//for2	

				average = sum / 5 ;
				percentage = (sum/500)*100;

		if(percentage <= 100 && percentage >= 80 ){
			grades[i] = 'A';
		}
		else if (percentage <= 80 && percentage >= 70){
			grades[i] = 'B';
		} 
		else if (percentage <= 70 && percentage >= 60){
			grades[i]='C';
		} 
		else if (percentage <= 60 && percentage >= 40){
			grades[i] = 'D';
		}
		else {
			grades[i] = 'F';			
		}  
			classsum += sum;

			sum = 0;

			output(average , grades[i]);

			}//for

		classaverage += classsum/(i+1);

		percentage1 = (classaverage/500)*100;

			if(percentage1 <= 100 && percentage1 >= 80 ){
			classgrades = 'A';
		}
		else if (percentage1 <= 80 && percentage1 >= 70){
			classgrades = 'B';
		} 
		else if (percentage1 <= 70 && percentage1 >= 60){
			classgrades ='C';
		} 
		else if (percentage1 <= 60 && percentage1 >= 40){
			classgrades = 'D';
		}
		else{
			classgrades = 'F';		
		}  

		output2(classaverage, classgrades);
		
			
			 
	}//testscore

		public static void output(double average , char grades){

			System.out.println("the sum of Averagescores of student is" + average);
			System.out.println("the AverageGrades of students is: " + grades);
				System.out.println(" ");

		}//output1

		public static void output2(double average , char grades){

		System.out.println("the average of wholeclass is :" + average);	
		System.out.println("The grade of whole class is : " + grades);
		System.out.println(" ");
			
		}//output2

		

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the number of students: ");

		int ns = keyboard.nextInt();

		String[] name = new String[ns];

		int[][] numbers = new int[ns][5];

		char[] grades = new char[ns];

		readData(name,numbers);

		//output(grades);

		averagetestscore(numbers,grades);
	}//main
 
}//class