import java.util.Scanner;
public class SideOfSquare{
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
      //taking inputs from user
      System.out.println("Enter perimeter of square ");
       int perimeter=sc.nextInt();
      //Calculating side of square
       int side=perimeter/4;
     
      //Printing output
       System.out.println("The length of the side is "+(side)+" whose perimeter is " + (perimeter));
   }
}