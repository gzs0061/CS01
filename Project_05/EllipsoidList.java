/**
*Program that creates and calculates ellipsoid.
*
*@author Ella Seaman - CPSC-1210
*@version 06/26/2021
*/
import java.util.ArrayList;
/**
* ArrayList format.
*
*/
import java.text.DecimalFormat;
/**
*Decimal Format tool.
*
*/ 
 
public class EllipsoidList { 
// instance variables
   private String listName;
   private ArrayList<Ellipsoid> eList;

/**
* constructor.
*  
* @param eListIn - brings in eList from private to public
* 
* @param listNameIn - brings listName from private to public
*
*
*
*/
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> eListIn) { 
      listName = listNameIn;
      eList = eListIn;
   }

   /**
   *returns list string.
   *@return the list name.
   */
   
   public String getName() {
      return listName;
   }
   
   /**
   *returns number of ellipsoids.
   *@return number of ellipsoids.
   */
   
   public int numberOfEllipsoids() {
      return eList.size();
   }
   
   /**
   *returns total volume of all ellipsoids in the list.
   *@return total volume of all ellipsoids objects.
   */
   
   public double totalVolume() {
      double total = 0;
   
   
      int index = 0;
      while (index < eList.size()) {
         total += eList.get(index).volume();
         index++;
      }
      
      return total;
   }
   
   /**
   *returns total surface area of all ellipsoids in the list.
   *@return the total surface area for all ellipsoid objects.
   */
   public double totalSurfaceArea() {
      double total = 0;
      
      int index = 0;
      while (index < eList.size()) {
         total += eList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
   *returns average volume of all ellipsoids in the list.
   *@return the average volume for all ellipsoid objects.
   */
   
   public double averageVolume() {
      double total = 0;
      
      int index = 0;
      while (index < eList.size()) {
         total += eList.get(index).volume();
         index++;
      }
      if (index == 0) {
         total = 0;
      }
      else {
         total = total / index;
      }
      return total;
   }
   
   /**
   *returns average surface area of all ellipsoids in the list.
   *@return the average surface area for all ellipsoid objects.
   */
   
   public double averageSurfaceArea() {
      double total = 0;
      
      int index = 0;
      while (index < eList.size()) {
         total += eList.get(index).surfaceArea();
         index++;
      }
      if (index == 0) {
         total = 0;
      }
      else {
         total = total / index;
      }
      return total;
   }
   /**
   *gets a summary of the ellipsoid in the list.
   *@return summaryInfo
   */
   public String toString() {
      String result = getName() + "\n";
      int index = 0;
      while (index < eList.size()) {
         result += "\n" + eList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
   /**
   *gets a summary of the ellipsoid in the list.
   *@return summaryInfo
   */

   public String summaryInfo() {
      DecimalFormat decFt = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----\n";
      result += "Number of Ellipsoid Objects: " + numberOfEllipsoids() + "\n";
      result += "Total Volume: " + decFt.format(totalVolume())
         + " cubic units" + "\n";
      result += "Total Surface Area: " + decFt.format(totalSurfaceArea())
         + " square units" + "\n";
      result += "Average Volume: " + decFt.format(averageVolume())
         + " cubic units" + "\n";
      result += "Average Surface Area: " + decFt.format(averageSurfaceArea())
         + " square units" + "\n";

      return result;
   }
   
}
