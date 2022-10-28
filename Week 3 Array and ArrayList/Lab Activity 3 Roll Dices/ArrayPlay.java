/**
  * working with arrays including initializing, printing, manipulating entries,dies, and two arrays
  *
  * @author Zekai Lin
  * @version - 10/09/2022
  */
  
public class ArrayPlay {
    public static void main(String[] args) {

        // declare the arraylist of integers that is 6 elements long
        int[] array = new int[6]; 
        
        // Initialize all array value to -1. by for loop
        array = setArrVal(array, -1);

        // update the values
        for ( int i = 0 ; i < array.length; ++i) {
          array[i]=i;
          // Optional Print
        }

        // Optional Print.
        prtArr(array);

        // Assign all value to zero
        array = setArrVal(array, 0);
        
        // Part 3.
        // roll the dice and print the output
        rollDice ();

        // Part 4.
        // declare arrays
        double[] arr1;
        double[] arr2;

        // initialize the arrs
        arr1 = douArr1();
        arr2 = new double[12];
        
        // print the part 4 output
        prtArrs(arr1, arr2);
            
    }

    // set value of arr
    static int[] setArrVal ( int[] arr, int n) {
      for ( int i = 0 ; i < arr.length; ++i) {
        arr[i]=n;
        // Optional Print
      }
      prtArr(arr);
      return arr;
    }

    // print the value of arr
    static void prtArrVal (int i, int n) {
      System.out.println( "array[" + i + "]: " + n);
    }

    // call the prtArrVal to print output with a for loop.
    static void prtArr (int[] arr){
      for ( int i = 0 ; i < arr.length; ++i) {
        prtArrVal (i, arr[i]);
      }
      System.out.println();
    }
    
      // return int[] of result of roll dice
    static void rollDice (){
      
      // Create a new Die object. 
      Die dice = new Die();
      int[] faceCnt = new int[6];

      // Create a loop that will iterate 100 times
      for (int i = 0; i < 100; i++ ) {
        int face = dice.roll();
        faceCnt[face-1]++;
      }

      // Print the count
      prtRolls(faceCnt);

      System.out.println();
    }

    static void prtRolls (int[] arr) {

      for ( int i = 0 ; i < arr.length; i++) {
        int pt = i+1; 
        System.out.println(pt + " was rolled " + arr[i] + "times");
      }
    }

    // create one double arr for Part4.
    static double[] douArr1 () {
      // declare two double

      double[] arr;

      // initialize the array one
      arr = new double[10];

      for (int i = 0 ; i < arr.length ; i++)  {
        arr[i] = i*1.1;
      }
      return arr;
    };

    // print the value of arr
    static void prtArrVal (int i, double[] arr) {

      // Check if out of arr length
      if ( i < arr.length) {
        System.out.printf( "array[" + i + "]:" + "%,.1f" + "\t\t", arr[i]);
      }
      else {
        System.out.print("\t\t\t");
      }
      
    }

    static void prtArrs (double[] arr1, double[] arr2){

      // find the max length by compare length of arr1 and arr2
      int maxRows = (arr1.length > arr2.length ? arr1.length:arr2.length);
      
      // print the header
      System.out.println("Array One: \t\tArray two:");

      // print the content of arrs
      for ( int i = 0 ; i < maxRows; ++i) {
        prtArrVal (i, arr1);
        prtArrVal (i, arr2);
        System.out.println();
      }
      System.out.println();
    }
}
