/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Square class (i.e. sub class) has extended Shape class (i.e. super class). This will form the parent child relationship. This is known as Inheritance. 
            2) Sub class is also known as child class, derived class or specialized class.
            3) Overriding a method (e.g. area) of Super class. 


            4) Calling Super class constructor
            5) Calling Super class methods
            
*/

public class Square extends Shape
{
        /********************** Fields ****************************************/
	private double length;

        /*********************** Constructors *********************************/
	public Square(){
		System.out.println("0-Arg Square Constructor!");

	}//default cons

	public Square(String color, double length){
		super(color); //Parent constructor
		System.out.println("2-Arg Square Constructor!");
		this.length = length;
	}//overloaded cons

        /************************* Setters *************************************/
	public void setLength(double length)
	{
		this.length = length;
	}//setLength

        /************************ Getters ***************************************/
	public double getLength(){
		return length;
	}//getLength

        /************************ Overriding ***************************************/
	@Override
	public double area()
	{
		return getLength()*2;
	}

	
	@Override
	public double perimeter()
	{
		return 4 * getLength();
	}

	@Override
	public String toString()
	{
		return super.toString() + ", Length: " + getLength();
	}

}//class
