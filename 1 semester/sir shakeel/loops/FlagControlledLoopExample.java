import java.util.Scanner; 

class FlagControlledLoopExample {

  public static void main(String[] args) {
  
    Scanner keyboard = new Scanner(System.in);      

    /*
      Ask a number from the user. We will print whether the 
      input is even or odd. We will stop if the user enters
      a value of zero.
    */     

    boolean flag = true;

    //while(flag == true) {
    while(flag) {
      System.out.print("Enter a number: ");
      int number = keyboard.nextInt();
   
      if(number == 0) {
	       flag = false;	
      } else {
	        if(number % 2 == 0) {
            System.out.println(number + " is even");
          } else {
            System.out.println(number + " is odd");
          }//if
      }//if

    }//while	    

  }//main

}//class