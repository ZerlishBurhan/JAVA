import java.util.*;
	class pet{




	 private String name;
	 private String animal;
	 private int age ; 

	 public  void input(){

	 		Scanner read = new Scanner(System.in);

	 		System.out.println("The name of pet is : ");
	 		int n = read.nextLine();

			System.out.println("the animal  is : ");
	 		int a = read.nextLine();

			System.out.println("the age of book is ");
	 		int ag = read.nextInt();

	 		set(n , a , ag);
	 }

	 public void set(String n , String a , int ag){
	 	name = n ; 
	 	animal = a;
	 	age = ag;


	 } //set


	public String  getName(){
		return name;
	}

		public String getanimal(){
			return animal;
	}

		public int getAge(){
			return age; 
	}	

	public void show(){

			System.out.print( " the  is name of pet is : " + getName() ) ;
			System.out.print( " the  is name of pet is : " + getanimal() ) ;
			System.out.print( " the  is name of pet is : " + getage() );
	}

}//class

	