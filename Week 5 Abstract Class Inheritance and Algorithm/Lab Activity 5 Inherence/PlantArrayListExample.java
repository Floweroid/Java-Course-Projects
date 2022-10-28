import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample
{
   // Method prints an ArrayList of objects                                                       
   public static void printArrayList(ArrayList<Plant> myGarden) {
      int i;
      
      for (i = 0; i < myGarden.size(); ++i) {
         myGarden.get(i).printInfo();
         System.out.println();
      }
   }

   
   public static void main(String[] args) 
   {
      Scanner scnr = new Scanner(System.in);
    
     
      // TODO
      // Declare an ArrayList called myGarden to store Plant objects.
      // Note: Since Plant is the base class and Flower is the derived class, 
      // the Arraylist declared to store Plant will be able to refer to  either Plant object or Flower object.
      // See the slide deck for Inheritance and polymorphism if you need to revise these concepts.
      ArrayList<Plant> myGarden = new ArrayList<Plant>();
      
      
      String plantName, plantCost;
      String flowerName, flowerCost, colorOfFlowers;
      boolean isAnnual;
      String input;
      
      input = scnr.next();
      while(!input.equals("-1"))
      {
         
         if (input.equals("plant")) {
            //TO DO
            //instantiate a Plant object
            Plant plt = new Plant();

            //take name input from user and set the name of the plant obect
            plt.setPlantName(scnr.next());

            //take cost input from user and set the cost of the plant object
            plt.setPlantCost(scnr.next());

            //Add the plant object to the ArrayList myGarden
            
            myGarden.add(plt);
            
            
            
         }
         else if (input.equals("flower")) {
            //TO DO
            //instantiate a Flower object
            Flower flw = new Flower();

            //take name input from user and set the name of the flower obect
            flw.setPlantName(scnr.next());

            //take cost input from user and set the cost of the flower object
            flw.setPlantCost(scnr.next());

            //take input from the usr if flower is annual and set the isAnnual field of flower object
            flw.setPlantType(scnr.nextBoolean());

            //take color input from user and set the color field of the flower object
            flw.setColorOfFlowers(scnr.next());

            //Add the flower object to the ArrayList myGarden
            myGarden.add(flw);

         }
         input = scnr.next();
       }
      
      // TO DO: Call the method PrintArrayList to print myGarden
      printArrayList(myGarden);
      
   }
}
