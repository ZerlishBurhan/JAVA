public class Temperature {
    private double ftemp; // Fahrenheit temperature

    // Default constructor
    public Temperature() {
        ftemp = 0.0;
    }

    // One-argument overloaded constructor
    public Temperature(double fahrenheit) {
        ftemp = fahrenheit;
    }

    // Display method
    public void display() {
        System.out.println("Fahrenheit temperature: " + ftemp);
        System.out.println("Celsius temperature: " + getCelsius());
        System.out.println("Kelvin temperature: " + getKelvin());
    }

    // Copy method
    public void copy(Temperature t) {
        this.ftemp = t.ftemp;
    }

    // toString method
    public String toString() {
        return "Fahrenheit temperature: " + ftemp + "\nCelsius temperature: " + getCelsius() + "\nKelvin temperature: " + getKelvin();
    }

    // Compare method
    public boolean compare(Temperature t) {
        return this.ftemp == t.ftemp;
    }

    // Set Fahrenheit temperature
    public void setFahrenheit(double fahrenheit) {
        this.ftemp = fahrenheit;
    }

    // Get Fahrenheit temperature
    public double getFahrenheit() {
        return ftemp;
    }

    // Get Celsius temperature
    public double getCelsius() {
        return (5.0 / 9.0) * (ftemp - 32);
    }

    // Get Kelvin temperature
    public double getKelvin() {
        return ((5.0 / 9.0) * (ftemp - 32)) + 273;
    }

    // Check if two objects have the same state
    public boolean isEqual(Temperature t) {
        return this.ftemp == t.ftemp;
    }

    // Create a new Temperature object with the sum of Fahrenheit temperatures of two objects
    public Temperature create(Temperature t) {
        double sum = this.ftemp + t.ftemp;
        return new Temperature(sum);
    }
}
