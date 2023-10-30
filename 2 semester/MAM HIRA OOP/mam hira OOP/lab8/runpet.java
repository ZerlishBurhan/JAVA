class RunPet{
	public static void main(String[] args) {
		Pet p1 = new Pet();
		p1.display();
		Pet p2 = new Pet("lily", "cat", 13);
		p2.display();
		p2.copy(p1);
		p1.display();
		System.out.println(p1.toString());
		System.out.println(p1.equal(p2));
	}//main
}//class