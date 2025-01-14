import java.util.Scanner;
public class GenerateNumberFormatException
{
	
	//defining method for computing simple interest
	public void generateNumberFormatException(String string ){
		int number;
		try{
			number=Integer.parseInt(string);
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException is occured and catched");
		}
		
	}
	
	
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a String ");
		String string=sc.next();
		
		
		GenerateNumberFormatException cs=new GenerateNumberFormatException();
		cs.generateNumberFormatException(string);
		sc.close();
		
	}
}