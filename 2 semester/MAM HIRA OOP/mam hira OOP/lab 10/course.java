class Course {
	
	private String code;
	private String name;
	private int credit;

	public Course(){
		setCode("");
		setName("");
		setCredit(0);
	}//default constructor

	public Course(String c, String n, int cr){
		setCode(c);
		setName(n);
		setCredit(cr);
	}//overloaded constructor

	public Course(Course c){
		this.setCode(c.getCode());
		this.setName(c.getName());
		this.setCredit(c.getCredit());
	}//copy constructor

	public void setCode(String c){
		code = c;
	}//setCode()

	public void setName(String n){
		name = n;
	}//setName()

	public void setCredit(int cr){
		credit = cr;
	}//setCredit()

	public String getCode(){
		return code;
	}//getCode()

	public String getName(){
		return name;
	}//getName()

	public int getCredit(){
		return credit;
	}//getCredit()

	public void print(){
		System.out.println("Code: " + getCode());
		System.out.println("Name: " + getName());
		System.out.println("Credits: " + getCredit());
		System.out.println("\n");

	}//print

	public static void print(Course[] c){
		for (int i = 0; i < c.length ; ++i) {
			c[i].print();
		}//for
	}//print()

	public boolean isEqual(Course c){
		return this.getCode().equals(c.getCode()) &&
		this.getName().equals(c.getName()) &&
		this.getCredit() == c.getCredit();
	}//isEqual()

	public static void sort(Course[] c){
		for(int i=0;i<c.length-1;i++){
			int minIndex=getMinIndex(c,i);
			Course temp=c[i];
			c[i]=c[minIndex];
			c[minIndex]=temp;
		}
    	}
   	public static int getMinIndex(Course[] c,int start){
		int minIndex=start;
		Course min=c[start];
		for(int i=start;i<c.length;i++){
			if(c[i].getName().compareTo(min.getName()) < 0){
				min=c[i];
				minIndex=i;
			}
		}
		return minIndex;
    	}

       public static int linearSearch(Course [] c, String key){
        	int index = -1;
        	for (int i = 0; i < c.length ; ++i) {
        		if (c[i].getCode().equals(key)){
        			index = i;
        		}//if
        	}//for
        	return index;
    	}//linearSearch()


	public static int search(Course[] c,String key){

	int start=0;
	int end=c.length-1;
	while(start<=end){
		int mid=(start+end)/2;
		if(c[mid].getName().compareTo(key)==0){
			return mid;
		}
						// s           b
		else if(c[mid].getName().compareTo(key)>0){
			end=mid-1;
		}
		else{
			start=mid+1;
		}
	}
	return -1;
    }



}//class