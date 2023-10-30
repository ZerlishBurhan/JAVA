public abstract class Shape
{

        /********************** Fields ****************************************/
	private String color;


        /*********************** Constructors *********************************/
	public Shape(){	// default
	}

	public Shape(String color)
	{
		setColor(color);
	}

        /************************* Setter(s) *************************************/
	public void setColor(String color)
	{
		this.color = color;
	}

        /************************ Getter(s) ***************************************/
	public String getColor(){return color;}
	
        @Override
	public String toString()
	{
		return "Color: " + this.color;
	}

        /************************ Abstract Methods ***************************************/
        public abstract double area();

	//write perimeter method as abstract on your own

        public final void myMethod1(){
        	System.out.println("Abstract class can have Final method(s) as well");
        }
        public static void myMethod2(){
        	System.out.println("Abstract class can have Static method(s) as well");
        }
}//class