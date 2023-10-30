class Box3D{
	
	private double length;
	private double width;
	private double height;
	private String color;

	public Box3D(){
		setLength(0.0);
		setWidth(0.0);
		setHeight(0.0);
		setColor("");
	}//default constructor

	public Box3D(double l, double w, double h, String c){
		setLength(l);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}//overloaded constructor

	public Box3D(Box3D b){
		setLength(b.getLength());
		setWidth(b.getWidth());
		setHeight(b.getHeight());
		setColor(b.getColor());
	}//copy constructor

	public void setLength(double l){
		length = l;
	}//setLength()

	public void setWidth(double w){
		width = w;
	}//setWidth()

	public void setHeight(double h){
		height = h;
	}//setheight()

	public void setColor(String c){
		color = c;
	}//setcolor()

	public double getLength(){
		return length;
	}//getLength()

	public double getWidth(){
		return width;
	}//getWidth()

	public double getHeight(){
		return height;
	}//getheight()

	public String getColor(){
		return color;
	}//getcolor()

	public void print(){
		System.out.println("Length: " + getLength());
		System.out.println("width: " + getWidth());
		System.out.println("Height: " + getHeight());
		System.out.println("Color: " + getColor());
		System.out.println("Area: " + area());
		System.out.println("\n");
	}//print

	public static void print(Box3D[] b){
		for (int i = 0; i < b.length ; ++i) {
			b[i].print();
		}//for
	}//print()

	public boolean isEqual(Box3D b){
		return this.getLength() == b.getLength() &&
		this.getWidth() == b.getWidth() &&
		this.getHeight() == b.getHeight() &&
		this.getColor().equals(b.getColor());
	}//isEqual()

	public double area(){
		return this.getLength() * this.getWidth() * this.getHeight();
	}//area()



	public static void sort(Box3D[] b){
		for(int i=0;i<b.length-1;i++){
			int minIndex=getMinIndex(b,i);
			Box3D temp=b[i];
			b[i]=b[minIndex];
			b[minIndex]=temp;
		}
    	}
   	public static int getMinIndex(Box3D[] b,int start){
		int minIndex=start;
		Box3D min=b[start];
		for(int i=start;i<b.length;i++){
			if(b[i].area()- min.area() < 0.000001){
				min=b[i];
				minIndex=i;
			}
		}
		return minIndex;
    	}
    public static int linearSearch(Box3D [] b, String key){
        int index = -1;
        for (int i = 0; i < b.length ; ++i) {
        	if (b[i].getColor().equals(key)){
        		index = i;
        	}//if
        }//for
        return index;
    }//linearSearch()

    public static void search(Box3D[] b, double key){
    	int count=0;
        for (int i = 0; i < b.length ; ++i) {
        	if (b[i].area() >= key){
			count++;
        		b[i].print();
        	}//if
        }//for

        if(count == 0){
        	System.out.println("No Object Found.");
        }//if
    }//search()

}//class