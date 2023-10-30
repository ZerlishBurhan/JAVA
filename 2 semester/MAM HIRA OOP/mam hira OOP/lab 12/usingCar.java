class usingCar{
	public static void main(String[] args) {
		engine e1 = new engine(243,"ewrr",true,1000);
		fuleTank t1 = new fuleTank(213,436);
		car c1 = new car(t1 , e1 , "honda" , 5275, 76.567);

		c1.currentCarState();

	}
}