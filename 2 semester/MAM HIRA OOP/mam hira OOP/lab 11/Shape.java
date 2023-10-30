class Shape{
	private String color;

	public Shape(){

	}//0-arg
	public Shape(String color){
		this.color = color;
	}//overloaded

	public void set(String color){
		this.color = color;
	}
	public String getcolor(){
		return color;
	}

	public void Draw(){
		System.out.println("the color of the shape is : " + this.getcolor());
	}
	public double calculateArea(){
		return 0.0;
	}//area

	public double calculatePerimeter(){
		return 0.0;
	}//perimetere
}//class