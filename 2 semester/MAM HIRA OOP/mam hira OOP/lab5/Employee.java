
class Employee  {


	private String NameId ; 
	private String  position; 
	private String department;
	private int number;

	public void setnameid( String id){
		NameId = id;
	}

	public String getnameid(){
		return NameId;
	}

	public void setauthor( String p){
		position = p ; 
	}

	public String getauthor(){
			return author;
	}

	public void setpublisher( String p){
		publisher = p ;
	}

	public String getpublisher(){
		return publisher;
	}

	public void setcopysold( int cs){
		copiessold = cs ;
	}

	public int getcopysold(){
			return copiessold;
	}


	public void display(){

		System.out.println("the author is " + getauthor());
		System.out.println("the title is " + gettitle());
		System.out.println("the publisher is " + getpublisher());
		System.out.println("the copysold is " + getcopysold());

	}

}