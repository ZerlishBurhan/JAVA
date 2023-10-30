class RunBook{
	public static void main(String[] args) {
		book b1 = new book(14 , 767, 87.77);
		book b2 = new book(2324, 546 , 90.89);
		book b3 = new book(15 , 547 , 5.76);
		book b4 = b1.create(b2);
System.out.println("----------BOOK1------------------");
		System.out.println();
		b1.display();
		System.out.println(b1.tooString());
		System.out.println();
		System.out.println( );
		System.out.println();
System.out.println("----------------BOOK2------------------");
		b2.display();
		System.out.println(b2.tooString());
		System.out.println( );
		System.out.println( );
		System.out.println(b1.equal(b2));
		System.out.println();
System.out.println("---------------BOOK3--------------------");
		System.out.println();
		b3.display();
		System.out.println(b2.tooString());
		System.out.println();
		b1.copy(b3);
		System.out.println( );
		b3.display();
		System.out.println(b3.tooString());
		System.out.println( );
		System.out.println(" IS book b3 equal to b1 : "+ b1.equal(b3));
		System.out.println();
System.out.println("------------NEW BOOK----------------");
		System.out.println();
		b4.display();
		System.out.println(b4.tooString());
		System.out.println( );
	}//MAIN
}//CLASS