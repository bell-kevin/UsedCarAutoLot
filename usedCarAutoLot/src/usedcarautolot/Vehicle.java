/** ****************************************************************************
 * Vehicle.java
 * Kevin Bell
 *
 * This base/super program simulates a Vehicle.
 **************************************************************************** */
package usedcarautolot;

class Vehicle {

    private int inventoryID, year, mileage;
    private String make, model, color;
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
        return "inventory ID, year, color, make, model, mileage";
    } // end display method
} // end Vehicle class
