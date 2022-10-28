/**
 * Flower
 * 
 * @author Zekai Lin
 * 
 * @version Oct.2 2022
 * 
 */
public class Flower extends Plant {

    private boolean isAnnual;
    private String colorOfFlower;

    public void setPlantType (boolean userIsAnnual) {
        this.isAnnual = userIsAnnual;
    }
    public Boolean getPlantType () {
        return this.isAnnual;
    }

    public void setColorOfFlowers (String userColorOfFlower) {
        this.colorOfFlower = userColorOfFlower;
    }

    public String getColorOfFlowers () {
        return this.colorOfFlower;
    }

    public void printInfo () {
        System.out.println("Plant Information: ");
        System.out.println("   Plant name: " + plantName);
        System.out.println("   Cost: " + plantCost);
        System.out.println("   Annual: " + isAnnual);
        System.out.println("   Color of flowers: " + colorOfFlower);
    }
    
}