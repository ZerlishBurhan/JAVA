class runShape{
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		Shape s2 = new Shape("red");

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3.56 , "blue" , 79.89);

		Sqaure sq1 = new Sqaure();
		Sqaure sq2 = new Sqaure(45.89 , "yelow");

		circle c1 = new circle();
		circle c2 = new circle(4 , 5 , 23.5 , "pink");

		System.out.println("--------Shape");
		s1.Draw();
		System.out.println();
		s2.Draw();
		System.out.println();
		System.out.println("--------Rectangle");
		r1.Draw();
		System.out.println();
		r2.Draw();
		System.out.println();
		System.out.println("-------Square");
		sq1.Draw();
		System.out.println();
		sq2.Draw();
		System.out.println();
		System.out.println("------Circle");
		c1.Draw();
		System.out.println();
		c2.Draw();


	}//main
}//class