class runRetailItem{
	public static void main(String[] args) {
		
		RetailItem r1 = new RetailItem();
		RetailItem r2 = new RetailItem("vsdjh" , 798 , 89.00);
		RetailItem r3 = new RetailItem("7fhg" , 677 , 879.809);

		System.out.println("--r1--");
		r1.display();
		System.out.println();
		System.out.println(r1.toString());

		System.out.println("--r2--");
		r2.display();
		System.out.println();
		System.out.println(r2.toString());
 	
 		System.out.println("--r3--");
		r3.display();
		System.out.println();
		System.out.println(r3.toString());
		System.out.println();
		System.out.println(r2.isNotEqual(r3));

	}//main
}//class