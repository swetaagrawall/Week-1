import java.util.Scanner;
public class TotalPrice{
   public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
      //taking inputs from user
      System.out.println("Enter unit price of one item ");
       int unitPrice=sc.nextInt();
       System.out.println("Enter the number of item you bought ");
       int quantity=sc.nextInt();
      //Calculating the total amount
        int totalAmount = unitPrice*quantity;
     
      //Printing output
       System.out.println("The total purchase price is INR  "+(totalAmount)+" if the quantity is " + (quantity) +" unit price is INR " + (unitPrice));
       
     
   }
}