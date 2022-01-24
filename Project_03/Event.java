/**
*Program that allows the user to enter an event code
*and returns information about event.
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
 
public class Event {
/**
*Prints input, and contains conversions for event information.
*
*@param args Command line arguments (not used).
*/
   public static void main(String[] args) { 
      //variables
      Scanner userInput = new Scanner(System.in);
      String eventCode = "";
      String eventName = "";
      String date = "";
      String time = "";
      double price = 0;
      double discount = 0;
      String section = "";
      String row = "";
      String seat = "";
      String description = "";
      int prizeNumber = 0;
      
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat dfP = new DecimalFormat("#.#'%'");
        
      
      
      //Prompt the user for event code:
      System.out.print("Enter your event code: ");
      eventCode = userInput.nextLine().trim();
      
      if (eventCode.length() < 26) {
         
         System.out.println("");
         System.out.println("Invalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");
      
      } else {
      
         eventName = eventCode.substring(25, eventCode.length());

         date = eventCode.substring(0, 8);

         time = eventCode.substring(8, 12);

         price = Double.parseDouble(eventCode.substring(12, 15) 
               + "." + eventCode.substring(15, 17));

         discount = Double.parseDouble(eventCode.substring(17, 19));

         section = eventCode.substring(19, 21);

         row = eventCode.substring(21, 23);

         seat = eventCode.substring(23, 25);
         
         double cost = price - (price * (discount / 100));
         
         // calculating random number between 1 to 9999

         prizeNumber = (int) (Math.random() * 10000 + 1);
         
         // printing data as per the question
         
         System.out.println("");
         System.out.println("Event: " + eventName +  "   Date: " 
                  + date.substring(0, 2)
                  + "/" + date.substring(2, 4)
                  + "/" + date.substring(4, 8) + "   Time: "
                  + time.substring(0, 2) + ":"
                  + time.substring(2, 4));

         System.out.println("Section: " + section + "   Row: " 
                  + row + "   Seat: " + seat);

         System.out.println("Price: " + df.format(price) 
                  + "   Discount: " + dfP.format(discount)
                  + "   Cost: " + df.format(cost));

         System.out.println("Prize Number: " + prizeNumber);
      
      }
      
   }         
      
      
}