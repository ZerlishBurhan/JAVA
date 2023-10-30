public abstract class Shape{
	private String color;

	public Shape(){

	}//0-arg

	public Shape(String color)
	{		
		setColor(color);
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

        public abstract  void draw();
        public abstract  double calculateArea();
        public abstract double calculatePerimeter();

}//class