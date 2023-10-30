import java.util.Scanner;
class bookD{
	private String title;
	private String author;
	private String publisher;
	private int coppiessold;

	public void get(){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the title of the book :");
		title = keyboard.nextLine();

		System.out.print("Enter the author of the book :");
		author = keyboard.nextLine();

		System.out.print("Enter the publisher of the book :");
		publisher = keyboard.nextLine();

		System.out.print("Enter the coopies sold  of the book :");
		coppiessold = keyboard.nextInt();

		 set( title ,  author ,  publisher ,coppiessold);

	}//get

	public void set(String title , String author , String publisher , int coppiessold){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.coppiessold = coppiessold;
	}//set

	public String gettitle(){
		return title;
	}

    public String getauthor(){
		return author;
	}

	public String getpublisher(){
		return publisher;
	}

	public int getcoppiessold(){
		return coppiessold;
	}

	public void display(){

		System.out.println("The title of the book is : " + gettitle());
		System.out.println("The author of the book is : " + getauthor());
		System.out.println("The publisher of the book is : " + getpublisher());
		System.out.println("The coppies sold  of the book is : " + getcoppiessold());

	}//display
	
}//class