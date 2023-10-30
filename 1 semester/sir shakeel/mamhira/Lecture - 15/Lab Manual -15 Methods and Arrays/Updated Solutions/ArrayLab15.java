import java.util.Arrays;

public class ArrayLab15 {


	public static void main(String[] args) {

		int[] hours = new int[5];

		hours[0] = 40;
		hours[1] = 45;
		hours[2] = 55;
		hours[3] = 35;
		hours[4] = 47;


		for (int i = 0; i < hours.length ; i++) {
			System.out.println("Hours of employee " + (i + 1)  + " are: " + hours[i]);
		}//for

		
	}//main
	


}//class