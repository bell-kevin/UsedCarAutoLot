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
        /* if (isTinted) {
            return "tinted windows";
        } else {
            return "no tinted windows";
        } */
        return true;
    } // end isTinted method

    @Override
    public String display() {
        String result;
        result = super.display() + numberOfDoors + " doors, ";
        if (tintedWindows) {
            result += "tinted windows";
        } else {
            result += "no tinted windows";
        } // end if/else condition
        return result;
    } // end display method
} // end Car class
