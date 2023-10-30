public class Rectangle extends Square{
	private double width;

	public void setWidth(double x){
		width = x;
	}//setWidth
	public double getWidth(){
		return width;
	}//getWidth

	public Rectangle(){
		super();
	}//default-contructor
	public Rectangle(String c,double w, double l){
		super(c,l);
		this.setWidth(w);
	}//overloaded constructor

	public double calculateArea(){
		double area = getWidth()*super.getLength();
		return area;
	}//calculateArea
	public double calculatePerimeter(){
		double perimeter = 2*(getWidth()+super.getLength());
		return perimeter;
	}//calculatePerimeter

	public void Draw(){
		super.Draw();
		System.out.println("Width: "+getWidth());
	}//Draw

}//Ractangle