# UsedCarAutoLot
In this project, simulate a used car auto lot. There are 3 types of vehicles – cars, trucks, and another one that you choose. For these instructions, that choice is a Minivan – you may use that or select another type of vehicle. The output from this project will first list all of the inventory, then ask the user what type of car they are interested. It will display all of the vehicles that match the user's choice.

Notice the similarities between the types of vehicles. All have an inventory number, like 12345, a year, make, model, color, and mileage. Then there are differences. All cars have number of doors and whether or not they have tinted windows. All trucks have bed length and whether or not they have a bed liner. All minivans have number of sliding doors and whether or not they have an entertainment center.

All of these vehicles have many similar characteristics, so use a Vehicle class for those shared characteristics. The Car, Truck, and Minivan classes inherit those characteristics as well as including at least 2 others that are specific to each class.

Vehicle class instance variables: inventory ID, make, model, color, year, and mileage
Car class additional instance variables: number of doors, tinted windows (Boolean)
Truck class additional instance variables: bed length, bedliner (Boolean)
Minivan class additional instance variables: number of sliding doors, entertainment center (Boolean) – remember, this is your choice of vehicle type, this Minivan is just an example
In the Vehicle class, include a display method that returns a String that lists all the common variables. In each of the child classes, include display methods that call the super class display method and add to that String with the specific instance variables for that type of vehicle.

In the driver code, create an Array List that holds the data for all of the vehicles on the lot. Remember that if an Array List is declared with the type of a super class, it can contain instances of all the child types. Instantiate at least 2 of each type of vehicle, but each type of vehicle must have a different number of objects. In the example, there are 4 cars, 2 trucks and 3 minivans, for example. You will hard-code those instantiations in the driver code. When you add them to the Array List, do not put them in vehicle order -- that is, don't put all the cars together, then all the trucks, then minivans. Mix them up. Look at the examples above, where you see car, minivan, car truck, car, car, etc.

Use a For-Each loop to go through the Array List and display all of the inventory of the auto lot. Using the "instanceof" operator, determine the type of the vehicle to be able to put the identifying word at the beginning of the output for the display. That is, if the vehicle is an instance of "car", then the display starts with "Car", followed by the ID number, year, color, make, model, and so on -- look at the examples above to see how to put the string together. 

After displaying the inventory, ask the user what type of vehicle they want to see. Accept upper- or lowercase letters to select the type of vehicle. Use another For-Each loop to check if the vehicle is an instance of that selected type of vehicle. For example, if the user selected "c" for Car, in the For-Each loop, check if the individual object is an instance of a car, and if it is, display it; if not, don't do anything with it.

Notes:

You must use a For-Each loop to display all of the vehicles in the Array List with the correct first word for the type of car.
Notice the foot marker for the length of the truck bed in the output, be sure to include it.
You must have different numbers of each type of vehicle (like 4 cars, 2 trucks, 3 minivans).
You must add the objects to the array list in jumbled order, not all cars together, then all trucks, etc. -- mix them up when adding them to the array list.
Run the project 3 times, asking for each of the different types of vehicles, and take a screenshot of the result, like the examples above. Take screenshots of the code.

 

Submission:the specified screenshots and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.
