/**
*Program that creates and calculates ellipsoid.
*
*@author Ella Seaman - CPSC-1210
*@version 06/20/2021
*/
import java.util.Scanner;
/**
*Scanner for user input.
*
*/
public class EllipsoidAppTest {
   /** Prints prompt for user input run calculation.
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
      Ellipsoid ellipsoid = new Ellipsoid("", 0, 0, 0);
      Scanner input = new Scanner(System.in);
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      String label = input.nextLine();
      System.out.print("\ta: ");
      double a  = Double.parseDouble(input.next());
      if (!ellipsoid.setA(a)) {
         System.out.println("Error: axis value must be positive.");
      } else {
         System.out.print("\tb: ");
         double b =  Double.parseDouble(input.next());
      if (!ellipsoid.setB(b))
      {
         System.out.println("Error: axis value must be positive.");
      } else {
         System.out.print("\tc: ");
         double c =  Double.parseDouble(input.next());
      if (!ellipsoid.setC(c))
      {
         System.out.println("Error: axis value must be positive.");
      } else {
         ellipsoid = new Ellipsoid(label, a, b, c);

         System.out.println("\n" + ellipsoid);
   }   
}  

}

} 

}    