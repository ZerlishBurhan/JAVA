class Main {
	public static void main(String[] args) {
		Instructor i1 = new Instructor("Shazma", "Noor","EE-01");//shows that Instructor can exist independently
		TextBook t1 = new TextBook("OOP2", "xyz", "ABC");//shows that TextBook can exist independently

		Course c1 = new Course("OOP", i1, t1);//shows aggregation where t1 and i1 are part of c1 aggregate, 
		System.out.print(c1);

	}
}