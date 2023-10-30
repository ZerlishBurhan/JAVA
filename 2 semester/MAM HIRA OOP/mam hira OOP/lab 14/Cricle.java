 class Circle extends Shape{
	private double x;
	private double y;
	private double radius;

	public void setX(double x){
		this.x = x;
	}//setX
	public double getX(){
		return this.x;
	}//getX
	public void setY(double y){
		this.y = y;
	}//setY
	public double getY(){
		return this.y;
	}//getY
	public void setR(double r){
		radius = r;
	}//setR
	public double getR(){
		return radius;
	}//getR
	public Circle(){
		super();
	}//default-contructor
	public Circle(double x, double y, double r){;
		this.setX(x);
		this.setY(y);
		this.setR(r);
	}//overloaded constructor

	public void draw(){
			System.out.println("\ncolor : "+super.getColor()+"\nX: "+getX()+"\nY: "+getY()+"\nRadius: "+getR());
	
	}//Draw

	public double calculateArea(){
		double area = Math.PI*Math.pow(getR(),2);
		return area;
	}//calculateArea
	public double calculatePerimeter(){
		double perimeter = 2*Math.PI*this.getR();
		return perimeter;
	}//calculatePerimeter
}//circle