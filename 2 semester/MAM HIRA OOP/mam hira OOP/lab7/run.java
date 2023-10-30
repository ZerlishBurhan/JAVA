class run{
	 
	 private String name;
	 private String department;
	 private String position;
	 private int idNumber;

	 public void  setname(String name){
	 	this.name = name;
	 }//set
	 public String getname(){
	 }//get
	 	return name;
	  public void  setdepartment(String department){
	 		this.department = department;
	 }//set
	 public String getdepartment(){
	 	return department;
	 }//get
	  public void  setposition(String position){
	 		this.position = position;
	 }//set
	 public String getposition(){
	 	return position;
	 }//get
	 public void  setidNumber(int idNumber){
	 	this.idNumber = idNumber;
	 }//set
	 public int getidNumber(){
	 	return idNumber;
	 }//get

	 public run(){
	 	System.out.println("0-Arguments constructor");
	 }//0-arguments

	 public run(String name , String department ,String position, int idNumber ){
	 		this.name = name;
	 		this.department = department;
	 		this.position = position;
	 		this.idNumber = idNumber;
	 }//overloaded

	 public void display(){
	 	System.out.println("Name" + " "+ getname() + " "+ "Department:" +" "+ getdepartment() + " " +"Position: " +" "+ getposition() + " " + "Idnumber" + getidNumber());
	 }//diplay

	
	 public void copy(run b){
	 	
	 	b.setname(this.getname());
	 	b.setdepartment(this.getdepartment());
	 	b.setposition(this.getposition());
	 	b.setidNumber(this.getidNumber());
	 }//copy

	 public String tooString(){
	 	return this.getname() + "," + this.getdepartment() + "," + this.getposition() + " " +this.getidNumber() ;
	 }//toString

	 public boolean compare(Empolyee b){
	 	return (this.getname().equals(b.getname())) && (this.getdepartment().equals(b.getdepartment())) && (this.getposition().equals(b.getposition())) && (this.getidNumber()==(b.getidNumber())) ;
	 }//

	 

	}//class