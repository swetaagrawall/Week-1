public class DuplicateInString{
 public static void main(String[] args) {
	   String string ="SwetaKumariAgrawal";
       String ans = "";
        for (int i = 0; i < string.length(); i++) {
            if (ans.toLowerCase().indexOf(string.toLowerCase().charAt(i)) == -1) {
                ans += string.charAt(i);
            }
        }
		System.out.println("The string after removing duplicate is "+ans);
 }
} 