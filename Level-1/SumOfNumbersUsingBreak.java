import java.util.Scanner;
public class SumOfNumbersUsingBreak{
   public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   double total=0.0d;
   //Taking inputs from users and printing result
	while(true){
		 System.out.println("Enter a number ");
         double number=sc.nextDouble();
	     if(number>=1){
			 total+=number;
			 
		 }else{
			 break;
		 }
	
	}
//Printing the output	
	System.out.println("The total value is " +total);		
}
}