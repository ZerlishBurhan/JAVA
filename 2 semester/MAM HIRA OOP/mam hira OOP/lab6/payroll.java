import java.util.Scanner;

class payroll {
	
	private String name; 
	private int idNumber;
    private double  hourlyPayRate;
    private double numberOfHoursWorked;

    	public void input(){
    		Scanner keyboard = new Scanner(System.in);

    		System.out.println("Enter the hourly pay rate : ");
    		double hp = keyboard.nextDouble();

    		System.out.println("Enter the number of hours worked");
    		double hw = keyboard.nextDouble();

    		sethourlyrate( hp);
    		sethoursworked( hw);
    		System.out.println( " the gross pay is : " + grosspay());


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
}