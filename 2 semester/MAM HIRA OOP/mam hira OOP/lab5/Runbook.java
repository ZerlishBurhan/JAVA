class Runbook{
	public static void main(String[] args) throws Exception{

		book math = new book();

System.out.println("Enter the specialities of math book :");
		math.input();

		book english = new book();
System.out.println("Enter the specialities of english book : ");
		english.input();


		if(math.getPrice() - english.getPrice() > 0.00000001){
			math.show();	

			}
		else{
			english.show();

		}
		
	}
}