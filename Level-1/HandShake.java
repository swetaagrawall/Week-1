import java.util.Scanner;
public class HandShake{
	
	//method for calculating handshakes
	public int handshakes(int number){
		int result=number*(number-1)/2;
		return result;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.print("Enter number of students : ");
		int number=sc.nextInt();
		//calling method handshakes
		HandShake hs=new HandShake();
		int answer=hs.handshakes(number);
		//printing result
		System.out.println("Number of handshakes would be "+answer+" for "+number+" students.");
		//closing sc
		sc.close();
	}
}