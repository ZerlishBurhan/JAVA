/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Implemented Shape class. This will become super class for Rectangle class.
            2) Super class is also known as parent class, base class or generalized class.
            
*/


public class Shape
{
        /********************** Fields ****************************************/
	private String color;

        /*********************** Constructors *********************************/
	//public Shape()
	//{
	//	System.out.println("0-Arg Shape Constructor!");
	//}//default cons

	public Shape(String color)
	{
		System.out.println("1-Arg Shape Constructor!");		
		setColor(color);
	}//overloaded construcor

        /************************* Setters *************************************/
	public void setColor(String color)
	{
		this.color = color;
	}//setColor

        /************************ Getters ***************************************/
	public String getColor()
	{
		return this.color;
	}//getColor


        /************************ Other Methods ***************************************/
        
	public double area()
	{
		return 0.0;
	}//area  --- will be overided
        
	public double perimeter()
	{
		return 0.0;
	}//perimeter --- will be overided
        
        /************************ Overriding ***************************************/
        @Override
	public String toString()
	{
		return "Color: " + getColor();
	}//toString
}//class
