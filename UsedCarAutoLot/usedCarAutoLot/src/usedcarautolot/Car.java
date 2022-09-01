/** ****************************************************************************
 * Car.java
 * Kevin Bell
 *
 * This program simulates a Car.
 **************************************************************************** */
package usedcarautolot;

public class Car extends Vehicle {

    public int numberOfDoors;
    public boolean tintedWindows;
//******************************************************************************

    public Car(int inventoryID, int year, String color, String make,
            String model, int mileage) {
        super(inventoryID, year, color, make, model, mileage);
    } // end constructor method

    public Car(int inventoryID, int year, String color, String make,
            String model, int mileage, int numberOfDoors,
            boolean tintedWindows) {
        super(inventoryID, year, color, make, model, mileage);
        this.numberOfDoors = numberOfDoors;
        this.tintedWindows = tintedWindows;
    } // end constructor method
//******************************************************************************    

    public boolean isTinted() {
        if (isTinted) {
            return "tinted windows";
        } else {
            return "no tinted windows";
        }
    } // end isTinted method

    @Override
    public String display() {
        String result;
        result = inventoryID + ": " + year + ", " + color + ", " + make + ", "
                + model + ", " + "mileage " + mileage + ", " + numberOfDoors
                + " doors, " + tintedWindows;
        return result;
    } // end display method
} // end Car class
