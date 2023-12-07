
// Define a class called "Car"
class Car {
    // Instance variables
    String brand;
    String color;
    int year;

    // Constructor
    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class
public class OopsBasic {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", "Red", 2022);

        // Call the displayInfo() method to display car information
        myCar.displayInfo();
    }
}
