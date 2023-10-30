class RunEmployee{
	
	public static void main(String[] args) throws Exception{

		BookDiscription book1 = new BookDiscription();


		book1.settitle("urdu");
		book1.setauthor("momna");
		book1.setpublisher("zerlish");
		book1.setcopysold(100);
		book1.display();
System.out.println();
		BookDiscription book2 = new BookDiscription();

		book2.settitle("english");
		book2.setauthor("zerlish");
		book2.setpublisher("hassan");
		book2.setcopysold(9);
		book2.display();
System.out.println();
		BookDiscription book3 = new BookDiscription();

		book3.settitle("ayesha");
		book3.setauthor("esha");
		book3.setpublisher("ali");
		book3.setcopysold(89);
		book3.display();
System.out.println();

		

	}
}