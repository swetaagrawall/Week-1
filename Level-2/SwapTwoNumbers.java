import java.util.Scanner;
public class SwapTwoNumbers{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter the first Number ");
    int number1=sc.nextInt();
	System.out.println("Enter the second Number");
    int number2=sc.nextInt();
	//Swapping the number
	number1=number2;
	number2=number1;
	//Printing results
     System.out.println("The swapped numbers are  "+(number1)+" and "+ (number2));
}
}

