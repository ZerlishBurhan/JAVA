import java.util.Scanner;

class ArrayExample6 {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    // create an integer array        
    int[] list = new int[10];

    // display the memory location / address (base address)
    System.out.println(list);

    //display the length of the array 
    System.out.println(list.length);

    //display the values of an array (default values)
    System.out.println(list[0]);
    System.out.println(list[1]);
    System.out.println(list[9]);

    // change the values of an array
    list[0] = -123;
    list[4] = 123575;
    list[9] = 1234;

    System.out.println(list[0]);
    System.out.println(list[4]);
    System.out.println(list[9]);

    for(int i = 0; i < list.length; ++i) {
      System.out.print(list[i] + ", ");
    }//for
    System.out.println();

    for(int i = 0; i < list.length; ++i) {
      System.out.print("Enter an integer: ");
      //int var = reader.nextInt();
      //list[i] = var;
      list[i] = reader.nextInt();
    }//for
    System.out.println();

    for(int i = 0; i < list.length; ++i) {
      System.out.print(list[i] + ", ");
    }//for
    System.out.println();

    list[0] *= 10;
    list[1] = list[2] + list[3];



  }//main

}//class