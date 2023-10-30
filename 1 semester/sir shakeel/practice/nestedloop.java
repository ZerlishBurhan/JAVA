public class nestedloop{

public static void main(String[] args){

for(int i = 1 ; i<=10;++i){
for(int j = 1 ; j<=i; ++j){
System.out.print("*");
}//for
System.out.println();
}//for


for(int i = 1 ; i <= 10 ; ++i){

for(int j = 10 ; j>i-1;j--){
System.out.print("*");
}
System.out.println();
}//for


for(int i = 1 ; i <= 10 ; ++i){
for(int j = 10 ; j>=i; --j){
System.out.print(" ");

}
for(int j = 1 ; j<=i; ++j){
System.out.print("*");
}
System.out.println();
}//for

for(int i = 1 ; i <= 10 ; ++i){
for(int j = 10 ; j>=i; --j){
System.out.print(" ");

}
for(int j = 1 ; j<=i; ++j){
System.out.print("*");
}
System.out.println();
}//for

/*
System.out.printf("CS-132: Programming Fundamentals\n");

    int m = 99999;
    long n = 98989877;
    float f = 34565.9898F;
    double d = 459649869.487584758;

    System.out.printf("The integer is %d\n", m);
    System.out.printf("The long is %d\n", n);
    System.out.printf("The float is %f\n", f);
    System.out.printf("The double is %f\n", d);

    System.out.printf("%d, %f, %d, %f\n\n", n, d, m, f);

    //System.out.printf("The double is %f\n\n", m);

    System.out.printf("The double is %,f\n", d);
    System.out.printf("The double is %.2f\n", d);
    System.out.printf("The double is %30f\n", d);
    System.out.printf("The double is %030f\n", d);
    System.out.printf("The double is %,030f\n", d);
    System.out.printf("The double is %,030.1f\n\n\n", d);

    System.out.printf("The integer is %,d\n", n);
    System.out.printf("The integer is %,20d\n", n);
    System.out.printf("The integer is %,020d\n", n);
*/

}//main

}//class