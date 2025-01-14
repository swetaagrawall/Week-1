import java.util.Scanner;
public class CheckSubString{
	
	//defining method for computing simple interest
	public  String checkSubString(String str , int startIndex , int endIndex){
		String substring="";
		for(int i=startIndex ; i<endIndex; i++){
			 substring+=str.charAt(i);
		}
		return substring;
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
		System.out.print("Enter a String ");
		String str=sc.next();
		System.out.print("Enter starting index ");
        int startIndex=sc.nextInt();
		System.out.print("Enter ending index ");
        int endIndex=sc.nextInt();
		
		String result1 = str.substring(startIndex,endIndex);


		CheckSubString cs=new CheckSubString();
		String result=cs.checkSubString(str ,startIndex, endIndex);
		System.out.println("The substring got from built-in method is "+result);
		System.out.println("The substring got from built-in method is "+result1);
		
		
		boolean ans=cs.compare(result, result1);
		System.out.println("Substring compared by both methods are same ? "+ans); 

		
		sc.close();
	}
}