import java.util.Scanner;
class practice{

	//public static  void length(String name){
	/*	int charA = name.length();
		System.out.println(charA); 
		
		int count=0 ; 

		for (int i = 0 ;i < name.length() ;++i) {
			int a = name.toLowerCase().charAt(i);
			if( a =='a'|| a =='e'|| a =='i'|| a=='o'|| a=='u'){
				count ++;
			}
		}//for
		System.out.println(count);
	}//method

	public static char charAtPosition(String name, int position){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the name : ");
		    name = keyboard.next();
System.out.println();
			System.out.println("Enter the position");
		    position = keyboard.nextInt();
System.out.println();
			return name.charAt(position - 1); 
	}//method
*/
		public static double getLength(){

		Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the length of the rectangle : ");
			double length = keyboard.nextDouble();
			return length;
		}//length

		public static double getWidth(){

		Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the width of the rectangle : ");
			double width = keyboard.nextDouble();
			return width;
		}//width

		public  static double getArea(double width, double length){
			Double area = (2*length + 2*width);
			return area;
		}//area

		public static void display(double length , double width , double area){

			System.out.print("The length of rectangle is  " + length);
			System.out.println();
			System.out.print("The width of rectangle is " + width);
			System.out.println();
			System.out.print("The area of rectangle is " + area);
		}//display

	public static void main(String[] args){
		
	/*	// String name = "zerlishburhan";
		// length(name);

			// String name = " null";
			// int position = 0 ;
*/			// System.out.println(charAtPosition(name,position));


			double length = getLength();
			double width = getWidth();
			double area = getArea(length , width);  


			display(length,width,area);


	}//main

}//class