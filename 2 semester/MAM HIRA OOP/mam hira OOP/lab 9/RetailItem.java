class RetailItem{
	private String description;
	private int unitOfHand;
	private double price;

	 	public void setdiscription(String d){
	 		description = d;
	 	}//descr

	 	public String getdiscrition(){
	 		return description;
	 	}

	 	public void setunit(int u){
	 		unitOfHand = u;
	 	}//yearModel

	 	public  int getunit(){
	 		return unitOfHand;
	 	}//getmake

	 	public void setprice(double p){
	 		price = p;
	 	}//yearspeed

	 	public double getprice(){
	 		return price;
	 	}//getspeed

	 	public void display(){

	 		System.out.println("the discription is = " + getdiscrition());
	 		System.out.println("the unit is : " + getunit());
	 		System.out.println("the price is : " + getprice());

	 	}//display

	 	public boolean compare(RetailItem arg){
		return this.description.equals(arg.description) && this.unitOfHand== arg.unitOfHand && this.price == arg.price;  
	}//compare
 		

 		public RetailItem(String description , int unitOfHand , double price){
			this.description = description ;
			this.unitOfHand = unitOfHand;
			this.price  = price;
	} 

	public RetailItem create(RetailItem c){
		return new RetailItem(this.getdiscrition()+" "+c.getdiscrition(),
					this.getunit() + c.getunit(),
					this.getprice()  + c.getprice());
	}//car

	public RetailItem(){

	}


	public String toString(){
		return "{" + description + " ," + unitOfHand + " ,"+ price + " }";
	}//string
 	
 	public boolean isNotEqual(RetailItem c){
		return !this.compare(c);
	}//return

	public void copy(RetailItem c){
		this.description = c.description;
		this.unitOfHand = c.unitOfHand;
		this.price = c.price;
	}//copy

	

 
}//class