class Sqaure extends Shape{
	private double length;

	public Sqaure(){
		super();
	}

	public Sqaure(double length, String color){
		super(color);
		this.length = length;
		
	}

	public void set(double length){
	this.length = length;
	}
	public double getLength(){
		return length;
	}

	public double calculateArea(){
		return Math.pow(this.length , 2);
	}//area

	public double calculatePerimeter(){
		return (4 * this.getLength());
	}

	public void Draw(){
		super.Draw();
		System.out.println("the length of the shape is : " + this.getLength());
	}



}