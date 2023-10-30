/*
  Lecture - 24
  String
  16-03-2023
*/

class StringExample2 {

  public static void main(String[] args) {

//    String s1 = "GIFT University";
//    String s2 = " Gujranwala";

  //  String s3 = s1.concat(s2);
//    System.out.println(s3);

//    boolean answer = s3.startsWith("GIFT");
  //  System.out.println(answer);

//    answer = s3.startsWith("AI");
  //  System.out.println(answer);

//    String s4 = s3.substring(5);
//    System.out.println(s4);

//    String s5 = s3.substring(5, 14);
//    System.out.println(s5);

//    String s6 = s3.substring(5, 15);
//    System.out.println(s6);

//    String a = "abc";
//    String b = "abc";
//    String c = "ABC";
//    String d = "cba";

//    answer = a.equals(b);
//    System.out.println(answer);

//    answer = a.equals(c);
//    System.out.println(answer);

//    answer = a.equals(d);
//    System.out.println(answer);

	String s = "GIFT University Gujranwala";

    System.out.println(s);
    System.out.println("Length: " + s.length());

    int len = s.length();
    System.out.println("Length: " + len);

    for(int i = 0; i <= s.length() - 1; ++i) {
      char c = s.charAt(i);
      System.out.print(c + ", ");
    }//for
    System.out.println();

    //System.out.println(s.charAt(s.length()));
    System.out.println(s.charAt(s.length() - 1));

    for(int i = s.length()-1; i >= 0; --i) {
      char c = s.charAt(i);
      System.out.print(c + ", ");
    }//for
    System.out.println();

    String s2 = s.toLowerCase();
    String s3 = s.toUpperCase();

    System.out.println(s2);
    System.out.println(s3);

    int location = s.indexOf('j');
    System.out.println("j is located at: " + location);



  }//main    

}//class