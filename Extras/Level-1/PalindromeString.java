public class PalindromeString{
 public static void main(String[] args) {
	    String string="Sweta";
		string=string.toLowerCase();
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        if (string.equals(reversedString)) {
            System.out.println("The string "+string+" is a Palindrome");
        } else {
            System.out.println("The string "+string+" is not a Palindrome");
        }
    }

}