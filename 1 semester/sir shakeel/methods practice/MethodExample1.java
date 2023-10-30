/*
  Lecture - 21
  Methods - non-returning methods
  01-03-2023
*/

class MethodExample1 {
  
  //             formal parameters
  static void sum(int number1, int number2) {
    int result = number1 + number2;
    System.out.println("Result is: " + result);
  } //sum 

  static void sum2(double number1, double number2) {
    double result = number1 + number2;
    System.out.println("Result is: " + result);
  } //sum2 

  static void sum3(int number1, double number2) {
    double result = number1 + number2;
    System.out.println("Result is: " + result);
  } //sum3 

  static void sum4(int number1, double number2, String number3) {
    //String result = number1 + number2 + number3;
    String result = number3 + number2 + number1;
    System.out.println("Result is: " + result);
  } //sum 


  public static void main(String[] args) {

    // method call / calling a method													
    sum(10, 20);	// actual parameters / arguments	

    int n1 = 100, n2 = -500;
    sum(n1, n2); 

    sum(100, -500);	

    double number1 = 10.098, number2 = 100.99;
    sum2(number1, number2);

    sum3(1, 0.01);
    sum3(5, 5);

    sum4(5, 10.99, "Hello");

  }//main

}//class