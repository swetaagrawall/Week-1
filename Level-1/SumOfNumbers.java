import java.util.Scanner;
public class SumOfNumbers{
     public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   double total=0.0d;
   //Taking inputs from users and printing result
    System.out.println("Enter a number ");
     double number=sc.nextDouble();
	while(number!=0){
			total+=number;
			System.out.println("Enter a number ");
            number=sc.nextDouble();
	
	}
//Printing the output	
	System.out.println("The total value is " +total);		
}
}