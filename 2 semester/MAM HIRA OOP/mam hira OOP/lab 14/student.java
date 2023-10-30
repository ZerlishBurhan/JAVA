class student{
	private String name;
	private int id;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}

 	public student(){

 	}

 	public student(String name,int id){
 			this.name = name;
			this.id = id;
 	}

 	public void display(){
 		System.out.println("Name : " + name + "\nId : " + id);
 	}

 	public int compareTo(student arg){
 		return this.getName().compareTo(arg.getName());

 		// if uml demands this header 
 		// than 
 		// public int compareTO(object otherobject){
 		// 	Student s = (student) otherobject;
 		// 	return this.getName().compareTO(s.getName());
 		// }
 	}

}//class