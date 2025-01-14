import java.util.Scanner;
public class CheckEquals{
	
	//defining method for computing simple interest
	public boolean checkEquals(String string1 , String string2){
		boolean result=true;
		if(string1.length() != string2.length()) return false;
		for(int i=0 ; i<string1.length() ; i++){
			if(string1.charAt(i)!=string2.charAt(i)){
				result=false;
			}
		}
		return true;
	}
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter first String ");
		String string1=sc.next();
		System.out.print("Enter second String ");
		String string2=sc.next();
		boolean result1=string1.equals(string2);
		CheckEquals ce= new CheckEquals();
		boolean result=ce.checkEquals(string1 , string2);
		
		//printing result
		if(result==result1){
		System.out.println("The result we got from user-defined method and built in methods are same");
		}else{
		System.out.println("The result we got from user-defined method and built in methods are different");

		}
		sc.close();
	}
}