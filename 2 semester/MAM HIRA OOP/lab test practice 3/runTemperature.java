class runTemperature{
	public static void main(String[] args) {
		temperature t1 = new temperature(67.789);
		temperature t2 = new temperature(767.78);
		System.out.println("DISPLAY TEMP1");
		t1.display();
		System.out.println("DISPLAY TEMP2");
		t2.display();
		System.out.println();
		t1.copy(t2);
		System.out.println("TO STRING REPRESENTATION OF TEMP2");
		System.out.println(t2.toString());
		System.out.println("TO STRING REPRESENTATION OF TEMP1");
		System.out.println(t1.toString());
		System.out.println();
		System.out.println("COMPARE TEMP1 AND TEMP2");
		System.out.println(t2.compare(t1));
		System.out.println();
		System.out.println("CONVERSION IN CELCIUS");
		System.out.println("temperature in celcius = " + t1.getCelciusTemperature());
		System.out.println();
		System.out.println("CONVERSION IN KELVIN");
		System.out.println("temperature in kelvin = " + t1.getKelvinTemperature());
		System.out.println();
		System.out.println("CREATE METHOD");		
		System.out.println(t2.create(t1));
		System.out.println();
	}//main
}//class