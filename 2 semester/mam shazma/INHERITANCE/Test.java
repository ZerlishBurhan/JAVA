/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Creating Objects of Classes 
            2) Child Class objects may call the super class methods
            3) Child class may override the super class method(s)
*/


public class Test
{
	public static void main(String[] args)
	{
		Shape s1 = new Shape("Colorless");

                // Creating Circle Object
		Circle c1 = new Circle("RED", 5);

                // Creating Rectangle Object
		Rectangle r1 = new Rectangle("BLUE" , 2 , 5);

                //Creating Square Object
		Square sq = new Square("WHITE", 3);
		
		//Rectangle r = new Shape(); //ILLEGAL

		 // Calling shape Methods
		System.out.println("Shape Object\n" + s1);	//toString
		System.out.println("Area : " + s1.area());	//area
		System.out.println("Perimeter(Circumference) : " + s1.perimeter()); //perimeter


                // Calling Circle Methods
		System.out.println("=================================");
		System.out.println("Circle Object\n" + c1);	//toString
		System.out.println("Area : " + c1.area());	//area
		System.out.println("Perimeter(Circumference) : " + c1.perimeter()); //perimeter

                // Calling Square Methods
		System.out.println("=================================");
		System.out.println("Square Object\n" + sq);	//toString
		System.out.println("Area : " + sq.area());	//area
		System.out.println("Perimeter : " + sq.perimeter()); //perimeter


                // Calling Rectangle Methods
		System.out.println("=================================");
		System.out.println("Rectangle Object\n" + r1);	//toString
		System.out.println("Area : " + r1.area());	//area
		System.out.println("Perimeter : " + r1.perimeter()); //perimeter
	}
}//class
