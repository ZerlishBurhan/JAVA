public class Student{

    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    public int getId() {
        return id;
    }//getId()

    public void setId(int id) {
        this.id = id;
    }//setId()

    public String getFirstName() {
        return firstName;
    }//getFirstName()

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//setFirstName()

    public String getLastName() {
        return lastName;
    }//getLastName()

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//setLastName()

    public double getGpa() {
        return gpa;
    }//getGpa()

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }//setGpa()
    
    public Student(){
        setId(1);
        setFirstName("");
        setLastName("");
        setGpa(0.0);
    }//Default constructor
    
    public Student(int i, String fName, String lName, double gpa){
        setId(i);
        setFirstName(fName);
        setLastName(lName);
        setGpa(gpa);
    }//Overloaded constructor 
    
    public Student(Student s){
        setId(s.getId());
        setFirstName(s.getFirstName());
        setLastName(s.getLastName());
        setGpa(s.getGpa());
    }//Copy constructor

    public void print(){
        System.out.println("Id: " + this.getId());
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("GPA: " + this.getGpa());
    }//print()

    public static void print(Student[] s){
	for(int i=0;i<s.length;i++){
		s[i].print();
	}
    }

    public boolean isEqual(Student s){
        return this.getId() == s.getId();
    }//isEqual()
    public boolean isGPALesser(Student s){
	return (this.getGpa() < s.getGpa());
    }

    public static void sort(Student[] s){
	for(int i=0;i<s.length-1;i++){
		int minIndex=getMinIndex(s,i);
		Student temp=s[i];
		s[i]=s[minIndex];
		s[minIndex]=temp;
	}
    }
    public static int getMinIndex(Student[] s,int start){
	int minIndex=start;
	Student min=s[start];
	for(int i=start;i<s.length;i++){
		if(s[i].isGPALesser(min)){
			min=s[i];
			minIndex=i;
		}
	}
	return minIndex;
    }


    public static int linearSearch(Student[] s, int key){
        for (int i = 0; i < s.length; ++i) {
            if(s[i].getId() == key){
                return i;
            }//if
        }
        return -1;
    }//linearSearch()

    public static int search(Student[] s,double key){

	int start=0;
	int end=s.length-1;
	while(start<=end){
		int mid=(start+end)/2;
		if(s[mid].getGpa()==key){
			return mid;
		}
		
		else if(s[mid].getGpa()>key){
			end=mid-1;
		}
		else{
			start=mid+1;
		}
	}
	return -1;
    }

    public static void search(Student[] s, int key){
	boolean found=false;
	int index=-1;
        for (int i = 0; i < s.length; ++i) {
            if(s[i].getId() == key){
                found=true;
		index=i;
		break;
            }//if
        }
	if(found){
		s[index].print();
	
	}
	else{
		System.out.println("No Student Found");
	}
        	
    }//search()
}