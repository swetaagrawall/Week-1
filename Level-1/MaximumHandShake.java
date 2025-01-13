import java.util.Scanner;
public class MaximumHandShake{
	
	//method for calculating handshakes
	public int handshakes(int number){
		int result=number*(number-1)/2;
		return result;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.print("Enter number of students : ");
		int numberOfStudents=sc.nextInt();
		//calling method handshakes
		MaximumHandShake hs=new MaximumHandShake();
		int answer=hs.handshakes(numberOfStudents);
		//printing result
		System.out.println("Number of handshakes would be "+answer+" for "+numberOfStudents+" students.");
		//closing sc
		sc.close();
	}
}