import java.util.Scanner;
public class TotalIncome{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter the salary");
    int salary=sc.nextInt();
	System.out.println("Enter the bonus");
    int bonus=sc.nextInt();
	//calculating total Income
	int totalIncome  = salary+bonus ;
	//Printing results
     System.out.println("The salary is INR "+(salary)+" and bonus is INR "+ (bonus) + " . Hence Total Income is INR "+(totalIncome));
}
}