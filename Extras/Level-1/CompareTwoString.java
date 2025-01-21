import java.util.Scanner;

public class CompareTwoString{
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        String str1 = "Sweta";
        String str2 = "Agrawal";
        int result = 0;
        int length = Math.min(str1.length(), str2.length());
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                result = -1;
                break;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                result = 1;
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(str1.length(), str2.length());
        }
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
        } else {
            System.out.println("Strings are equal");
        }
    }
}
