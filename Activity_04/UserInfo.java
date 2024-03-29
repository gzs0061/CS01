/**
*Program that documents information about user.
*
*@author Ella Seaman - CPSC-1210
*@version 06/16/2021
*/
 
public class UserInfo {


// instance variables
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;

   /**
   * constructor.
   *  
   * @param firstNameIn - set default firstName
   * 
   * @param lastNameIn - set default lastName
   *
   *
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }

/**
* method
* Prints user information.
*
* @return returns output.
*/
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      } 
      else {
         output += "Online";
      }
      
      return output;
   }
   
   /** location input for user.
   * 
   * @param locationIn - sets location
   * 
   */
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   *Sets age of user.
   * @param ageIn = age 
   * @return returns if age is valid
   */
   
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
   *Sets age of user.
   * 
   * @return returns age
   */
   public int getAge() {
      return age;
      
   }
   /**
   *Sets user location.
   * 
   * @return returns location
   */
   public String getLocation() {
   
      return location;
      
   }
   /**
   *Sets user status offline.
   * 
   */
   public void logOff() {
      status = OFFLINE;
      
   }
   /**
   *Sets user status online.
   * 
   */
   public void logOn() {
      status = ONLINE;
   
   }
   
   
   
}
   