public class Instructor{
	private String firstName;
	private String lastName;
	private String officeNumber;
	public Instructor(String firstName, String lastName, String officeNumber){//Parameterized Constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNumber = officeNumber;
	}
	public Instructor(Instructor arg){//Copy Constructor
		this.firstName=arg.firstName;
		this.lastName=arg.lastName;
		this.officeNumber=arg.officeNumber;
	}

	public String toString(){
	 	return firstName + " "+ lastName + ", office# " + officeNumber;
	}



}
