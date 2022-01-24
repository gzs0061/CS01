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
import java.util.Scanner;
/**
*scanner tool.
*/
 
 
public class TemperatureInfo { 
   /**
   * Main method to interact with user.
   * 
   * @param args - Standard commandline arguments.
   */
   public static void main(String[] args) {
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      Scanner userInput = new Scanner(System.in);
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
   
      Temperatures temps = new Temperatures(tempsList);
   
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, "
             + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            
            case 'P':
               System.out.println(temps);
               break;
         
            case 'E':
               System.out.println("\tDone");
               break;
            
            default:
               System.out.println("\tInvalid choice!");
         }
        
      } while (choice != 'E');

   }

}