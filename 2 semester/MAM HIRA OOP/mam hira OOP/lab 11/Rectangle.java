class Rectangle extends Sqaure{
	
	private double width;

	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return width;
	}
	public Rectangle(){
		super();
	}
	public Rectangle(double length, String color, double width){
		super(length,color);
		this.width = width;
	}

		

		public double calculatePerimeter(){
			return super.getLength() * this.getWidth();
		}

		public double calculateArea(){
			return 2 * (super.getLength() + this.getWidth());
		}	

		public void Draw(){
		super.Draw();
		System.out.println("the value of width is : " + this.getWidth());
		}



}

