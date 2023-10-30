class bookD{

	 private String title;
	 private String author;
	 private String publisher;
	 private int coppiessold;

	 public void  settitle(String title){
	 	this.title = title;
	 }//set
	 public String gettitle(){
	 	return title;
	 }//get

	  public void  setauthor(String author){
	 		this.author = author;
	 }//set
	 public String getauthor(){
	 	return author;
	 }//get

	   public void  setpublisher(String publisher){
	 		this.publisher = publisher;
	 }//set
	 public String getpubliser(){
	 	return publisher;
	 }//get
	 public void  setcs(int copysold){
	 	this.coppiessold = copysold;
	 }//set
	 public int getcs(){
	 	return coppiessold;
	 }//get

	  public bookD(){
	 	System.out.println("0-Arguments constructor");
	 }//0-arguments

	 public bookD(String author , String title ,String publisher, int coppiessold ){
	 		this.author = author;
	 		this.title = title;
	 		this.publisher = publisher;
	 		this.coppiessold = coppiessold;
	 }//overloaded

	 public void display(){
	 	System.out.println("Author" + " "+ getauthor() + " "+ "Title:" +" "+ gettitle() + " " +"Publisher: " +" "+ getpubliser() + " " + "Coppies sold" + getcs());
	 }//diplay

	 public void copy(bookD b){
	 	
	 	b.settitle(this.gettitle());
	 	b.setauthor(this.getauthor());
	 	b.setpublisher(this.getpubliser());
	 	b.setcs(this.getcs());
	 }//copy

	 public String tooString(){
	 	return this.gettitle() + "," + this.getauthor() + "," + this.getpubliser() + "," +this.getcs() ;
	 }//toString

	 public boolean compare(bookD b){
	 	return (this.getauthor().equals(b.getauthor())) && (this.gettitle().equals(b.gettitle())) && (this.getpubliser().equals(b.getpubliser())) && (this.getcs()==(b.getcs())) ;
	 }//

	 public bookD create(bookD b){
		return new bookD(this.getauthor() , this.gettitle() , this.getpubliser(), this.getcs() );
	}


	 

}