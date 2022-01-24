/**
*Program that calculates temperature values.
*
*@author Ella Seaman - CPSC-1210
*@version 06/29/2021
*/
import java.util.ArrayList;
/**
* ArrayList format.
*
*/
 
 
public class Temperatures { 
// instance variables
   private ArrayList<Integer> temperatures;

   /**
   * constructor.
   * 
   * @param temperaturesIn - brings temperatures from private to public
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   /**
   *returns int value.
   *@return 0 and low value.
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
      
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
         
      }
      return low; 
   }

   /**
   *returns int value.
   *@return 0 value.
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
      
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
         
      }
      return high;
   
   }
   
   /**
   *returns int value.
   *@param lowIn pulls in min temp
   *@return 0 value.
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   
   }
   
   /**
   *returns int value.
   *@param highIn pulls in max temp
   *@return 0 value.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   
   }
   
   /**
   *returns int value.
   *@return "" value.
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   
   }

}