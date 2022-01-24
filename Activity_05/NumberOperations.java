/**
*Program that creates and calculates ellipsoid.
*
*@author Ella Seaman - CPSC-1210
*@version 06/23/2021
*/
//import java.util.ArrayList;
/**
*Array list object.
*
*/ 
 
public class NumberOperations { 
// instance variables
   private int number;
   
   /**
   *Number operations.
   *@param numberIn to make number not hidden
   *
   */
   
   public NumberOperations(int numberIn) {
   
      number = numberIn;
   
   }
   /**
   *Gets value and returns string.
   *@return returns placeholder value.
   */ 
   public int getValue() {
      return number; 
   }
   /**
   *Gets value and returns string.
   *@return output declaring if odd.
   */ 
   public String oddsUnder() {
      String output = "";
      
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
   *Gets value and returns string.
   *@return "" string value.
   */ 
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
   *Gets compareNumber and returns int.
   *@param compareNumber integer.
   *@return "" string value.
   */ 
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
   *Gets value and returns string.
   *@return "" string value.
   */ 
   
   
   public String toString() {
      return number + "";
   }
  
   
   
   
   // constructor.
 
   
}
