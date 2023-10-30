public class RunBox3D{
	public static void main(String[] args){
		final int SIZE = 6;
		Box3D[] b = new Box3D[SIZE];

		b[0] = new Box3D();
		b[1] = new Box3D(2.4, 3.5, 4.6, "Green");
		b[2] = new Box3D(5.8, 6.7, 5.8, "Blue");
		b[3] = new Box3D(4.6, 8.4, 2.9, "Red");
		b[4] = new Box3D(2.0, 6.0, 3.6, "Pink");
		b[5] = new Box3D(b[4]);

		System.out.println("Displaying all Boxes:");
		Box3D.print(b);

		if(b[5].isEqual(b[4])){
            System.out.println("\n\nBox #6 and Box #5 are equal.");
        }
        else{
            System.out.println("\n\nbox #6 and Box #5 are not equal.");
        }//if

		String keyToSearch = "Blue";
		int index = Box3D.linearSearch(b, keyToSearch);
        if (index != -1){
            System.out.println("\n\nThe key " + keyToSearch + " is found at index # " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + keyToSearch + " not found.");
        }//if

        System.out.println("\n\nSortng the Box3D array...");
        Box3D.sort(b);
        System.out.println("\n\nDisplaying all Boxes after sorting:");
        Box3D.print(b);

	 	double key = 43.0;
        System.out.println("\n\nBoxes which have area greater than or equal to " + key);
	    Box3D.search(b, key);        

	}//main
}//class