class Payroll{

	private String name; 
	private int idNumber;
    private double  hourlyPayRate;
    private double numberOfHoursWorked;


	public void setname(String name){
		this.name = name;
	}

	public String getname(){
		return name;
	} 

	public void setidnumber(int idNumber){
		this.idNumber = idNumber;
	}

	public int getidnumber(){
	return idNumber;
	}
 
    public void sethourlyrate(double h){
    		 hourlyPayRate = h;

    }//set

    public double gethourlyrate(){
    		return hourlyPayRate;
    }//get

  public void sethoursworked(double hw){
  			numberOfHoursWorked = hw;
    }//set

    public double gethoursworked(){
    		return	numberOfHoursWorked;
    }//get

    public double grosspay(){
    	return gethourlyrate() * gethoursworked();
    }

	public void display(){

	 		System.out.println("the name is = " + getname());
	 		System.out.println("the id number is : " + getidnumber());
	 		System.out.println("the  is hourlyPayRate : " + gethourlyrate());
	 		System.out.println("the hours worked are : " + gethoursworked());

	 	}//display

	 	public boolean compare(Payroll arg){
		return this.name.equals(arg.name) && this.idNumber== arg.idNumber && this.hourlyPayRate == arg.hourlyPayRate && this.numberOfHoursWorked == arg.numberOfHoursWorked;  
	}//compare
 		

 		public Payroll(String name , int idNumber, double hourlyPayRate , double numberOfHoursWorked){
			this.name = name ;
			this.idNumber= idNumber;
			this.hourlyPayRate  = hourlyPayRate;
			this.numberOfHoursWorked = numberOfHoursWorked;
	} 

	public Payroll create(Payroll c){
		return new Payroll(this.getname()+" "+c.getname(),
					this.getidnumber() + c.getidnumber(),
					this.gethourlyrate()  + c.gethourlyrate(),
					this.gethoursworked() + c.gethoursworked());
	}//car

	public Payroll(){

	}


	public String toString(){
		return "{" + name + " ," + idNumber+ " ,"+ hourlyPayRate + " ," + numberOfHoursWorked + " }";
	}//string
 	
 	public boolean isNotEqual(Payroll c){
		return !this.compare(c);
	}//return

	public void copy(Payroll c){
		this.name = c.name;
		this.idNumber= c.idNumber;
		this.hourlyPayRate = c.hourlyPayRate;
		this.numberOfHoursWorked = c.numberOfHoursWorked;
	}//copy
}