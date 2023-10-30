public class Square extends Shape{
	private double length;

	public void setLength(double l){
		length = l;
	}//setLength
	public double getLength(){
		return length;
	}//getLength
	public Square(){
		super();
	}//default-contructor
	public Square(String c, double l){
		super(c);
		this.setLength(l);
	}//overloaded constructor

	public void draw(){
		System.out.println("\ncolor : "+super.getColor()+"\nLength: "+getLength()+"\nArea: "+calculateArea()+"\nPerimeter: "+calculatePerimeter());
	}//Draw

	public double calculateArea(){
		double area = Math.pow(getLength(),2);
		return area;
	}//calculateArea
	public double calculatePerimeter(){
		double perimeter = 4*getLength();
		return perimeter;
	}//calculatePerimeter
}