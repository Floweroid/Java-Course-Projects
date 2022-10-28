import java.util.Scanner;
/**********************************************************************
 * Class purpose: Produce Star patterns demonstrating nested loops
 *
 * @author  Zekai Lin
 * @version V2 07/09/2022
 *********************************************************************/

public class Stars
{
   /******************************************************************
    * Function purpose:  Prints star pattern
    *
    * @param args Command line arguments, ignored
    *****************************************************************/

   public static void main (String[] args)
   {
      char     hiPattern;  // pattern count
      int      maxRows;    // maximum number of rows to print
      int      starCnt;    // Stars per row
      int      blnkCnt;    // Blanks preceding the stars
      Scanner  stdIn;      // standard input

      stdIn = new Scanner(System.in);
      System.out.print("Enter positive number for the number of rows: ");
      
      maxRows = stdIn.nextInt();

      //**************************************************
      // First Example, stars per row goes from 1 to maxRow
      //**************************************************
      System.out.println();
      System.out.println("GIVEN example\n");
      for (int row = 1; row <= maxRows; row++)
      {
         starCnt = row;
         for (int star = 1; star <= starCnt; star++)
         {
            System.out.print ("*");
         }
         System.out.println();
      }

      //*******************************************************
      // Insert code for patterns (A), (B), (C) below.
      //*******************************************************

      //*******************************************************
      // Patterns (A)
      //*******************************************************
      System.out.println();
      System.out.println("Pattern A\n");
      for (int row = 1; row <= maxRows; row++)
      {
         for (int star = maxRows-row; star >= 0; star--)
         {
            System.out.print ("*");
         }
         System.out.println();
      }

      //*******************************************************
      // Patterns (B)
      //*******************************************************
      System.out.println();
      System.out.println("Pattern B\n");
      for (int row = 1; row <= maxRows; row++)
      {
         for (int blnk = maxRows-row-1; blnk >= 0; blnk--)
         {
            System.out.print (" ");
         }
         starCnt = row;
         for (int star = row-1; star >= 0; star--)
         {
            System.out.print ("*");
         }
         System.out.println();
      }

      //*******************************************************
      // Patterns (C)
      //*******************************************************
      System.out.println();
      System.out.println("Pattern C\n");
      for (int row = 1; row <= maxRows; row++)
      {
         for (int blnk = row-1; blnk > 0; blnk--)
         {
            System.out.print (" ");
         }
         starCnt = row;
         for (int star = maxRows-row; star >= 0; star--)
         {
            System.out.print ("*");
         }
         System.out.println();
      }
      System.out.println();
      stdIn.close();
   }
}
