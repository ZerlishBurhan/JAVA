class fuleTank{
private double litersFuel;
private double maxFuelCapacity;

	public fuleTank(){

	}//0-arg


	public fuleTank(double litersFuel,double maxFuelCapacity){
		this.litersFuel = litersFuel;
		this.maxFuelCapacity = maxFuelCapacity;
	}//0-arg

	public fuleTank(fuleTank arg){
		this.litersFuel = arg.litersFuel;
		this.maxFuelCapacity = arg.maxFuelCapacity;
	}//copr constructor

	public void setlitersFuel(double litersFuel){
		this.litersFuel = litersFuel;

	}//set
	public double getlitersFuel(){
		return litersFuel;
	}//get


	public void setmaxFuelCapacity(double maxFuelCapacity){
				this.maxFuelCapacity = maxFuelCapacity;
	}//set
	public double getmaxFuelCapacity(){
		return maxFuelCapacity;
	}//get

	public void add(double liters){

		if(liters<=this.getmaxFuelCapacity()){
			this.litersFuel = this.litersFuel + liters;
		}
		else{
			System.out.println("tank is full");
		}//else
		if(this.getlitersFuel() > this.getmaxFuelCapacity()){
			System.out.println("the tank is full ---------");
		}
	}//add

		public void remove(double liters){
		if(this.getlitersFuel() != 0){
			 this.litersFuel = this.litersFuel -  liters;
		}
		else{
			System.out.println("fuel is empty");
		}//else
	}//add

	public boolean isEmpty(){
		return (litersFuel<0);
	}//isEmpty


	public boolean isFull(){
		return (litersFuel==maxFuelCapacity);
	}//isFull

	public void Currentfulelevel(){
		System.out.println("the amount of fuel is " + this.getlitersFuel());
		System.out.println("the capapcity of fuel is " + this.getmaxFuelCapacity());
	}//


}//class