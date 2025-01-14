import java.util.Scanner;
public class GenerateStringIndexOutOfBoundsException
{
	
	//defining method for computing simple interest
	public void generateStringIndexOutOfBoundsException(String string){
		try{
			string.charAt(string.length()+1);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException is occured and handled");
		}
		
	}
	
	
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a String ");
		String string=sc.next();
		
		GenerateStringIndexOutOfBoundsException cs=new GenerateStringIndexOutOfBoundsException();
		cs.generateStringIndexOutOfBoundsException(string);
		
		sc.close();
	}
}