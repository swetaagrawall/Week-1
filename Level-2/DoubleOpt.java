import java.util.Scanner;
public class DoubleOpt{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter value of a ");
       double a=sc.nextDouble();
	   System.out.println("Enter value of b ");
       double b=sc.nextDouble();
	    System.out.println("Enter value of c ");
       double c=sc.nextDouble();
	    System.out.println("Enter value of d ");
       double d=sc.nextDouble();
	  //Calculating InitOperations
	  double op1= a + b *c ;
	  double op2=a * b + c ;
	  double op3=c + a / b ;
	  //Printing their quotient and reminder
       System.out.println("The results of double Operations are "+(op1)+" , " + (op2)+" and " + (op3) );
	   
	  
   }
}