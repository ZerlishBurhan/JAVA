class p2{

	private int id;
	private String name;
	private int semester;
	private String program;
	private int numberOfCourses;
	private p1[] courses;

	public void setId(int id){
		this.id = id;
	}//set
	public int getId(){
		return id;
	}//get


	public void setName(String name){
		this.name = name;
	}//set
	public String getName(){
		return name;
	}//get


	public void setSemester(int semester){
		this.semester = semester;
	}//set
	public int  getSemester(){
		return semester;
	}//get


	public void setProgram(String program){
		this.program = program;
	}//set
	public String getProgram(){
		return program;
	}//get


	// public void setNumberOfCourses(int numberOfCourses){
	// 	this.numberOfCourses = numberOfCourses;
	// }//set
	// public int  getNumberOfCourses(){
	// 	return numberOfCourses;
	// }//get

	public p2(){

	}//0-arg

	public p2( int id, String name,int semester , String program){
					this.id = id;
					this.name = name;
					this.semester = semester;
					this.program = program;
					// this.numberOfCourses = numberOfCourses;
					courses = new p1[4];
					numberOfCourses = 0;

	}//overloaded

	public void addA(p1 p){
		courses[numberOfCourses] = p;
		numberOfCourses++;
	}//add

	public void displayR2(){
		System.out.println("The id of student is : " + this.getId());
		System.out.println("The name of the Student is : " + this.getName());
		System.out.println("The semester of the student is " + this.getSemester());
		System.out.println("The name of program is : " + this.getProgram());
		// System.out.println("The number of courses are : " + this.getNumberOfCourses());
		for (int i = 0; i < numberOfCourses ;++i){
			System.out.println("corse code : " + courses[i].getCourseCode());
			System.out.println("course title : " + courses[i].getCourseTitle());
		}
	}


}//class