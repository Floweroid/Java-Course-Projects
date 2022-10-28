import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      // declare new scanner; 
      Scanner scnr = new Scanner(System.in);

      // declare inputs valuables;
      char chr;
      String str;
      String outPut;
      int times = 0;
      int len = 0;

      // get inputs;
      chr = scnr.next().charAt(0);
      str = scnr.nextLine();
      

      // find the charnum

      while ( len != str.length() - 1 ) {
         times += (chr == str.charAt(len)) ? 1 : 0; 
         // times += (true) ? 1 : 0; 
         len+=1;
         // System.out.println("len:"+len);
      };
      
      outPut = (times == 1) ? chr+"" : chr + "'s";

      // System.out.println( chr );
      // System.out.println( str + str.length() );

      System.out.println(times + " " + outPut);
      
   }
}
