public class RunCourse{
	public static void main(String[] args){
		final int SIZE = 6;
		Course[] c = new Course[SIZE];

		c[0] = new Course();
		c[1] = new Course("CS101", "ItoP", 4);
		c[2] = new Course("CS201", "OOP", 4);
		c[3] = new Course("CS345", "Pak Studies", 3);
		c[4] = new Course("CS501", "Composition", 3);
		c[5] = new Course(c[2]);
		
		System.out.println("Displaying all courses:");
		Course.print(c);
		
		if(c[5].isEqual(c[2])){
            System.out.println("\n\nCourse #6 and Course #3 are equal.");
        }
        else{
            System.out.println("\n\nCourse #6 and Course #3 are not equal.");
        }//if
		
		Course.sort(c);
		System.out.println("Displaying after sorting:");
		Course.print(c);

		String key = "CS501";
		int index = Course.linearSearch(c, key);
		if(index >= 0){
			System.out.println("\n\nThe key " + key + " is found at index # " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + key + " not found.");
        }//if

		System.out.println("\n\nSortng the Courses array...");
        Course.sort(c);
        System.out.println("\n\nDisplaying all Courses after sorting:");
        Course.print(c);

		key = "Composition";
		int i = Course.search(c, key);
		if(i >= 0){
			System.out.println("\n\nThe key " + key + " is found at index # " + i + ".");
        }
        else{
            System.out.println("\n\nThe key " + key + " not found.");
        }//if

	}//main
}//class