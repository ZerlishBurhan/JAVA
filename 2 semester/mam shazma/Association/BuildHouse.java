class BuildHouse {
	public static void main(String[] args) {
		House h1 = new House(new Room[]{new Room("Bed Room"), new Room("Living Room")});
		// House h2 = new House(10);
		// h1.buildRoom(new Room("Drawing"));
		System.out.println(h1);
	}
}