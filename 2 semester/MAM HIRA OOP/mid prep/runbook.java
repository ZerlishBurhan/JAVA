class runbook{
	public static void main(String[] args) {
		book b1 = new book();
		book b2 = new book("Wrinkle in time" , "zerlish" , "momna" , 134);
		book b3 = new book();
		book b4 = new book();
		b2.copy(b3);
		b3.display();
		System.out.println(b3.toString());
		System.out.println();
		b2.display();
		System.out.println(b2.toString());
		System.out.println();
		b4.setcoppiessold(1356);
		System.out.println("POPULAR");
		System.out.println(b4.isPopular(b3));
		System.out.println("COMPARE");
		System.out.print(b2.compare(b3));

	}//main
}//class