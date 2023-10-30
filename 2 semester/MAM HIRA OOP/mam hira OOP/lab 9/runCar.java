class runCar{
	public static void main(String[] args) {
		car c1 = new car();
		car c2 = new car(7869 , "abcd" , 555);

		
		System.out.println(c1.isNotEqual(c2));
		System.out.println();
		c1.copy(c2);
		System.out.println(c1);
		System.out.println();
		System.out.println(c2);
		System.out.println();
		// System.out.println(c2.compare(c1));
		// c1.setSpeed(78);
		// c1.acelerate();
		// System.out.println(c1.toString());

	}//mian
}//class