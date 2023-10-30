/*
  Lecture - 29
  Arrays and Methods
  05-04-2023
*/

class ArrayMethodsTest {

  public static void main(String[] args) {

    int value = 30;

    int[] numbers = { 20, -1, 0, 2, 30, 15, 60 };    

    ArrayMethods.searchIntegerValue(numbers, value);

    value = -30;

    ArrayMethods.searchIntegerValue(numbers, value);

    String s = "GIFT";

    String[] names = { "gift", "Gift", "GIft", "GIFt", "GIFT" };   

    int index = ArrayMethods.searchStringValue(names, s);    

    if(index != -1) {
      System.out.println(s + " found at index " + index);
    } else {
      System.out.println(s + " not found");
    }//if

    s = "GIFTian";

    index = ArrayMethods.searchStringValue(names, s);    

    if(index != -1) {
      System.out.println(s + " found at index " + index);
    } else {
      System.out.println(s + " not found");
    }//if





  }//main

}//class