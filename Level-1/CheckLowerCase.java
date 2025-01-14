import java.util.Scanner;
public class CheckLowerCase
{
	
	public String checkLowerCase(String string){
		String result="";
		for(int i=0 ;i<string.length();i++){
			result+=(char)(string.charAt(i)+32);
		}
		return result;
		
	}
	
	public boolean compare(String result , String result1){
		boolean ans=true;
		if(result.length() != result1.length()) return false;
		for(int i=0;i<result.length();i++)
		{
			if(result.charAt(i)!=result1.charAt(i))
				return false;
		}
		
		return ans;
	}
	
	
	//main() method
		public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a String in upper case");
		String string=sc.next();
		
		String result1=string.toLowerCase();
		
		CheckLowerCase cs=new CheckLowerCase();
		String result=cs.checkLowerCase(string);
        System.out.println("The result we got from built-in method is "+result);
		System.out.println("The result we from built-in method is "+result1);
		
		
		boolean ans=cs.compare(result, result1);
		System.out.println("Substring compared by both methods are same ? "+ans); 
		
		sc.close();
	}
}