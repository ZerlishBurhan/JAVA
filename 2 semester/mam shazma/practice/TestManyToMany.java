public class TestManyToMany
{
	public static void main(String[] args)
	{

                // Creating Course Objects
		Course c1 = new Course("OOP", "CS-239", 3);
		Course c2 = new Course("DSA", "CS-212", 3);


                // Creating Student Objects
		Student s1 = new Student(25, "XYZ", 4, "CS");
		Student s2 = new Student(26, "XYZz", 4, "CS");
		Student s3 = new Student(27, "XYZzz", 4, "CS");
		Student s4 = new Student(28, "XYZzzz", 4, "CS");
		Student s5 = new Student(29, "XYZzzzz", 4, "CS");
		Student s6 = new Student(251, "XYZC", 4, "CS");
		Student s7 = new Student(252, "XYZCX", 4, "CS");

                // Adding student to course list
		c1.add(s1);
		c1.add(s2);
		c1.add(s3);
		c1.add(s4);
		c1.add(s5);
		c1.add(s6);
		c1.add(s7);

		c2.add(s1);
		c2.add(s2);
		c2.add(s3);

                // Display registered students in course
		c1.displayStudents();
		System.out.println();
		c2.displayStudents();
			System.out.println();

                // Display student's registered courses
		s1.displayRegisteredCourses();
	}//main
}//class