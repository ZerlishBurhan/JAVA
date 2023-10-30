/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Circle class (i.e. sub class) has extended Shape class (i.e. super class). This will form the parent child relationship. This is known as Inheritance. 
            2) Sub class is also known as child class, derived class or specialized class.
            3) Overriding a method (e.g. area) of Super class. 


            4) Calling Super class constructor
            5) Calling Super class methods
            
*/


public class Circle extends Shape
{	
        /********************** Fields ****************************************/
	private double radius;

        /*********************** Constructors *********************************/
	public Circle(){
		super();
		System.out.println("0-Arg Circle Constructor!");
	}

	public Circle(String color, double radius)
	{
		super(color); //Calling Super class construcor
		System.out.println("2-Arg Circle Constructor!");
		this.radius = radius;
	}//overloaded constructor


        /************************* Setters *************************************/
	public void setRadius(double radius)
	{
		this.radius = radius;
	}//setRadius

        /************************ Getters ***************************************/
	public double getRadius()
	{
		return this.radius;
	}//getRadius


        
	public double diameter()
	{
		return getRadius()*2;
	}//diameter



        /************************ Overriding ***************************************/
	@Override
	public double area()
	{
		return Math.PI * Math.pow(getRadius(),2);	
	}//area

	@Override
	public double perimeter()
	{
		return 2 * Math.PI * getRadius();
	}//perimeter

	@Override
	public String toString()
	{
		return super.toString() + ", Radius: " +  getRadius();
	}//toString 
}//class
