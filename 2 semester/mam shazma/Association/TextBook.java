class TextBook  {
			private String title;
			private String author;
			private String publisher;

			public 	TextBook(TextBook t){//	Copy Constructor
				this.title=t.title;
				this.author=t.author;
				this.publisher=t.publisher;

			}
			public TextBook(String title,String author,String publisher){//Parameterizes Constructor

				this.title=title;
				this.author=author;
				this.publisher=publisher;

			}
	  	public String toString(){
			  		return "Title is: "+title+", Author is "+author+", Publisher is: "+publisher;
	  	}


}