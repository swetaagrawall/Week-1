import java.util.Scanner;
public class IntOperation{
   public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);
	  //taking inputs from user
	  System.out.println("Enter value of a ");
       int a=sc.nextInt();
	   System.out.println("Enter value of b ");
       int b=sc.nextInt();
	    System.out.println("Enter value of c ");
       int c=sc.nextInt();
	    System.out.println("Enter value of d ");
       int d=sc.nextInt();
	  //Calculating InitOperations
	  int op1= a + b *c ;
	  int op2=a * b + c ;
	  int op3=c + a / b ;
	  //Printing their quotient and reminder
       System.out.println("The results of Int Operations are "+(op1)+" , " + (op2)+" and " + (op3) );
	   
	  
   }
}
