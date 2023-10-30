class runStudent{
	public static void main(String[] args) {

		// student s1 = new student(5643, "Zerlish" , "Burhan" , 3.8 );
		// student s2 = new student(5642, "Momna" , "Asghar" , 3.89 );

	final int SIZE = 6;
	student[] s = new student[SIZE];
	s[0] = new student();
	s[1] = new student(101, "Ali", "Akbar", 2.95);
    s[2] = new student(5642, "Momna" , "Asghar" , 3.89 );
    s[3] = new student(5643, "Zerlish" , "Burhan" , 3.8 );
    s[4] = new student(s[2]);

	student.printArray(s);
	double key = 2.2;
	student.search(s,key);

	}//main
}//class