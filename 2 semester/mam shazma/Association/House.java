class House {
	private final Room[] rooms;
	private int countOfRooms;

	public House(){
		rooms = new Room[7];
		countOfRooms = 0;
	}
	public House(int size){
		rooms = new Room[size];
		countOfRooms = 0;
	}
	public House(Room[] array){
		rooms = new Room[array.length];
		for (int i = 0; i < array.length; i++) {
			rooms[i] = array[i];
		}
		// rooms = array;
	}

	public void buildRoom(Room arg){
		// rooms[countOfRooms++] = arg;
		// countOfRooms++;
	}
	public String toString(){
		String str = "";
		for (Room temp : rooms) {
			str += temp+"\n";
		}
		return str;
	}
}