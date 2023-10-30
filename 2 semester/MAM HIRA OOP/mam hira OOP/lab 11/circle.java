class circle extends Shape {
	
	private double x;
	private double y;
	private double radius;

	public void setX(double x){
		this.x = x;
	}//set
	public double getX(){
		return x;
	}//get

	public void setY(double y){
		this.y = y;
	}//set
	public double getY(){
		return y;
	}//get

	public void setRadius(){
		this.radius = radius;
	}//set
	public double getRadius(){
		return radius;
	}//get

	public circle(){
		super();
	}

	public circle(double x, double y,double radius , String color){
		super(color);
		this.x = x;
		this.y = y;
		this.radius = radius;	
	}
	public double calculatePerimeter(){
		return Math.PI * 2 * this.radius;
	}

	public void Draw(){
		super.Draw();
		System.out.println("the value of x is : " + this.getX());
		System.out.println("the value of y is : " + this.getY());
		System.out.println("the radius is : " + this.getRadius());
	}
}