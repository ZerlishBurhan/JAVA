class p1{

	private String courseTitle;
	private String courseCode;
	private int creditHours;
	private p2[] students;
	private int numberOfStudents;

	public void setCourseTitle(String courseTitle){
		this.courseTitle = courseTitle;
	}//set
	public String getCourseTitle(){
		return courseTitle;
	}//get


	public void setCourseCode(String courseCode){
		this.courseCode =  courseCode;
	}//set
	public String getCourseCode(){
		return courseCode;
	}//get


	public void setCreditHours(int creditHours){
		this.creditHours = creditHours;
	}//set
	public int getCreditHours(){
		return creditHours;
	}//get


	// public void setNumberOfStudents(int numberOfStudents){
	// 	this.numberOfStudents = numberOfStudents;
	// }//set
	// public int getNumberOfStudents(){
	// 	return numberOfStudents;
	// }//get

	public p1(){

	}//0-arg

	public p1( String courseTitle, String courseCode , int creditHours){
				this.courseTitle = courseTitle;
				this.creditHours = creditHours;
				// this.numberOfStudents = numberOfStudents;
				this.courseCode =  courseCode;
				students = new p2[5];
				numberOfStudents = 0;

	}//overloaded-arg

	public void add(p2 s){
		this.students[numberOfStudents] = s;
		numberOfStudents++;
		s.addA(this);
	}//add

	public void display(){
		System.out.println("course : " + this.getCourseTitle());
		for(p2 temp : students){
			System.out.println(temp);
		}//for
	}//display




}//class
	
