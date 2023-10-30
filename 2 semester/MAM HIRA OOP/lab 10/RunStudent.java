public class RunStudent{

    public static void main(String[] args) {
       final int SIZE = 6;
        Student[] s = new Student[SIZE];
        s[0] = new Student();
        s[1] = new Student(101, "Ali", "Akbar", 2.95);
        s[2] = new Student(123, "Abdullah", "Javed", 3.01);
        s[3] = new Student(235, "Umar", "Jamal", 3.45);
        s[4] = new Student(398, "Usman", "Ali", 3.68);
        s[5] = new Student(s[2]);

        System.out.println("Displaying all students:");
        Student.print(s);
        
        if(s[5].isEqual(s[2])){
            System.out.println("\n\nStudent #3 and Student #6 are equal.");
        }
        else{
            System.out.println("\n\nStudent #3 and Student #6 are not equal.");
        }//if
        
        int keyToSearch = 398;
        
        int index = Student.linearSearch(s, keyToSearch);
        if (index != -1){
            System.out.println("\n\nThe key " + keyToSearch + " is found at index # " + index + ".");
            System.out.println("Displaying the student:");
            s[index].print();
        }
        else{
            System.out.println("\n\nThe key " + keyToSearch + " not found.");
        }//if
	System.out.println();
        Student.search(s,keyToSearch);
        System.out.println("\n\nSortng the student array...");
        Student.sort(s);
        System.out.println("\n\nDisplaying all students after sorting:");
        Student.print(s);
       
        double key = 3.68;
        index = Student.search(s, key);
        if (index != -1){
            System.out.println("\n\nThe key " + key + " is found at index " + index + ".");
        }
        else{
            System.out.println("\n\nThe key " + key + " not found.");
        }//if
         
    }
    
}