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

    @Override
    public String display() {
        return "inventory ID, year, mileage, make, model, color"
                + "truckBedLength, truckBedLiner";
    } // end display method
} // end Truck class
