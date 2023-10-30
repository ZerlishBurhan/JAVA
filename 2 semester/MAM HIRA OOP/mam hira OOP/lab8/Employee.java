class Employee {
	public static void main(String[] args) {
	
	run e1 = new run();
	run e2 = new run( " Zerish " , " harry porter " , "momna " , 1000);

System.out.println("----------------employe1----------------------------");
	e1.display();
	System.out.println(" ");
	System.out.println("--------------employe2-------------------");
	e2.display();
	System.out.println(" ");
	e2.copy(e1);
	System.out.println(" ");
	e2.display();
	System.out.println(" ");
	System.out.println(e1.tooString());
	System.out.println(" ");
	System.out.println(e2.tooString());
	System.out.println(" ");
	e1.compare(e2);
	System.out.println(" ");            

	//System.out.println(book1.popular(book2));
	}//main

}//class