/**
 * CarTester
 * 
 * @version 24/09/2022
 * 
 * @author Zekai Lin
 * 
 * 
 */

public class CarTester {
    public static void main(String[] args) {
        
        // Part 3: Test your Car.

        // Create the Cars Objects.
        Car car1;
        Car car2;

        // Declare the cars.
        car1 = new Car("Ford", 1997);
        car2 = new Car("Toyota", 2014);

        // print the car informations.
        System.out.println(car1); // this can be written as System.out.println(car1);
        System.out.println(car2); // this can be written as System.out.println(car2);


        // Part 5: Testing the refinement:

        // Accelerate the Car1
        for (int i=0; i < 5; i++) {

            // accelerate the first cart.
            car1.accelerate();
            System.out.println(car1.prtSpeed());
            
        }

        // Accelerate the Car2
        for (int i=0; i < 3; i++) {

            // accelerate the second cart.
            car2.accelerate();
            System.out.println(car2.prtSpeed());
            
        }

        // Brake cart1
        for (int i=0; i < 5; i++) {

            // accelerate the first cart.
            car1.brake();
            System.out.println(car1.prtSpeed());
        }

        // Print the result.
        System.out.println();
        System.out.println(car1);
        System.out.println(car2);

    }
}
