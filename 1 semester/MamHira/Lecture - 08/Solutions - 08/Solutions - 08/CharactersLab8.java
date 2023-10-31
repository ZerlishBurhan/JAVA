0public class CharactersLab8
{
	public static void main (String[] args)
	{

		System.out.println("All uppercase letters.");
		char c = 'A';
		while (c <= 'Z'){
			System.out.print(c + " ");
			++c;
		}//while

		System.out.println("\n\nAll lowercase letters.");
		c = 'a';
		while (c <= 'z'){
			System.out.print(c + " ");
			++c;
		}//while

		System.out.println("\n\nAll uppercase letters between E and T.");
		c = 'E';
		while (c <= 'T'){
			System.out.print(c + " ");
			++c;
		}//while

		System.out.println("\n\nAll lowercase letters starting from a and skipping two letters.");
		c = 'a';
		while (c <= 'z'){
			System.out.print(c + " ");
			c += 3;
		}//while	

		System.out.println("\n\nAll uppercase letters from Z to K.");
		c = 'Z';
		while (c >= 'K'){
			System.out.print(c + " ");
			--c;
		}//while	

	}//main
}//class