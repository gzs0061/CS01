/**
*Program that displays someone’s name, age, and gender, along with
*calculations for age in minutes and centuries as well as 
*max heart rate based on age and gender. 
*
*@author Ella Seaman
*@version 06/02/2021
*/
import java.util.Scanner;
/**
*Scanner for user input.
*
*/
 
public class AgeStatistics {
/**
*Prints person's name, age gender, and contains calculations.
*
*@param args Command line arguments (not used).
*/
   public static void main(String[] args) { 
      //variables
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for the gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt(); 
      
      //Convert age:
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");     
      
      //Display max heart rate:
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
         System.out.println(maxHeartRate + " beats per minute.");
      }
      else { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
         System.out.println(maxHeartRate + " beats per minute.");
      }
      
   }
   
}