public class Student
{

        /********************** Fields ****************************************/
	private int id;
	private String name;
	private int semester;
	private String program;
	private int numberOfCourses;
	private Course[] courses; //shows association


        /*********************** Constructors *********************************/
	public Student(int id, String name, int semester, String program)
	{
		this.id = id;
		this.name = name;
		this.semester = semester;
		this.program = program;
		this.courses = new Course[7]; //shows association
		this.numberOfCourses = 0;
	}//Student
	public Student(String name){
			this.name = name;
	}


        /************************* Setters *************************************/
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setSemester(int semester){this.semester = semester;}
	public void setProgram(String program){this.program = program;}
	public void setNumberOfCourses(int numberOfCourses){this.numberOfCourses = numberOfCourses;}
	

        /************************* Getters *************************************/
	public int getId(){return id;}
	public String getName(){return name;}
	public String getProgram(){return program;}
	public int getSemester(){return semester;}
	public int getNumberOfCourses(){return numberOfCourses;}


        // Register Course
	public void registerCourse(Course c)
	{
		this.courses[numberOfCourses] = c;
		numberOfCourses++;
	}//registerCourse



        // Display Registered Courses
	public void displayRegisteredCourses()
	{
		System.out.println("Student Name: " + name);
		System.out.println("Student ID: " + id);
		System.out.println("Semester: " + semester);
		System.out.println("Courses Information: ");
		for(int i = 0; i < numberOfCourses; ++i)
		{
			System.out.println("Course Code: " + courses[i].getCourseCode());
			System.out.println("Course Title: " + courses[i].getCourseTitle());
		}//for
	}

	// public String toString(){
	// 	return "Name: "+getName();
	// }
	
}//class