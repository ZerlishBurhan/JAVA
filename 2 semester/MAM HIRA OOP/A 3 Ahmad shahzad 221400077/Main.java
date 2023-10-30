class Main{
	public static void main(String[] args) {
		
	System.out.println("==============( Button Group Class )================");
	ButtonGroup g1 = new ButtonGroup(3, new Button(4, 3, "blue", true));
	g1.selectedMsg();
	System.out.println();

	System.out.println("================( P Shape Button )================");
	PShapeButton p1 = new PShapeButton("Square" , 4, 3 , "blue " , true);
	p1.display();
	System.out.println();

	System.out.println("===================( P Image Button )================");
	PImageButton i1 = new PImageButton(537 ,"Car", 1, 2 , "blue " , true);
	i1.changeSelected();
	i1.display();

	System.out.println("==============( Second object )================");
	System.out.println();
	System.out.println("==============( Button Group Class )================");
	ButtonGroup g2 = new ButtonGroup(5, new Button(23, 45, "pink", false));
	g2.selectedMsg();
	System.out.println();

	System.out.println("================( P Shape Button )================");
	PShapeButton p2 = new PShapeButton("Square", 23, 45, "pink", false);
	p2.display();
	System.out.println();

	System.out.println("===================( P Image Button )================");
	PImageButton i2 = new PImageButton(357 ,"Car",23, 45, "pink", false);
	i2.changeSelected();
	i2.display();

	}//main	
}//class