import java.util.Scanner;

public class primenumber{

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter a number");
int num = keyboard.nextInt();

int count = 0;
for(int i = 2 ; i<=num/i ; ++i){
if(num%i==0){
count++;
}
}
if(count==0){
System.out.print("prime");
}else{
System.out.print(" not prime");
}

}//main

}//class