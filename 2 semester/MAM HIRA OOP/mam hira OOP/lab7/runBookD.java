class runBookD  {
	public static void main(String[] args) {
	
	BookD book1 = new BookD();
	BookD book2 = new BookD( " Zerish " , " harry porter " , "momna " , 1000);

	book1.display();
	System.out.println(" ");
	book2.display();
	System.out.println(" ");
	book2.copy(book1);
	System.out.println(" ");
	book2.display();
	System.out.println(" ");
	System.out.println(book1.tooString());
	System.out.println(" ");
	System.out.println(book2.tooString());
	System.out.println(" ");
	book1.compare(book2);
	System.out.println(" ");
	System.out.println(book1.popular(book2));
	}//main

}//class