

class Course{	
	private String courseName;
	private Instructor instructor;//Shows 'has a' relationship
	private TextBook txtBook;//Shows 'has a' relationship

	public Course(String name, Instructor ins, TextBook tb){
		this.courseName = name;
		this.instructor = ins;
		this.txtBook = tb;
	} 

	public void setCourseName(String courseName){

		this.courseName = courseName;
			
	}

	public String getCourseName(){

		return courseName;

	}

	public Instructor getInstructor(){

		return instructor;

	}

	public TextBook getTxtBook(){

		return txtBook;

	}
	public String toString(){
		//System.out.print(prin toString);
		return "A Course: "+courseName+"\n\thas a TextBook:\n\t\t "+txtBook+"\n\thas an Instructor:\n\t\t"+instructor+"";
	    
	}
}