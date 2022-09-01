/** ****************************************************************************
 * Truck.java
 * Kevin Bell
 *
 * This program simulates a Truck.
 **************************************************************************** */
package usedcarautolot;

public class Truck extends Vehicle {

    public int truckBedLength;
    public boolean truckBedLiner;
//******************************************************************************    

    public Truck(int inventoryID, int year, String color, String make,
            String model, int mileage) {
        super(inventoryID, year, color, make, model, mileage);
    } // end constructor method

    public Truck(int inventoryID, int year, String color, String make,
            String model, int mileage, int truckBedLength, boolean truckBedLiner) {
        super(inventoryID, year, color, make, model, mileage);
        this.truckBedLength = truckBedLength;
        this.truckBedLiner = truckBedLiner;
    } // end constructor method
//******************************************************************************

    @Override
    public String display() {
        String result;
        result = inventoryID + ": " + year + ", " + color + ", " + make + ", "
                + model + ", " + "mileage " + mileage + ", " + truckBedLength
                + "' bed length " + truckBedLiner;
        return result;
    } // end display method
} // end Truck class
