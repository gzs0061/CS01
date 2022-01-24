/**
*Program that creates and calculates ellipsoid.
*
*@author Ella Seaman - CPSC-1210
*@version 06/26/2021
*/
import java.io.File;
/**
*file tools.
*
*/ 
import java.io.FileNotFoundException;
/**
*file tools.
*
*/ 
import java.util.ArrayList;
/**
* ArrayList format.
*
*/
import java.util.Scanner;
/**
*scanner tool.
*/
 
public class EllipsoidListApp {

   /**
   * Checks Ellipsoid files.
   * @param args - Standard commandline arguments.
 	* @throws FileNotFoundException if file not found.
   */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String filename = keyboard.nextLine();
      keyboard.close();
      System.out.println();

      ArrayList<Ellipsoid> elist = new ArrayList<Ellipsoid>();
   
      Scanner infile = new Scanner(new File(filename));
   
      String name = infile.nextLine();
   
      while (infile.hasNext()) {
         String ename = infile.nextLine();
         double a = infile.nextDouble();
         double b = infile.nextDouble();
         double c = infile.nextDouble();
         if (infile.hasNext()) { 
            infile.nextLine();
            
         }
         elist.add(new Ellipsoid(ename, a, b, c));
      }
      infile.close();
         
         
      //object
      EllipsoidList app = new EllipsoidList(name, elist);
      //print to string
      System.out.println(app.toString());
      System.out.println();
      //summary
      System.out.println(app.summaryInfo());
      
   }
}
  



