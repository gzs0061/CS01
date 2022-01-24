/**
*Program that allows the user to enter a value 
*and performs equation on input and returns computed result.
*
*@author Ella Seaman - CPSC-1210
*@version 06/12/2021
*/
import java.util.Scanner;
/**
*Scanner for user input.
*
*/
import java.text.DecimalFormat;
/**
*Decimal Format tool.
*
*/
 
public class Solver {
/**
*Prints input, and contains calculations.
*
*@param args Command line arguments (not used).
*/
   public static void main(String[] args) { 
      //variables
      Scanner userInput = new Scanner(System.in);
      double x = 0;
        
      
      
      //Prompt the user for number for x:
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //Computes:
   
      double squareRoot = Math.sqrt(Math.abs((11 * Math.pow(x, 4)) 
                    + (9 * Math.pow(x, 3)) + (7 * Math.pow(x, 2)) 
                    + (5 * x) + 4));
      double resultDouble = squareRoot / (2 * x + 4);
      
      //Convert to string
      String result = Double.toString(resultDouble);
      
      //Printed string
      System.out.println("Result: " + result);
      
      //Locate decimal
      int position = result.indexOf(".");
      
      System.out.println("# of characters to left of decimal point: " 
                        + (result.substring(0, position)).length());
      System.out.println("# of characters to right of decimal point: " 
                        + (result.substring(position 
                        + 1, result.length())).length());
      
      // Formatted results
    
      DecimalFormat df = new DecimalFormat("###,##0.0####");
      System.out.println("Formatted Result: " + df.format(resultDouble));
   }
         
      
      
}


