public class Rectangle extends Shape
{
        /********************** Fields ****************************************/
	private double length;
	private double width;

        /*********************** Constructors *********************************/
	public Rectangle(){}

	public Rectangle(String color, double length, double width)
	{
		setLength(length);
		setWidth(width);
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
	
        @Override
	public String toString()
	{
		return super.toString() + ", length : " + this.length + ", width: " + this.width;
	}


        /************************ Abstract Methods Implementation ***************************************/
        public double area(){
        	return length*width;
        }

        // Uncomment Line 50 & 51 to see the result
        //  public void myMethod1(){
        // 	System.out.println("Abstract class can have Final method(s) as well");
        // }
}//class