	class book  {
	 
	 private int bookId;
	 private int pages;
	 private double price;

	public void  setbookId(int bookId){
	 	this.bookId = bookId;
	}//set
	public int getBookId(){
	 	return bookId;
	}//get

	public void  setbookpages(int bookpages){
	 		pages = bookpages;
	}//set
	public int getBookpages(){
	 	return pages;
	}//get

	public void  setbookprice(double bookprice){
	 	price = bookprice;
	}//set
	public double getBookprice(){
	 	return pages;
	}//get

	public book(){
	 	System.out.println("0-Arguments constructor");
	}//0-arguments

	public book(int bookId , int pages , double price){
	 		this.bookId = bookId;
	 		this.pages = pages;
	 		this.price = price;
	}//overloaded

	public void display(){
	 	System.out.println("BookId: " + " "+ getBookId() + " "+ "Bookpages:" +" "+ getBookpages() + " " +"BookPrice: " +" "+ getBookprice()+" " );
	
	}//diplay

	public boolean isLarger(book b){
	 	return this.getBookpages() > b.getBookpages();
	}//boolean

	public boolean isExpensive(book b){
	 	return (this.getBookprice() - b.getBookprice()) > 0.000012;
	}//boolean

	public void copy(book b){
	 	
	 	b.setbookId(this.getBookId());
	 	b.setbookpages(this.getBookpages());
	 	b.setbookprice(this.getBookprice());
	 	// this.bookId = b.bookId;

	}//copy

	public String tooString(){
	 	return this.getBookId() + "," + this.getBookpages() + "," + this.getBookprice() ;
	}//toString

	public boolean equal(book b){
	 	return this.getBookId() == b.getBookId() && this.getBookpages() == b.getBookpages() && this.getBookprice() == b.getBookprice();
	}//boolean 

	public book create(book b){
		return new book(this.getBookId() + b.getBookId() , this.getBookpages() + b.getBookpages() , this.getBookprice() + b.getBookpages());
	}

}//class
