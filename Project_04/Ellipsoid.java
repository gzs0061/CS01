/**
*Program that creates and calculates ellipsoid.
*
*@author Ella Seaman - CPSC-1210
*@version 06/20/2021
*/
import java.text.DecimalFormat;
/**
*Decimal Format tool.
*
*/ 
 
public class Ellipsoid { 
// instance variables
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   
   /**
   * constructor.
   *  
   * @param labelIn - brings label string
   * 
   * @param aIn - a double called.
   *
   * @param bIn - b double called.
   *
   * @param cIn - c double called.
   *
   *
   */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) { 
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }
   
   /**
   * method
   * getLabel
   * Returns label string.
   *
   * @return labelIn for label.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * setLabel
   * trims label string.
   * 
   * @param labelIn to trim label.
   *
   * @return returns trimmed label and true or false.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) { // trimmed
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   
   /**
   * 
   * gets a and returns a.
   * @return returns a;
   */
   
   public double getA() {
      return a;
   }
   
   /**
   * 
   * sets a and returns true or false.
   * @param aIn to check if valid.
   * @return if a>0 return true.
   */
   
   public boolean setA(double aIn) {
      if (aIn > 0) {
         a = aIn;
         return true;
      } else {
         return false;
      }
   }
   /**
   * getB gets and returns b.
   *
   * @return returns b;
   */
   
   public double getB() {
      return b;
   }
   
   /**
   * setB returns if b is valid.
   * @param bIn checks if b is valid or not.
   * @return if b>0 return true.
   */
   
   public boolean setB(double bIn) {
      if (bIn > 0) {
         b = bIn;
         return true;
      } else {
         return false;
      }
      
   }   
   /**
   * getC gets and returns c.
   *
   * @return returns c;
   */
   
   public double getC() {
      return c;
   }
   
   /**
   * setC sets and returns c if valid.
   * @param cIn to validate c.
   * @return if c>0 return true.
   */
   
   public boolean setC(double cIn) {
      if (cIn > 0) {
         c = cIn;
         return true;
      } else {
         return false;
      }
   
   }
   
   /**
   * volume calculator. 
   * @return volume calculated
   */
   public double volume() {
      return (4 * Math.PI * a * b * c) / 3;
   }
   
   /**
   * calculates the surface area.
   * @return calculated surfaceArea
   */
   
   public double surfaceArea() {
      double sa = (4 * Math.PI) * Math.pow(((Math.pow((a * b), 1.6) 
            + Math.pow((a * c), 1.6) 
            + Math.pow((b * c), 1.6)) / 3), (1 / 1.6));
      return sa;
   }
   
   /**
   * returns ellipsoid object.
   * @return String representation of ellipsoid.
   */

   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0###");
      return "Ellipsoid \"" + label + "\" with axes a = " 
         + getA() + ", b = " + getB() + ", c = " + getC()
         + " units has:\n\tvolume = " + decimalFormat.format(volume()) 
         + " cubic units" + "\n\tsurface area = " 
         + decimalFormat.format(surfaceArea()) + " square units";
   }
      


}
   
   






