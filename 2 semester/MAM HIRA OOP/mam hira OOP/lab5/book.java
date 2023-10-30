import java.util.*;

class book  {

	 private int bookId;
	 private int pages;
	 private double price ; 

	 public  void input(){

	 		Scanner read = new Scanner(System.in);

	 		System.out.println("The id of book is : ");
	 		int id = read.nextInt();

			System.out.println("the pages of book is : ");
	 		int p = read.nextInt();

			System.out.println("the price of book is ");
	 		double pr = read.nextDouble();

	 		set(id , p , pr );
	 }

	 public void set(int id , int p , double pr){
	 	bookId = id ; 
	 	pages = p;
	 	price = pr;


	 } //set


	public int  getId(){
		return bookId;
	}

		public int getPages(){
			return pages;
	}

		public double getPrice(){
			return price; 
	}	

	public void show(){

			System.out.print( " the lowest price is : " + getPrice() );
	}

}//class