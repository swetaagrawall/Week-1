import java.util.Scanner;

public class Togglecase{
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        String string = "swetaSWETA";
		String result="";
		for(int i=0;i<string.length();i++){
			if(Character.isUpperCase(string.charAt(i))){
				result+=Character.toLowerCase(string.charAt(i));
			}else if(Character.isLowerCase(string.charAt(i))){
				result+=Character.toUpperCase(string.charAt(i));
			}else{
				result+=string.charAt(i);
			}
		}
        
        System.out.println("Toggles string is " + result);
    }

}