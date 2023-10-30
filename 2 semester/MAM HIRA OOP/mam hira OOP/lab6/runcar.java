import java.util.Scanner;

class runcar {

	public static void main(String[] args) {
		
		car obj = new car();

		obj.setspeed(88);
		obj.accelerate();
		obj.brake();

		obj.setyearModel(2001);
		System.out.println(obj.getyearModel());

		obj.setmake("tayota");
	System.out.println(obj.getmake());


	}
}