/** ****************************************************************************
 * UsedCarAutoLot.java
 * Kevin Bell
 *
 * This driver program simulates a Used Car Auto Lot.
 **************************************************************************** */
package usedcarautolot;

import java.util.*;

public class UsedCarAutoLot {

    public static void main(String[] args) {
        System.out.println("Chapter 14 Used Car Auto Lot by Kevin Bell \n");
        System.out.println("Inventory on our Car Lot");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(12345, 2010, "silver", "Honda", "Civic", 75000, 2,
                true));
        vehicles.add(new Van(88774, 2012, "gray", "Dodge", "Caravan", 120000, 1,
                false));
        vehicles.add(new Car(98767, 1997, "blue", "BMW", "316i", 126000, 4,
                false));
        vehicles.add(new Truck(55661, 1995, "red", "Datsun", "pickup", 250000,
                8, true));
        vehicles.add(new Car(34981, 2019, "white", "Tesla", "Model 3", 5000, 2,
                true));
        vehicles.add(new Car(78126, 2017, "red", "Toyota", "Camry", 12000, 4,
                false));
        vehicles.add(new Van(89523, 2015, "gray", "Kia", "Sedona", 62000, 2,
                true));
        vehicles.add(new Truck(11228, 2015, "black", "Ford", "F150", 50000, 12,
                false));
        vehicles.add(new Van(71715, 2014, "white", "Honda", "Odyssey", 100000,
                2, true));
        //Use a For-Each loop to go through the Array List and display vehicles
        vehicles.forEach((Vehicle vehicle) -> {
            String typeOfVehicle = " ";
            if (vehicle instanceof Car) {
                typeOfVehicle = "Car ";
            } else if (vehicle instanceof Truck) {
                typeOfVehicle = "Truck ";
            } else if (vehicle instanceof Van) {
                typeOfVehicle = "Van ";
            } // end if/else if conditions
            System.out.println(typeOfVehicle + vehicle.display());
        }); // for-each loop
        System.out.println("");
        boolean inputValid = false;
        String userInput = "";
        do {
            System.out.print("Are you interested in cars (C), trucks (T), or "
                    + "vans (V)?: ");
            Scanner computerKeyboardInput = new Scanner(System.in);
            userInput = computerKeyboardInput.nextLine().toLowerCase();
            if ("c".equals(userInput) || "t".equals(userInput)
                    || "v".equals(userInput)) {
                inputValid = true;
            } else {
                System.out.println("bad input, try again");
            } // end if/else statement
        } while (!inputValid); // end while loop   
        for (Vehicle automobile : vehicles) {
            switch (userInput) {
                case "c":
                    if (automobile instanceof Car) {
                        System.out.println("Car " + automobile.display());
                    } // end if/else conditions
                    break;
                case "t":
                    if (automobile instanceof Truck) {
                        System.out.println("Truck " + automobile.display());
                    } // end if/else conditions
                    break;
                // end if/else conditions
                case "v":
                    if (automobile instanceof Van) {
                        System.out.println("Van " + automobile.display());
                    } // end if/else conditions
                    break;
                default:
                    break;
            } // end if/else conditions
        } // end for-each loop
    } // end main method
} // end UsedCarAutoLot class
