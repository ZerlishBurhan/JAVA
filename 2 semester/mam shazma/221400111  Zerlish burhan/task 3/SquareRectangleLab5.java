import java.util.Scanner;


public class SquareRectangleLab5
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the value for length: ");
      int length = keyboard.nextInt();
  
      System.out.print("Enter the value for width: ");
      int width = keyboard.nextInt();
 
      if (length == width){

		System.out.println("Your Shape is a square");
		int perimeter = 2*(length + width);
        	int area      = length*width;
            System.out.print("The perimeter of this square is: " + perimeter);
            System.out.println("	and area is: " + area);
      }else{

		System.out.println("Your Shape is a rectangle");
		int perimeter = 2*(length + width);
            int area      = length*width;
            System.out.print("The perimeter of this rectangle is: " + perimeter);
            System.out.println("	and area is: " + area);

	}









   }








}