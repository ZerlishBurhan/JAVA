

public class array{


    static void printcommon(int[] array1, int[] array2){
int count = 0; 
                for(int i=0 ; i < array1.length; ++i){
    for(int j=0 ; j < array2.length; ++j){
 
       
  
        if(array1[i]==array2[j]){
          
System.out.print(array1[i]+ ", ");
        }

        }

    }

        }
        
public static void main(String[] args){

  int[] array1 = { 4 , 2 , 3 , 17, 19, 12, 16, 7 , 100};
  int[] array2 ={3, 9 , 5 , 12, 6 ,17 ,8 , 7 , 0 };
    printcommon(array1 , array2 );

    }
    }   