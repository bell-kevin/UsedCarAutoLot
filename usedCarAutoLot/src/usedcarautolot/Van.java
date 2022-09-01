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

    @Override
    public String display() {
        return "inventory ID, year, mileage, make, model, color"
                + "numberOfSlidingDoors, entertainmentCenter";
    } // end display method
} // end Van class
