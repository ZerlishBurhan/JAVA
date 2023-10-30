 		// if(this.getName() > arg.getName()){
 		// 	return 1;
 		// }
 		// else if(this.getName() < arg.getName()){
 		// 	return -1;
 		// }
 		// else if(this.getName().equals(arg.getName())){
 		// 	return 0;
 		// }

class Main3{
	public static void main(String[] args) {
		student s1 = new student("zerlish" , 89);
		student s2 = new student("Momna" , 89);

		int s = s1.compareTo(s2);
		
		s1.display();
		System.out.println();
		s2.display();




	}
}