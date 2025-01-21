import java.util.Scanner;

public class PalindromeChecker{
	 public boolean isPalindrome(String string) {
        String string2="";
		for(int i=string.length()-1 ;i>=0;i--){
			string2+=string.charAt(i);
		}
		if(string.equals(string2)) return true;
		return false;
    }
	void displayResult(boolean ans , String string){
		if (ans) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
	}
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = sc.nextLine();
        PalindromeChecker pc= new PalindromeChecker();
		boolean ans=pc.isPalindrome(string);
		pc.displayResult(ans, string);
    }

   
}
