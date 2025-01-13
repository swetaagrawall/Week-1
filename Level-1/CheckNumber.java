import java.util.Scanner;
public class CheckNumber{
	//defining method to chcek number
	public int checkNumber(int number){
		if(number>0) //positive
		return 1;
		if(number<0) //negative
		return -1;
		else		 //zero
	
		return 0;
	}
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		CheckNumber c=new CheckNumber();
		int ans=c.checkNumber(number);
		//printing the output
		if(ans==-1)
		System.out.println("Number "+number+" is negative.");
		else if(ans==1)
		System.out.println("Number "+number+" is positive.");
		else
		System.out.println("Number "+number+" is zero.");
		sc.close();
	}
}
		
		