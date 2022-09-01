/** ****************************************************************************
 * Van.java
 * Kevin Bell
 *
 * This program simulates a Van.
 **************************************************************************** */
package usedcarautolot;

public class Van extends Vehicle {

    public int numberOfSlidingDoors;
    public boolean entertainmentCenter;
//******************************************************************************    

    public Van(int inventoryID, int year, String color, String make,
            String model, int mileage) {
        super(inventoryID, year, color, make, model, mileage);
    } // end constructor method

    public Van(int inventoryID, int year, String color, String make,
            String model, int mileage, int numberOfSlidingDoors,
            boolean entertainmentCenter) {
        super(inventoryID, year, color, make, model, mileage);
        this.numberOfSlidingDoors = numberOfSlidingDoors;
        this.entertainmentCenter = entertainmentCenter;
    } // end constructor method
//******************************************************************************

    @Override
    public String display() {
        String result;
        result = inventoryID + ": " + year + ", " + color + ", " + make + ", "
                + model + ", " + "mileage " + mileage + ", "
                + numberOfSlidingDoors + " sliding doors, " + entertainmentCenter;
        return result;
    } // end display method
} // end Van class
