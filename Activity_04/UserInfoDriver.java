/**
*Program that documents information about user.
*
*@author Ella Seaman - CPSC-1210
*@version 06/16/2021
*/
 
public class UserInfoDriver {

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
   * @return - return names
   *
   */
   public String userInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      
      return firstName + lastName;
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
   
   /** Prints user information for users 1 & 2.user.
   *  
   * @param args Command line arguments (not used).
   *
   */
   public static void main(String[] args) {

      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
   
   
}