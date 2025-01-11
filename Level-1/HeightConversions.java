import java.util.Scanner;
public class HeightConversions{
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
      //taking inputs from user
      System.out.println("Enter your height in centimeters");
       int heightInCentimeters=sc.nextInt();
      //Coverting heights into inches and feet
       double heightInFeet=heightInCentimeters/2.54;
       double heightInInces= heightInFeet/12;
      //Printing output
       System.out.println("Your heightin cm is "+(heightInCentimeters)+" while in feet is " + (heightInFeet)+" and in inches is " + (heightInInces) + ".");
       
     
   }

}
