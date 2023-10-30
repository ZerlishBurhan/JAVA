class Button{
	private int x;
	private int y;
	private String color;
	private boolean selected;

	public Button(){

	}//constructor


	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}

	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}

	public void setColor(String color){
		this.color = color;
	}
	public String get(){
		return color;
	}

	public void setSelected(boolean selected){
		this.selected = selected;
	}
	public boolean getSelected(){
		return selected;
	}

	public Button( int x ,int y , String color , boolean selected){
		this.x = x; 
		this.y = y;
		this.color = color;
		this.selected = selected;
	}//constructor

	public void display(){
		System.out.println("X : " + x + "\nY : " + y + "\nColor : " + color + "\nSeleted : " + selected);
	}
}//class