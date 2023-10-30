/*
 *
 *Purpose:  Inheritance
            e.g.,
            1) Implementing Interface class.
            2) To be concrete class, this class needs to implement all abstract methods of super class
            
*/

public class Student implements Relatable
{
         /********************** Fields ****************************************/
	private double cgpa;
	private int semester;
        /*********************** Constructors *********************************/
	public Student(double cgpa, int semester)
	{
		this.cgpa = cgpa;
		this.semester = semester;
	}//Student
        
        /************************ Getters ***************************************/
	public double getCgpa(){return cgpa;}
	public int getSemester(){return semester;}

         /************************ Abstract Methods Implementation ***************************************/
	@Override
	public boolean isEqual(Object obj)
	{
		Student std = (Student) obj;
		return (this.getCgpa() == std.getCgpa()) && (this.getSemester() == std.getSemester());
	}

	public boolean isLess(Object obj)
	{
		Student std = (Student) obj;
		return (this.getCgpa() < std.getCgpa()) && (this.getSemester() == std.getSemester());
	}

	public boolean isGreater(Object obj)
	{
		Student std = (Student) obj;
		return (this.getCgpa() > std.getCgpa()) && (this.getSemester() == std.getSemester());
	}
}