class runbook{
	
	public static void main(String[] args)throws Exception {
	
	book book1 = new book();
	book book2 = new book(123, 450 , 255.9);

	System.out.println(book1.isExpensive(book2));
	System.out.println(" ");
	System.out.println(book1.isLarger(book2));

		book1.display();
		System.out.println(" ");
		book2.display();
		book1.copy(book2);
		System.out.println(" ");
		book2.display();
		System.out.println(" ");
		System.out.println(book1.tooString());
	}//main
}//class