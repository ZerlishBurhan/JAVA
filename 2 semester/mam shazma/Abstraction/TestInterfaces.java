/*
 * Creation Date:  24 March, 2020.
 * Last Modified:  06 June, 2020.
 *
 *Purpose:  Inheritance
            e.g.,
            1) Testing Interface class
            2) Remember: An Interface class cannot be instantiated.
            
*/

public class TestInterfaces
{
	public static void main(String[] args)
	{
		Student std1 = new Student(3.5,5);
		Student std2 = new Student(3.5,5);
		Student std3 = new Student(2.6,3);
	
		Rectangle1 rect1 = new Rectangle1(2.4,2.4);
		Rectangle1 rect2 = new Rectangle1(2.4,2.4);
		Rectangle1 rect3 = new Rectangle1(3.4,3.4);

		System.out.println("std1 isEqual std2? " + std1.isEqual(std2));
		System.out.println("std1 isLess std2? " + std1.isLess(std2));
		System.out.println("std3 isGreater std2? " + std3.isGreater(std2));
		

		System.out.println("rect1 isEqual rect3? " + rect1.isEqual(rect3));
		System.out.println("rect1 isLess rect3? " + rect1.isLess(rect3));
		System.out.println("rect3 isGreater rect2? " + rect3.isGreater(rect2));
				
	}
}//class