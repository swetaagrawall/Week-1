import java.util.Scanner;
public class DistanceInYardsAndMiles{
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
      //taking inputs from user
      System.out.println("Enter distance in feets ");
       double distanceInFeets=sc.nextInt();
      //Converting into yards and miles
       double distanceInYards=distanceInFeets/3;
       double distanceInMiles=distanceInYards/1760;
      //Printing output
       System.out.println("The distance in yard is "+(distanceInYards)+" and distance in miles is " + (distanceInMiles));
       
     
   }
}