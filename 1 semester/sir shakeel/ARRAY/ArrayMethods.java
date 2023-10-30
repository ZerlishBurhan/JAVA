/*
  Lecture - 29
  Arrays and Methods
  05-04-2023
*/

class ArrayMethods {

  // search for an integer value in array using linear search
  static void searchIntegerValue(int[] array, int value) {
    boolean flag = false;

    for(int i = 0; i < array.length && flag == false; ++i) {
      // check if value exists?    
      if(array[i] == value) {
        System.out.println(value + " found at index " + i);	
        flag = true;
        // break;
      }//if	
    }//for
    
    // value not found
    if(flag == false) {
      System.out.println(value + " not found!");	
    }//if    
	
  }//searchIntegerValue

  // search for an String value in array using linear search
  // returns index if value is found, otherwise returns -1
  static int searchStringValue(String[] array, String value) {
    for(int i = 0; i < array.length; ++i) {
      // check if value exists?    
      if(array[i].equals(value)) {
        return i;	
      }//if	
    }//for
    
    // value not found
    return -1;
		
  }//searchStringValue

}//class