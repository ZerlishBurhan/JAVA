/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Implementing Interface class
            2) To be concrete class, this class needs to implement all abstract methods of super class
            
*/


public class Rectangle1 implements Relatable
{
         /********************** Fields ****************************************/
	private double length;
	private double width;

        /*********************** Constructors *********************************/
	//Overloaded cons
	Rectangle1(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
         /************************* Setters *************************************/
	public void setLength(double length)
	{
		this.length = length;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}
        /************************ Getters ***************************************/
	public double getLength(){return length;}
	public double getWidth(){return width;}
        public double area(){return length*width;}

        /************************ Abstract Methods Implementation ***************************************/
	public boolean isEqual(Object obj)
	{
		Rectangle1 r = (Rectangle1) obj;
		return this.area() == r.area();
	}

	public boolean isLess(Object obj)
	{
		Rectangle r = (Rectangle) obj;
		return this.area() < r.area();
	}

	public boolean isGreater(Object obj)
	{
		Rectangle r = (Rectangle) obj;
		return this.area() > r.area();
	}

	
	
	
}