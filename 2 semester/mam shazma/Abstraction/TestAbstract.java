public class TestAbstract
{
	public static void main(String[] args){

		// Shape obj = new Shape(); //Uncomment this and see the result
		Rectangle r = new Rectangle("Y", 11, 22);

		System.out.println(r.area());

		r.myMethod1();
		r.myMethod2();

	}
}