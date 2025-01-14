import java.util.Scanner;
public class GenerateNullPointerException
{
	
	//defining method for computing simple interest
	public void generateNullPointerException(String string){
		try{
			string.charAt(1);
		}catch(NullPointerException e){
			System.out.println("Exception handled");
		}
		
	}
	
	
	
	//main() method
	public static void main(String[]args){
		
		String string=null;
		
		GenerateNullPointerException cs=new GenerateNullPointerException();
		cs.generateNullPointerException(string);
		
		
	}
}