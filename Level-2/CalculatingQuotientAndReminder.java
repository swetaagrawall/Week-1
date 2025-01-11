import java.util.Scanner;
public class CalculatingQuotientAndReminder{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter first num ");
       int number1=sc.nextInt();
	   System.out.println("Enter second num ");
       int number2=sc.nextInt();
	  //Calculating their quotient and reminder
	  int quotient=number1/number2 ;
	  int reminder=number1%number2 ;
	  //Printing their quotient and reminder
       System.out.println("The Quotient is "+(quotient)+" and Reminder is " + (reminder)+" of two number " + (number1) + " and " + (number2) );
	   
	  
   }
}