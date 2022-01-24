/**
*Program that allows the user to enter a value 
*in square inches and then displays the combination 
*of acres, square yards, square feet, and square inches 
*so that each value is maximized in order by acres, 
*square yards, square feet, and finally square inches
*
*@author Ella Seaman - CPSC-1210
*@version 06/04/2021
*/
import java.util.Scanner;
/**
*Scanner for user input.
*
*/
 
public class SquareUnits {
/**
*Prints input, and contains conversions.
*
*@param args Command line arguments (not used).
*/
   public static void main(String[] args) { 
      //variables
      Scanner userInput = new Scanner(System.in);
      int inches = 0;
      int acres = 0;
      int yards = 0; 
      int feet = 0;
      
      
      //Prompt the user for square inches:
      System.out.print("Enter the area in square inches: ");
      inches = userInput.nextInt();
      
      if (inches > 1000000000) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      } else {
         acres = (int) inches / 6272640;
         inches = inches % 6272640;
         yards = (int) inches / 1296;
         inches = inches % 1296;
         feet = (int) inches / 144;
         inches = inches % 144;
         System.out.println("Number of Units: ");
         System.out.println("\tAcres: " + acres);
         System.out.println("\tSquare Yards: " + yards);
         System.out.println("\tSquare Feet: " + feet);
         System.out.println("\tSquare Inches: " + inches);
   
      }
   }
}