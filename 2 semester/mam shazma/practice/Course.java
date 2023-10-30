public class Course
{

        /********************** Fields ****************************************/
	private String courseTitle;
	private String courseCode;
	private int creditHours;
	private Student[] students;
	private int numberOfStudents;


         /*********************** Constructor *********************************/
	public Course(String cT, String cC, int cH)
	{
		courseTitle = cT;
		courseCode = cC;
		creditHours = cH;
		students = new Student[7];
		numberOfStudents = 0;
	}//Course

        /************************* Setters *************************************/
	public void setCourseTitle(String t){courseTitle = t;}
	public void setCourseCode(String c){courseCode = c;}
	public void setCreditHours(int ch){creditHours = ch;}

        /************************* Getters *************************************/
	public String getCourseTitle(){return courseTitle;}
	public String getCourseCode() {return courseCode;}
	public int getCreditHours() { return creditHours;}

        // Adding student to students list and calling registerCourse method of Student class
	public void add(Student s)
	{
		this.students[numberOfStudents] = s;
		numberOfStudents++;
		s.registerCourse(this);
	}

        // Display list of students registered in the course
	public void displayStudents()
	{
		System.out.println("Course: " + this.courseTitle);
		// for(int i = 0; i < numberOfStudents; ++i)
		// {
		// 	System.out.println(this.students[i].getId() + "\t" + this.students[i].getName()); 
		// }
		for (Student temp : students) {
			System.out.println(temp);
		}
	}//displayStudents
	

}//class