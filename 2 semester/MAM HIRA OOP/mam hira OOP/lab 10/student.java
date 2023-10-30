public class student{
	private int id;
	private String name;
	private String lastName;
	private double gpa;

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


	public void setLastName(String lastName){
		this.lastName = lastName;
	}//set
	public String getLastName(){
		return lastName;
	}//get


	public void setGpa(double gpa){
		this.gpa = gpa;
	}//set
	public double getGpa(){
		return gpa;
	}//get

	public student(){
		System.out.println("0-Argument constructor");
	}//0-arg

	public student(int id, String name, String lastName, double gpa){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.gpa = gpa;

	}//overloaded constructor

	public student(student s){
		this.id = s.id;
		this.name= s.name;
		this.lastName = s.lastName;
		this.gpa = s.gpa;
		// student temp = s.
	}//copy constructor

	public void print(){
		System.out.println("The the id of student is = " + this.getId());
		System.out.println("The the name of student is = " + this.getName());
		System.out.println("The the lastName of student is = " + this.getLastName());
		System.out.println("The the gpa of student is = " + this.getGpa());

	}//print

	public boolean isEqual(student s){
		return this.getId() == s.getId() && this.getName().equals(s.getName()) && this.getLastName().equals(s.getLastName()) && (this.getGpa()-s.getGpa() < 0.00001);
	}//equal

	public boolean isLesserGpa(student s){
		return this.getGpa() < s.getGpa();
	}//gpa

	public static void printArray(student[] s){
		for(int i =0 ; i < s.length ; ++i){
			s[i].print();
			System.out.println();
		}//for
	}//printArray

	public static int getMinIndex(student[] s , int start){
		int minIndex = start;
		student min = s[start];

		for (int i = start; i < s.length ; ++i ) {
			if(s[i].isLesserGpa(min)){
				min = s[i];
				minIndex = i;
				return minIndex;
			}//if
		}//for
		return -1 ; 
	}//getMinIndex

	public static void sort(student[] s){
		for (int i = 0 ; i < s.length - 1; ++i) {
			int minIndex = getMinIndex(s,i);
			student temp = s[i];
			s[i] = s[minIndex];
			s[minIndex]= temp; 
		}//for
	}

	public static int linearSearch(student[] arr, double target){

		for (int index = 0; index < arr.length; index+=1) {
			if(arr[index].getId() == target)
				return index;
		}//for
		return -1;
	}//linearSearch

	public static void search(student[] s, double key){
		int temp = linearSearch(s , key);
		if (temp == -1) {
			System.out.print("Student not found");
		}
		else{
			System.out.println("Student found");
		}
	}

	public static int binarySearch(student[] arr, double target){
		int low = 0, high = arr.length-1, mid;

		while(low<=high){
			mid = (low+high)/2;
			if(arr[mid].getGpa() > target)
				high = mid - 1;
			else if(arr[mid].getGpa() < target)
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}


}//class