class p3{
	public static void main(String[] args) {
		
		p1 obj1 = new p1("oop" , "401 phy" , 78 );
		p1 obj2 = new p1("PF" , "234 pf" , 234);

		p2 s1 = new p2(221400111 , "zerlish" , 2 , "bs -SE");
		p2 s2 = new p2(221400110 , "momna" , 2 , "bs -SE");
		p2 s3 = new p2(221400086 , "hassan" , 2 , "bs -SE");
		p2 s4 = new p2(221400077 , "ahmad" , 2 , "bs -SE");
		p2 s5 = new p2(221400054 , "ayesha" , 2 , "bs -SE");

		obj1.add(s1);
		obj1.add(s2);
		obj1.add(s3);
		obj1.add(s4);
		obj1.add(s5);
		System.out.println();
		obj2.add(s1);
		obj2.add(s2);
		// obj2.add(s3);
		// obj2.add(s4);
		// obj2.add(s5);
		System.out.println();
		obj1.display();
		System.out.println();
		obj2.display();
		System.out.println();
		s1.displayR2();

	}//main
}//class