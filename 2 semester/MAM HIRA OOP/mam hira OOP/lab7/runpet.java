class runpet{
	
	public static void main(String[] args)throws Exception {
	
	pet pet1 = new pet();
	pet pet2 = new pet("tom " , "cat" , 5 );

			pet1.display();
		System.out.println(" ");
		pet2.display();
		pet2.copy(pet1);
		System.out.println(" ");
		pet2.display();
		System.out.println(" ");
		System.out.println(pet2.tooString());
	}//main
}//class