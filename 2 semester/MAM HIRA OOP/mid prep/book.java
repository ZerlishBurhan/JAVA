class book{
	private String title;
	private String author;
	private String publisher;
	private int coppiessold;

	public void settitle(String title){
		this.title = title;
	}//set
	public String gettitle(){
		return title;
	}//get

	public void setauthor(String author){
		this.author = author;
	}//set
	public String getauthor(){
		return author;
	}//get

	public void setpublisher(String publisher){
		this.publisher = publisher;
	}//set
	public String getpublisher(){
		return publisher;
	}//get

	public void setcoppiessold(int coppiessold){
		this.coppiessold = coppiessold;
	}//set
	public int getcoppiessold(){
		return coppiessold;
	}//get

	public book(){
		System.out.print("0- argument ");
	}

	public book(String title , String author , String publisher , int coppiessold){
	
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.coppiessold = coppiessold;
	}//overloaded constructor

	public void display(){
		System.out.println("The author of book is : " + getauthor());
		System.out.println("The title of book is : " + gettitle());
		System.out.println("The publisher of book is : " + getpublisher());
		System.out.println("The coppies sold of book is : " + getcoppiessold());
	}//display

	public boolean isPopular(book b){
			return this.getcoppiessold()>b.getcoppiessold();
	}//popular

	public void copy(book b){
		b.settitle(this.gettitle());
		b.setauthor(this.getauthor());
		b.setpublisher(this.getpublisher());
		b.setcoppiessold(this.getcoppiessold());
	}//copy

	public String toString(){
		return "{" + getpublisher() + "," + getauthor() + "," + gettitle() + "," + getcoppiessold() + "}"; 
	}//String

	public boolean compare(book b){
		return this.gettitle().equals(b.gettitle())  &&
		 this.getauthor().equals(b.getauthor()) && 
		 this.getpublisher().equals(b.getpublisher()) && 
		 this.getcoppiessold()==b.getcoppiessold() ;
	}
}//class