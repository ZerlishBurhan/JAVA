class practice{
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

	public practice(){

	}//default

	public practice(int id , String name, String lastName, double gpa){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.gpa = gpa;				
	}//overloaded

	public practice(practice arg){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.gpa = gpa;			
	}//copy constructor

	public void print(){
		System.out.println("The id of the students is " + this.getId());
		System.out.println("The name of the student is " + this.getName());
		System.out.println("The last name of the Student is " + this.getLastName());
		System.out.println("The GPA  of the student is " +  this.getGpa());
	}//print-messages

	public static void Print(practice[] s){
		for (int i = 0; i < s.length ; ++i ){
			s[i].print();
		}//for
	}//Print-2

	public boolean isEqual(practice arg){
		System.out.println("Is the id of first one equal to the id of second one ? ");
		return this.id == arg.id;
	}//isEqual

	public boolean isGPALesser(practice arg){
		System.out.println("Is the gpa of less than  the gpa of second one ? ");
		return (this.getGpa() == arg.getGpa());
	}//isGpalesser

	public static void sort(practice[] arg){

	for (int i = 0;i < arg.length ; ++i){
		int minindex = minIndex(arg , i);
			practice temp = arg[i];
			arg[i] = arg[minindex];
			arg[minindex] = temp;	
		}//for
	}//sort

	public static int minIndex(practice[] arg , int start){
		int minindex = start;
		practice min = arg[start];
		for (int i = 0;i < arg.length-1 ; ++i){
			if(arg[i].isGPALesser(min)){
				min = arg[i];
				minindex = i; 
			}//if
		}//for
		return minindex;
	}//minindex

	public static int linearSearch(practice[] arg , int target){
		for (int i = 0; i< arg.length; ++i){
			if(arg[i].getId() == target){
				return i;
			}//if	
		}//for
		return -1;
	}//linearSearch

	public static int Binarysearch(practice[] arg , double key){
			int low = 0;
			int high = arg.length-1;
		while(low<=high){
				int mid = (low+high)/2;
				if(arg[mid].getGpa() == key){
					return mid;
				}//if
				else if(arg[mid].getGpa()<key){
					return low = mid+1;
				}
				else{
					return high = mid-1;
				}//else

		}
		return -1;
	}//search

	public static void search(practice[] arg, int target){
		boolean flag = true;
		int index = 0;

		for (int i = 0; i< arg.length; ++i){
			if(arg[i].getId() == target){
				flag = true;
				index=i;
				break;
			}//if	
		}//for
		if(flag){
			arg[index].print();
		}
		else{
			System.out.println("Student not found! ");
		}
	}





}//practice