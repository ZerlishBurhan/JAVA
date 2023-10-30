class runBookD{
	public static void main(String[] args) {
		bookD english = new bookD();
		bookD math = new bookD("momna" , "forty rules of love " , "zerlish" , 1000);
		bookD urdu = new bookD("zerlish" , "A Wrinkle in time " , "momna" , 500);
		bookD science = new bookD("ahmad" , "harryporter" , "zerlish" , 700);
		bookD isl = math.create(science);

		System.out.println("----------english----------------");
		System.out.println();
		english.display();
		System.out.println(english.tooString());


		System.out.println("-----------MATH--------------");
		System.out.println( );
		math.display();
		System.out.println(math.tooString());


		System.out.println("-----------URDU-------------");
		System.out.println();
		urdu.display();
		System.out.println(urdu.tooString());
		System.out.println();


		System.out.println("----------SCIENCE--------------");
		science.display();
		System.out.println(science.tooString());
		System.out.println();


		System.out.println("-------after copinging------------");
		math.copy(science);
		System.out.println();
		System.out.println("now the new value of science are : ");
		science.display();
		System.out.println(science.tooString());
		System.out.println( );

			System.out.println("----------NEW BOOK --------------");
			isl.display();
			System.out.println();
			System.out.println(isl.tooString());

 
	}//main
}//class