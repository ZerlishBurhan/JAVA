public class CelsiusToKelvinLab8
{
	public static void main (String[] args)
	{

		System.out.println("Celsius | Kelvin\n--------+-----------");
		int tc  = 0;
		while (tc <= 100){
			System.out.println(tc + "\t\t" + (tc + 273.15));
			tc += 10;
		}//while
	 
	}//main
}//class