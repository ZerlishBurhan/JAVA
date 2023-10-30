class Arraymethods{

	static void SearchIntegervalue(int[] array,int value){

	boolean flag = false;

	for(int i = 0 ; i < array.length && flag == false ;++i){
	if(array[i]==value){
	System.out.print(value  + " found at " + i);
	flag =true;
	//break;
	}//if
	}//for

 	if(flag==false){
	System.out.print("Value not found!");
	}//if

	}//methods


}//class