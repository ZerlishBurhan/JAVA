class runParRoll{
	public static void main(String[] args) {
		
		Payroll p1 = new Payroll();
		Payroll p2 = new Payroll("zerlish " , 675 , 89.90 , 546.989 );
		Payroll p3 = new Payroll("momna " , 89 , 89.798 , 789.89);

		p1.display();
		System.out.println(p1.toString());
		System.out.println();
		p2.display();
		System.out.println(p2.toString());
		System.out.println();
		p3.display();
		System.out.println(p3.toString());
		System.out.println();

		p2.copy(p3);
		System.out.println();
		p2.display();
		System.out.println(p2.toString());
		System.out.println();
		p3.display();
		System.out.println(p3.toString());
		System.out.println();


	}//main
}//class