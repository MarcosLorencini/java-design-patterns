package javaDesignPatterns.template.method.one;

/**
 * Class of social network
 */

public class Facebook extends Network {

 public Facebook(String userName, String password) {
   this.userName = userName;
   this.password = password;
 }


 @Override
 boolean logIn(String userName, String password) {
  System.out.println("\nChecking user's parameters");
  System.out.println("Name: " + this.userName);
  System.out.println("Password: ");
  for (int i = 0; i< this.password.length(); i++) {
   System.out.println("*");
  }
  simulateNetworkLatency();
  System.out.println("\n\nLogin success on Facebook");
  return true;
 }

 @Override
 boolean sendData(byte[] data) {
  boolean messagePosted = true;
  if(messagePosted) {
   System.out.println("Message: '" + new String(data) + "' was posted on Facebook" );
   return true;
  } else {
   return false;
  }
 }

 @Override
 void logOut() {
  System.out.println("User: '" + userName + "' was logged out from Facebook");

 }

 private void simulateNetworkLatency() {
  try {
       int i = 0;
       System.out.println();
       while (i < 10) {
        System.out.println(".");
        Thread.sleep(500);
        i++;
       }
  } catch (InterruptedException ex) {
      ex.printStackTrace();
  }
 }


}
