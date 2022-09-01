/** ****************************************************************************
 * Vehicle.java
 * Kevin Bell
 *
 * This base/super program simulates a Vehicle.
 **************************************************************************** */
package usedcarautolot;

class Vehicle {

    int inventoryID, year, mileage;
    String make, model, color;
//******************************************************************************

    public Vehicle() {
    } // end zero-parameter constructor

    public Vehicle(int inventoryID, int year, String color, String make,
            String model, int mileage) {
        this.color = color;
        this.inventoryID = inventoryID;
        this.make = make;
        this.mileage = mileage;
        this.model = model;
        this.year = year;
    } // end constructor
//******************************************************************************

    public String display() {
        String result;
        result = inventoryID + ": " + year + ", " + color + ", " + make + " "
                + model + ", " + "mileage " + mileage + ", ";
        return result;
    } // end display method
} // end Vehicle class
