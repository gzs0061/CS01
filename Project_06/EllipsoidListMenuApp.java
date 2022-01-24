/**
*Program that creates and calculates ellipsoid.
*
*@author Ella Seaman - CPSC-1210
*@version 06/26/2021
*/
//import java.io.File;
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
 
public class EllipsoidListMenuApp {

   /**
   * Checks Ellipsoid files.
   * @param args - Standard commandline arguments.
 	* @throws FileNotFoundException if file not found.
   */
   public static void main(String[] args) throws FileNotFoundException {
      String eListName = "no list name";
      String fileName = "no file name";
      String label = "";
      double a, b, c;
      String code = "";
      ArrayList<Ellipsoid> eListNew = new ArrayList<Ellipsoid>();
      EllipsoidList myEList = new EllipsoidList(eListName, eListNew);
        
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Ellipsoid List System Menu");
      System.out.println("R - Read File and Create Ellipsoid List");
      System.out.println("P - Print Ellipsoid List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Ellipsoid");
      System.out.println("D - Delete Ellipsoid");
      System.out.println("F - Find Ellipsoid");
      System.out.println("E - Edit Ellipsoid");
      System.out.println("Q - Quit");
      

      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': // Read in File and Create EllipsoidList
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
            
               myEList = myEList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Ellipsoid List created\n");
               break; 
         
         
            case 'P': // Print EllipsoidList
               System.out.println(myEList);
               break;
         
            case 'S': // Print Summary Info
               System.out.println("\n" + myEList.summaryInfo());
               break;
               
         
            case 'A': // Add Ellipsoid Object
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               System.out.print("\ta: ");
               a = Double.parseDouble(scan.nextLine());
               System.out.print("\tb: ");
               b = Double.parseDouble(scan.nextLine());
               System.out.print("\tc: ");
               c = Double.parseDouble(scan.nextLine());
            
               myEList.addEllipsoid(label, a, b, c);
               System.out.println("\t*** Ellipsoid added ***\n");
               break; 
         
         
            case 'D': // Delete Ellipsoid Object
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               Ellipsoid eL = myEList.deleteEllipsoid(label);
               if (eL != null)
               {
               System.out.println("\t" + "\"" + eL.getLabel()
                  + "\"" + " deleted");
                  }
                  else
                  {
                  System.out.println("\t\"" + label + "\"" + " not found");
                  }   
            
               continue; 
         
           
            case 'F': 
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               Ellipsoid  e = myEList.findEllipsoid(label);
               if (e != null) {
                  System.out.println("Ellipsoid " + e.getLabel());
                  
                  System.out.println(e + "\n");
                  
               }
               else {
                  System.out.println("\t\"" + label + "\"" + " not found");
               }
               continue;
            
           
            case 'E': 
               System.out.print("\tlabel: ");
               label = scan.nextLine();
               System.out.print("\ta: ");
               a = scan.nextDouble();
               System.out.print("\tb: ");
               b = scan.nextDouble();
               System.out.print("\tc: ");
               c = scan.nextDouble();
               Ellipsoid ell = myEList.editEllipsoid(label, a, b, c);
               if (ell != null)
               {
                  System.out.println("\t" + ell.getLabel() 
                     + " successfuly edited");
               }
               else
               {
                  System.out.println("\t\"" + label + "\"" + " not found");
               }
               continue;
            
             
                  
            case 'Q': // Quit
               break;
               
            default:  // no match, loop again
               System.out.println("\t*** invalid code ***" + "\n");
               break; 
         }
      } while (!code.equalsIgnoreCase("Q"));

      

      
      

   }

  
      
}
  



