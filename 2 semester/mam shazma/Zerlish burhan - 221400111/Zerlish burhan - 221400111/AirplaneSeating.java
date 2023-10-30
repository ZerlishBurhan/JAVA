import java.util.Scanner;
public class AirplaneSeating{

private static void printArray(char[][] seat) {
    System.out.print("A B C D E F");
    for (int i = 0; i < seat.length; i++) {
        System.out.print(" Row " + (i + 1));
        for (int j = 0; j < seat[i].length; j++) {
            System.out.print(" " + seat[i][j]);
        }
    }
}

private static boolean bookSeat(char[][] seat , int k, int j, int col) {
    for (int i = k; i < j; i++) {
        if (seat[i][col - 1] == '*'){
            seat[i][col - 1] = 'X';
            System.out.println("Your seat has been booked at Row [" + (i + 1) + "] and seat [" + col + "]. Please confirm it.");
            return true;
        }
    }
    return false;
}

public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("This is a list of book seats in airplane.");
    char[][] seat = 		 
                  		  {{'*','*','X','*','X','X'},
				  {'*','X','*','X','*','X'},
				  {'*','*','X','X','*','X'},
				  {'X','*','X','*','X','X'},
				  {'*','X','*','X','*','*'},
				  {'*','X','*','*','*','X'},
				  {'X','*','*','*','X','X'},
				  {'*','X','*','X','X','*'},
				  {'X','*','X','X','*','X'},
				  {'*','X','*','X','X','X'},
				  {'*','*','X','*','X','*'},
				  {'*','*','X','X','*','X'},
				  {'*','*','*','*','X','*'},};
    printArray(seat);

    int a = 0;
    do {
        System.out.println("\n\nWhat class do you want to sit in...\n1. First Class\n2. Business Class\n3. Economy Class");
        a = read.nextInt();
    } while (a != 1 && a != 2 && a != 3);

    	int seatR = 0;
        System.out.println("Enter number for the seat you want to sit between 1 to 6");
        seatR = read.nextInt();

    boolean flag = false;
    if (a == 1) {
        flag = bookSeat(seat, 0, 2, seatR);
    } else if (a == 2) {
        flag = bookSeat(seat, 2, 7, seatR);
    } else if (a == 3) {
        flag = bookSeat(seat, 7, 13, seatR);
    }

    if (flag) {
        printArray(seat);
    } else {
        System.out.println("This seat is not available");
    }
}
}