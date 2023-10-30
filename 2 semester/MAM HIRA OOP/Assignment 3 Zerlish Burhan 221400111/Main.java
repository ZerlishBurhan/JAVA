class Main{
	public static void main(String[] args) {

	System.out.println("----------------Button Group Class--------------------");
	ButtonGroup g1 = new ButtonGroup(1, new Button(1, 2, "red ", false));
	g1.selectedMsg();
	System.out.println();

	System.out.println("----------------P Shape Button--------------------");
	PShapeButton p1 = new PShapeButton("circle" , 1, 2 , "red " , false);
	p1.display();
	System.out.println();

	System.out.println("----------------P Image Button--------------------");
	PImageButton i1 = new PImageButton(789 ,"flower", 1, 2 , "red " , false);
	i1.changeSelected();
	i1.display();

	System.out.println("==============( Second object )================");
	System.out.println();
	System.out.println("==============( Button Group Class )================");
	ButtonGroup g2 = new ButtonGroup(34, new Button(23544, 45243, "purple", true));
	g2.selectedMsg();
	System.out.println();

	System.out.println("================( P Shape Button )================");
	PShapeButton p2 = new PShapeButton("Circle",23544, 45243, "purple", true);
	p2.display();
	System.out.println();

	System.out.println("===================( P Image Button )================");
	PImageButton i2 = new PImageButton(3434 ,"candy",23544, 45243, "purple", true);
	i2.changeSelected();
	i2.display();


	}//main
}//class