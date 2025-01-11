import java.util.Scanner;
public class SimpleInterest{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   //Taking inputs from users
    System.out.println("Enter principal amount ");
    int principal=sc.nextInt();
	System.out.println("Enter rate");
    int rate=sc.nextInt();
	System.out.println("Enter time");
    int time=sc.nextInt();
	//Calculating SimpleInterest
	double simpleInterest=(double)(principal*rate*time)/100;
	//Printing results=
  System.out.println("The Simple Interest is  "+simpleInterest+" for Principal "+ principal" , Rate of Interest "+rate" and Time "+time);
}
}