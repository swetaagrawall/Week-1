import java.util.Scanner;
public class SumOfNNaturalNum{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter a number ");
    int number=sc.nextInt();
	
	//Checking if the given number is natural num and Calculating sum of natural numbers
    int sum=0;
	if(number>0){
		sum=number*(number+1)/2;
		System.out.println("The sum of " +number+" natural numbers is "+sum);
	}
    else{
		System.out.println("The number "+number+" is not a natural number");
	}		
	
}
}