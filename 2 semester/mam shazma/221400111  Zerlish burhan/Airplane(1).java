import java.util.Scanner;

class AirplaneSeating{

	public static void userinput(String[][] seats , char ticketType){

		Scanner keyboard = new Scanner(System.in);

		if(ticketType == 'f'){

			System.out.print("As for first class only two rows are avaible(1 or 2). Select the row number you want for your seat");
		    int i = keyboard.nextInt();

		    System.out.print("As for first class seats avaible are(0 to 5). Select the  number you want for your seat");
		    int j = keyboard.nextInt();

		    seats[i][j] = "X";

		    Boolean flag = true;
		    while(!flag){
		if(i <= 2){
			System.out.println("A   B   C   D   E   F");

				for(i = 1;i < seats.length;++i){
				for(j = 0 ;j < seats[i].length ; ++j){					
				System.out.print(seats[i][j] + "   ");
				flag = false ;
			}//for
			System.out.println();
		}//outerfor
		}else{
			System.out.print("Invalid row for first class !");
			System.out.println("Enter the valid row :");
			i = keyboard.nextInt();

		}//ELSE

	}//IF
}//while

	}//userinput



	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int i = 0 , j = 0 ; 

		String[][] seats = new String[13][6];

		System.out.println("A   B   C   D   E   F");

		for (i = 0;i < seats.length ;++i){
			for (j = 0 ;j < seats[i].length ; ++j) {
				seats[i][j] = "*";
				System.out.print(seats[i][j] + "   ");
			}//for
			System.out.println();
		}//outerfor

		System.out.println("Enter the class you want to book (Press e for economy , b for business class , f for first class)");
		char ticketType  = keyboard.next().toLowerCase().charAt(0);

		userinput(seats , ticketType);


		
	}
}