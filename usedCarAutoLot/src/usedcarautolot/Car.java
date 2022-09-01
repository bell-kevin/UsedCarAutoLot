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

    @Override
    public String display() {
        return "inventory ID, year, mileage, make, model, color, "
                + "numberOfDoors, tintedWindows";
    } // end display method
} // end Car class
