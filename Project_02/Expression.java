/**
*Program to find the result of a specified 
*expression after reading input values for x and y 
*
*@author Ella Seaman - CPSC-1210
*@version 06/04/2021
*/
import java.util.Scanner;
/**
*Scanner for user input.
*
*/
 
public class Expression {
/**
*Prints input, and contains calculations.
*
*@param args Command line arguments (not used).
*/
   public static void main(String[] args) { 
      //variables
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      
      //Prints equation:
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
      //Prompt the user for their number for x:
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      //Prompt the user for their number for y:
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      
      //Compute:
      System.out.print("result ");
      
      if (x == 0 || y == 0) {
         System.out.println("is \"undefined\"");
      }
      else
      {
         double result = (10 * x + 32.6) * (5 * y - 1.567) / (x * y);
         System.out.println("= " + result);
      }
   }
   
}
      

   
