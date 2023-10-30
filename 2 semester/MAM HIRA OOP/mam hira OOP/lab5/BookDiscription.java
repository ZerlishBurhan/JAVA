
class BookDiscription  {


	private String title ; 
	private String author ; 
	private String publisher ;
	private int copiessold;

	public void settitle( String t){
		title = t;
	}

	public String gettitle(){
		return title;
	}

	public void setauthor( String a){
		author = a ; 
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