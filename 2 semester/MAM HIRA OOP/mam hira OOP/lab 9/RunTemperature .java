public class RunTemperature{
    public static void main(String[] args) {
        // Create objects using different constructors
        Temperature temp1 = new Temperature();
        Temperature temp2 = new Temperature(70.0);

        // Display the initial state of objects
        System.out.println("Object 1:");
        temp1.display();
        System.out.println("\nObject 2:");
        temp2.display();

        // Apply setter methods and change the state of objects
        temp1.setFahrenheit(80.0);
        temp2.setFahrenheit(90.0);

        // Display the updated state of objects
        System.out.println("\nAfter applying setter methods:");
        System.out.println("Object 1:");
        temp1.display();
        System.out.println("\nObject 2:");
        temp2.display();

        // Apply other methods and display results
        System.out.println("\nComparing objects:");
        System.out.println("Object 1 is equal to Object 2: " + temp1.compare(temp2));

        Temperature temp3 = new Temperature();
        temp3.copy(temp1);
        System.out.println("\nCopied Object 1 to Object 3:");
        System.out.println("Object 3:");
        temp3.display();

        System.out.println("\nCreating Object 4 by adding Object 1 and Object 2:");
        Temperature temp4 = temp1.create(temp2);
        System.out.println("Object 4:");
        temp4.display();
    }
}
