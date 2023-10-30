public class PShapeButton extends Button{

	private String pShape;

	public PShapeButton(){

	}//constructr	

	public PShapeButton(String pShape , int x ,int y , String color , boolean selected ){
		super(x , y , color , selected);
		this.pShape = pShape;
	}	

	public PShapeButton(String pShape){
		this.pShape = pShape;
	}	

	public void display(){
		super.display();
		System.out.println( "\nShape : " + pShape);
	}
}