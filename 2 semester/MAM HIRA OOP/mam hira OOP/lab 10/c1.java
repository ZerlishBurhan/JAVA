class c1{
	private String code;
	private String name;
	private int credits;
// System.out.println("------------setters-------------------");
	public void setCode(String code){
		this.code = code;
	}//set
	public void setName(String name){
		this.name = name;
	}//set
	public void setCredit(int credits){
		this.credits = credits;
	}//set
// System.out.println("--------------getters------------------");	
	public String getCode(){
		return code;
	}//get
	public String getName(){
		return name;
	}//get
	public int getCredits(){
		return credits;
	}//get
	
	public c1(){

	}//0-arg
	public c1(String code, String name, int credits){
		this.code = code;
		this.name = name;
		this.credits = credits;
	}//overloaded-constructor

	public c1(c1 arg){
		this.code = arg.code;
		this.name = arg.name;
		this.credits = arg.credits;
	}//copy-constructor	

	public void print(){
		System.out.println("Course-code : " + code + "\nCourse-name : " + name + "\nCourse-Credits : " + credits);
	}//print

	public static void print(c1[] c){
		for(c1 i : c){
			i.print();
		}	
	}//print

	public boolean isEqual(c1 arg){
		return (this.code.equals(arg.code) && this.name.equals(arg.name) && this.credits==arg.credits);
	}

	public int getMinIndex(c1[] arg , int start){
		int minindex = start;
		c1 min = arg[start];

	for (int i = 0; i<arg.length ; ++i) {
		if(arg[i].getName().compareTo(min.getName())<0){
			min=arg[i];
			minindex = i;
		}
	}//for
	return -1;
	}//getMinIndex

	public void sort(c1[] arg){
		for (int i = 0;i<arg.length ;i++ ) {
		int minIndex = getMinIndex(arg , i);
		c1 temp=arg[i];
		arg[i]= arg[minIndex];
		arg[minIndex] = temp;
		}
	}

	public int linearSearch(c1[] c, String key){
		for (int i =0 ;i < c.length;++i){
			if(c[i].getCode().equals(key)){
				return i; 
			}
		}
		return -1;
	}

	public int binarysearch(c1[] c , String key){
		int low = 0 , high = c.length-1;
		while(low<high){
			int mid = (low+high)/2;
				if(c[mid].getName().compareTo(key)==0){
					return mid;
				}
				else if(c[mid].getName().compareTo(key)<0){
					low = mid+1;
				}
			 	else{
					high = mid -1;
				}
		}
		return -1;
	}

}//class