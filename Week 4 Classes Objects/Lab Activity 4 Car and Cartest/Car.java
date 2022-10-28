/**
 * Car
 * 
 * @version 24/09/2022
 * 
 * @author Zekai Lin
 * 
 * 
 */

public class Car {

    // Part 2: Create a basic Car class:
    // declare the variables
    private String make;
    private int year;
    private double speed;


    /**
     * car constructor
     * 
     * @param make
     * @param year
     */
    public Car(String make, int year) {
        this.speed = 0;
        this.year = year;
        this.make = make;
    }

    

    /**
     * Convert Car into String.
     * 
     * @return Formated String
     * 
     */

    public String toString() {
        return String.format("A %d %s that is going %.1f mph", this.year, this.make, this.speed);
    }

    // Part 4: Refinement:

    /**
     * Accessors 
     * 
     * @retrun attributes 
     */

    public String getMake() {
        return this.make;
    }
    public int getYear() {
        return this.year;
    }
    public double getSpeed() {
        return this.speed;
    }
    
    

    // mutator
    public void accelerate () {
        this.speed+=5;
    }

    public void brake () {
        this.speed+=-5;
    }

    public String prtSpeed () {
        return String.format("The %s that is going %.1f mph", this.make, this.speed);
    }
    
    
}
