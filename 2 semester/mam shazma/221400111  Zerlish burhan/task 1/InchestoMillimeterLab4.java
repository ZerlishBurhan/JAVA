public class InchestoMillimeterLab4{

   public static void main(String[] args){

    final double LENGTH=8.5;
   
    final double WIDTH=11;

    final double millimetersperinch=25.4;

    double dimensions=(LENGTH*WIDTH)*millimetersperinch;

    double PerimeterOfRectangle=2*(LENGTH+WIDTH);

    double PerimeterOfDiagonal=Math.sqrt(Math.pow(LENGTH,2)+ Math.pow(WIDTH,2));


    System.out.println("Dimension of sheet in Millimeters:"+ dimensions);

    System.out.println("Peremiter of Sheet:"+PerimeterOfRectangle);

    System.out.println("Perimeter of Diagonal:"+PerimeterOfDiagonal);



  }


}