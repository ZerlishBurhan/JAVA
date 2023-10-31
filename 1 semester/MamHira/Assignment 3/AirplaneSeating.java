import java.util.Scanner;

class AirplaneSeating{

	public static void userinput(String[][] seats , char ticketType){

		Scanner keyboard = new Scanner(System.in);

		if(ticketType == 'f'){

			System.out.print("As for first class only two rows are avaible(1 or 2). Select the row number you want for your seat : ");
		    int i = keyboard.nextInt();

		    System.out.print("As for first class seats avaible are(1 to 6). Select the  number you want for your seat : ");
		    int j = keyboard.nextInt();

		    
		    Boolean flag = true;

	

		if(i <= 2){
			System.out.println("A   B   C   D   E   F");
								
			for(i = 0;i < seats.length;++i){
				for(j = 0 ;j < seats[i].length ; ++j){	
				seats[i-1][j-1] = "X";
				isbooked(seats);

				 System.out.print(seats[i][j] + "   ");
				flag = true;
				}//for
			 System.out.println();
			}//outerfor
		}//if

		else{
			System.out.println("Invalid row for first class !");
			System.out.println("Enter the valid row :");
			i = keyboard.nextInt();

			 seats[i-1][j-1] = "X";

			for(i = 0;i < seats.length;++i){
				for(j = 0 ;j < seats[i].length ; ++j){					
				 System.out.print(seats[i][j] + "   ");
				 isbooked(seats);
				flag = true;
				}//for
			 System.out.println();
			}//outerfor

		}//ELSE

}
	}//userinput

	public static boolean isbooked(String seats[][]){
		int i = 0 , j = 0;
		if(i >= 0 && i < 13 && j >= 0 && j < 6){
			if(seats[i][j]=="*"){
				return true;
			}//if
				return false;
		}//boolean
			return false;
	}


	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int i = 0 , j = 0 ; 

		String[][] seats = new String[13][6];

//		String[] row = new String[13];

		System.out.println("A   B   C   D   E   F");
/*
		for (int k = 0; k < row.length;++k){
			System.out.println("Row " + k);
		}//for
*/
		for (i = 0;i < seats.length ;++i){
			for (j = 0 ;j < seats[i].length ; ++j) {
				seats[i][j] = "*";
				System.out.print(seats[i][j] + "   ");
			}//for
			System.out.println();
		}//outerfor

		System.out.println("Enter the class you want to book (Press e for economy , b for business class , f for first class)");
		char ticketType  = keyboard.next().toLowerCase().charAt(0);
		int k = 1;
		while(k!=0){
		userinput(seats , ticketType);
		System.out.println("repeat? enter 1 for yes and 0 for no.");
		k = keyboard.nextInt();
}//while

		
	}
}