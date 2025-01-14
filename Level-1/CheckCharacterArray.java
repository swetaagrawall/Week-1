import java.util.Scanner;
public class CheckCharacterArray{
	
	//defining method for computing simple interest
	public char[] checkCharacterArray(String string){
		char charArray[]= new char[string.length()];
		for(int i=0; i<charArray.length; i++){
			 charArray[i]=string.charAt(i);
		}
		return charArray;
	}
	
	public boolean compare(char result[] , char result1[]){
		boolean ans=true;
		if(result.length != result1.length) return false;
		for(int i=0;i<result.length;i++)
		{
			if(result[i]!=result1[i])
				return false;
		}
		
		return ans;
	}
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a String ");
		String string=sc.next();
		
		
		char result[] = string.toCharArray();


		CheckCharacterArray cs=new CheckCharacterArray();
		char result1[]=cs.checkCharacterArray(string);
		boolean ans=cs.compare(result,result1);
		
		
		System.out.println("character of string compared by both methods are same ? "+ans); 

		
		sc.close();
	}
}