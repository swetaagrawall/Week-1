import java.util.Scanner;
public class GenerateIllegalArgumentException
{
	
	//defining method for computing simple interest
	public void generateIllegalArgumentException(String string , int startIndex , int endIndex){
		try{
			string.substring(startIndex,endIndex);
		}catch(NullPointerException e){
			System.out.println("Your startIndex is greater then endIndex");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Index is out of the string length");
		}
		
	}
	
	
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a String ");
		String string=sc.next();
		System.out.print("Enter starting index ");
        int startIndex=sc.nextInt();
		System.out.print("Enter ending index ");
        int endIndex=sc.nextInt();
		
		GenerateIllegalArgumentException cs=new GenerateIllegalArgumentException();
		cs.generateIllegalArgumentException(string,startIndex,endIndex);
		sc.close();
		
	}
}