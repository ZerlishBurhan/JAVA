class pet  {
	 
	 private String name;
	 private String animal;
	 private int age;

	 public void  setname(String name){
	 	this.name = name;
	 }//set
	 public String getname(){
	 	return name;
	 }//get
	  public void  setanimal(String animal){
	 		this.animal = animal;
	 }//set
	 public String getanimal(){
	 	return animal;
	 }//get
	  public void  setage(int age){
	 	this.age = age;
	 }//set
	 public int getage(){
	 	return age;
	 }//get

	 public pet(){
	 	System.out.println("0-Arguments constructor");
	 }//0-arguments

	 public pet(String name , String animal , int age ){
	 		this.name = name;
	 		this.animal = animal;
	 		this.age = age;
	 }//overloaded

	 public void display(){
	 	System.out.println("Name: " + " "+ getname() + " "+ "Animal:" +" "+ getanimal() + " " +"Age: " +" "+ getage() +" " );
	 }//diplay

	
	 public void copy(pet b){
	 	
	 	b.setanimal(this.getanimal());
	 	b.setname(this.getname());
	 	b.setage(this.getage());

	 }//copy

	 public String tooString(){
	 	return this.getname() + "," + this.getanimal() + "," + this.getage() ;
	 }//toString

}//class