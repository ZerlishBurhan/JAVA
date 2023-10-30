import java.util.Scanner;

   public class Array{

     public static void main(string[] args){

      Scanner read = new Scanner(system.in);
    System.out.println("enter the first row");
  int row = read.nextInt();

   System.out.println("enter the first col");
   int col = read.nextInt();
    int[][] array = new int[row][col];
   printArray(array);
   replaceNegativeWithZero(array);
}//main 
  public static void printArray(int[][] array){
    for(int row=0; row<array.length;row++){
     for(int col=0; col<array[row].length; col++){

     System.out.println([row][col]);


}




}   


}//fillarray

  public static void replaceNegativeWithZero(int[][] array){
   for(int row=0; row<array.length; row++){
    for(int col =0; col<array[row].length;col++){

     if(array[row][col<0]){

       array[row][col]==0;
}


}



}


   







}//average



}//class
